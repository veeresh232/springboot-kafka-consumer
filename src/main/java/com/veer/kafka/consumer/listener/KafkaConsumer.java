package com.veer.kafka.consumer.listener;

import com.veer.kafka.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "mytopic",groupId ="group_id")
    public void consume(String message){
        System.out.println("Consumed message: "+message);
    }

    @KafkaListener(topics = "mytopic_json", groupId = "group_json",containerFactory = "jsonKafkaListenerFactory")
    public void consume(User user){
        System.out.println(user);
    }
}
