package com.example.srpingcorerush;

import com.example.srpingcorerush.ioc.TestClass.test1.UserInter;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
public class IocTest {

    @Test
    public void TestBeanFactory(){
        //创建一个bean工厂
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        //创建一个xml读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        //读取这个xml文件
        reader.loadBeanDefinitions("ioc-beans.xml");

        UserInter userInter = (UserInter)factory.getBean("UserInter");

        System.out.println("获取bean工厂中创建的bean"+userInter);

    }

    @Test
    public void TestAPPcontext(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc-beans.xml");
        UserInter userInter = (UserInter)applicationContext.getBean("UserInter");
        System.out.println("获取封装bean工厂-applicationContext中创建的bean"+userInter);

    }

}
