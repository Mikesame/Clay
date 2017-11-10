package com.mcylm.microservice.mission.service.mq.impl;

import com.alibaba.rocketmq.common.message.MessageExt;
import com.mcylm.microservice.mission.service.mq.MessageProcessor;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessorImpl implements MessageProcessor {
    @Override
    public boolean handleMessage(MessageExt messageExt) {
        System.out.println("receive : " + messageExt.toString());
        return true;
    }
}
