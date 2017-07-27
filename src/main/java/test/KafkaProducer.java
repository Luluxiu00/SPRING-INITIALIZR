package test;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * Created by 326944 on 2017/7/6.
 */
public class KafkaProducer {
    private final Producer<String, String> producer;
    public final static String TOPIC = "test";

    private KafkaProducer() {
        Properties props = new Properties();
        // 此处配置的是kafka的端口
        props.put("metadata.broker.list", "10.224.192.25:9092");
        // 配置value的序列化类
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        // 配置key的序列化类
        props.put("key.serializer.class", "kafka.serializer.StringEncoder");

        props.put("request.required.acks", "-1");

        producer = new Producer<String, String>(new ProducerConfig(props));
    }

    void produce() {
        int messageNo = 1;
        final int COUNT = 20;

        while (messageNo < COUNT) {
            String key = String.valueOf(messageNo);
            String data = "hello kafka message " + key;
            producer.send(new KeyedMessage<String, String>(TOPIC, key, data));
            System.out.println(data);
            messageNo++;
        }
    }

    public static void main(String[] args) {
        new KafkaProducer().produce();
    }
}
