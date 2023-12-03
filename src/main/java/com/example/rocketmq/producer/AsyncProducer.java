package com.example.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * rocket 发送异步消息
 * */
public class AsyncProducer {

    public static void main(String[] args) throws MQClientException, MQBrokerException, RemotingException, InterruptedException {
        //创建一个消息生产者 指定组名
        DefaultMQProducer producer = new DefaultMQProducer("vcamlMQProducer1");
        //指定nameserver地址
        producer.setNamesrvAddr("192.168.88.151:9876");
        producer.start();
        //构建消息发送
        Message message = new Message("topic2","tag2","hello I am happy".getBytes());
        //这里的参数类型里面有回调接口 所以是异步发送
        producer.send(message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("异步发送结果："+ sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("异步发送异常："+throwable.getMessage());
            }
        });
        producer.shutdown();
    }

}
