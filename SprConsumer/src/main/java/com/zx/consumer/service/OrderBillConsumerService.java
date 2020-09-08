package com.zx.consumer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zx.common.constant.SprKafkaConst;
import com.zx.common.entity.SprOrderBill;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderBillConsumerService {
    private final Logger LOGGER = LoggerFactory.getLogger(OrderBillConsumerService.class);
    private final ObjectMapper objectMapper = new ObjectMapper();


    @KafkaListener(topics = {"${kafka.topic.myTopicSprKa01}"}, groupId = "group1")
    public void consumeMessage(ConsumerRecord<String, String> orderBillRecord) {
        try {
            SprOrderBill sprBook = objectMapper.readValue(orderBillRecord.value(), SprOrderBill.class);
            LOGGER.info("消费者消费topic:{} partition:{}的消息 -> {}", orderBillRecord.topic(), orderBillRecord.partition(), sprBook.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @KafkaListener(topics = {"${kafka.topic.myTopicSprKa02}"}, groupId = "group2")
    public void consumeMessage2(SprOrderBill orderBill) {
        LOGGER.info("消费者消费{}的消息 -> {}", SprKafkaConst.topicSprKa02, orderBill.toString());
    }
}
