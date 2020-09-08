package com.zx.provider.controller;

import com.zx.common.constant.SprKafkaConst;
import com.zx.common.entity.SprOrderBill;
import com.zx.provider.service.OrderProviderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class SprOrderBillController {
    @Resource
    private OrderProviderService producer;
    
    private AtomicLong atomicLong = new AtomicLong();
    
    @GetMapping(value = "/orderBill")
    @ResponseBody
    public void sendMessageToKafkaTopic(@RequestParam("name") String name) { 
        this.producer.sendMessage(SprKafkaConst.topicSprKa01, new SprOrderBill(atomicLong.addAndGet(1), name));
        this.producer.sendMessage(SprKafkaConst.topicSprKa02, new SprOrderBill(atomicLong.addAndGet(1), name));
    }
}
