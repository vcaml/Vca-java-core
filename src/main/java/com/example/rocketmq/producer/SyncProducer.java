package com.example.rocketmq.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.concurrent.TimeUnit;

/**
 * rocket 发送同步消息
 * */
public class SyncProducer {
    public static void main(String[] args) throws MQClientException, MQBrokerException, RemotingException, InterruptedException {
        //创建一个消息生产者 指定组名
        DefaultMQProducer producer = new DefaultMQProducer("vcamlMQProducer1");
        //指定nameserver地址
        producer.setNamesrvAddr("192.168.88.151:9876");
        producer.start();
        //构建消息发送
        Message message = new Message("topic1","tag1","hello I am fine".getBytes());
        //因为同步发送 这里发送就要收到发送结果 如果结果有延迟这里就要同步等待
        SendResult sendResult = producer.send(message);
        System.out.println("消息状态result:"+sendResult + "---消息ID:"+sendResult.getMsgId());

        producer.shutdown();
    }
}
