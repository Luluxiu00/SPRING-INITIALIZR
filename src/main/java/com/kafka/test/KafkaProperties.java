package com.kafka.test;

/**
 * Created by 326944 on 2017/7/6.
 */
public interface KafkaProperties {
    final static String zkUrl = "10.224.192.25:2181";
    final static String groupId = "g1";
    final static String topic = "A";
    final static String kafkaServerUrl = "10.224.192.25";
    final static String kafkaServerPort = "9092";
    final static int kafkaProducerBufferSize = 64 * 1024;
    final static int connectionTimeOut = 20000;
    final static int reconnectioninterval = 10000;
    final static String clientId = "SimpleConsumerDemoClient";
}
