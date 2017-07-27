package com.kafka.test;

/**
 * Created by 326944 on 2017/7/6.
 */
public class KafkaConsumerProducerDemo {
    public static void main(String[] args) {
        KafkaProducer producer = new KafkaProducer(KafkaProperties.topic);
        producer.start();

        KafkaConsumer consumer = new KafkaConsumer(KafkaProperties.topic);
        consumer.start();
    }
}
