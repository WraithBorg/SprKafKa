package com.zx.common.config;

import com.zx.common.constant.SprKafkaConst;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

/**
 * Kafka 
 * 创建topic 添加消息传换器
 */
@Configuration
public class SprKafKaConfig {

    @Bean
    public RecordMessageConverter jsonConvert() {
        return new StringJsonMessageConverter();
    }

    /**
     * 通过注入一个 NewTopic 类型的 Bean 来创建 topic，如果 topic 已存在，则会忽略。
     */
    @Bean
    public NewTopic topicSprKa01() {
        return new NewTopic(SprKafkaConst.topicSprKa01, 2, (short) 1);
    }

    @Bean
    public NewTopic topicSprKa02() {
        return new NewTopic(SprKafkaConst.topicSprKa02, 1, (short) 1);
    }

}
