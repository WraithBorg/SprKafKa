package com.zx.common.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Kafka常量
 */
@Component
public class SprKafkaConst {
    public static String topicSprKa01;
    public static String topicSprKa02;

    @Value("${kafka.topic.myTopicSprKa01}")
    public void setTopicSprKa01(String myTopicSprKa01) {
        topicSprKa01 = myTopicSprKa01;
    }
    @Value("${kafka.topic.myTopicSprKa02}")
    public void setTopicSprKa02(String myTopicSprKa02) {
        topicSprKa02 = myTopicSprKa02;
    }
}
