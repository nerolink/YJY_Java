package com.example.resource_library.util;

import com.example.resource_library.constant.APPConstant;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import java.util.List;



/**
 * Created by JJY on 2016/8/21.
 */
public class MQTTClientInstance {
    private MQTTClientInstance() {
    }

    private static MqttClient mqttClientInstance = null;
    private static MqttConnectOptions options;

    //静态工厂方法
    public static synchronized MqttClient getInstance() {
        try {
            if (mqttClientInstance == null) {
                mqttClientInstance = new MqttClient(APPConstant.MQTTHOST, MqttClient.generateClientId(),
                        new MemoryPersistence());
            }
            options = new MqttConnectOptions();
            //设置是否清空session,这里如果设置为false表示服务器会保留客户端的连接记录，这里设置为true表示每次连接到服务器都以新的身份连接
            options.setCleanSession(true);
            //设置连接的用户名
            options.setUserName(APPConstant.MQTTUSERNAME);
            //设置连接的密码
            options.setPassword(APPConstant.MQTTPASSWORD.toCharArray());
            // 设置超时时间 单位为秒
            options.setConnectionTimeout(10);
            // 设置会话心跳时间 单位为秒 服务器会每隔1.5*20秒的时间向客户端发送个消息判断客户端是否在线，但这个方法并没有重连的机制
            options.setKeepAliveInterval(20);
            return mqttClientInstance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void SendMessage(String content, String Mytopic) {
        MqttTopic topic = getInstance().getTopic(Mytopic);
        MqttMessage message = new MqttMessage();
        message.setQos(1);
        message.setRetained(false);
        message.setPayload(content.getBytes());
        try {
            MqttDeliveryToken token = topic.publish(message);
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public static void SendMessage(String content, List<String> topiclist) {
        for (int i = 0; i < topiclist.size(); i++)
            SendMessage(content, topiclist.get(i));
    }

    public static void SendMessage(String content, String[] topicarr) {
        for (int i = 0; i < topicarr.length; i++)
            SendMessage(content, topicarr[i]);
    }

    public static MqttConnectOptions getOptions() {
        return options;
    }


}
