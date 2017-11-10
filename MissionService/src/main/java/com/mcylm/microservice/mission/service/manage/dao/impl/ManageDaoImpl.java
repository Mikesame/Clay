package com.mcylm.microservice.mission.service.manage.dao.impl;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.google.gson.Gson;
import com.mcylm.microservice.mission.service.manage.dao.ManageDao;
import com.mcylm.microservice.mission.service.mq.RocketMQConsumerConfiguration;
import com.mcylm.microservice.mission.service.mq.RocketMQException;
import com.mcylm.microservice.mission.service.mq.RocketMQProducerConfiguration;
import com.mcylm.microservice.mission.service.utils.Result;
import com.mcylm.microservice.mission.service.utils.ResultType;
import com.mcylm.microservice.mission.service.utils.Sender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ManageDaoImpl implements ManageDao {

    @Autowired
    private RocketMQProducerConfiguration rocketMQProducerConfiguration;

    private static Logger logger = LoggerFactory.getLogger(ManageDaoImpl.class);

    @Override
    public Result sendMessage(Sender sender) {
        Result result = new Result();
        Gson gson = new Gson();
        String json = gson.toJson(sender,Sender.class);
        try {
            DefaultMQProducer defaultMQProducer = rocketMQProducerConfiguration.getRocketMQProducer();

            Message msg = new Message(sender.getTopic(),// topic
                    sender.getTags(),// tag
                    sender.getUuid(),//key用于标识业务的唯一性
                    (json).getBytes()// body 二进制字节数组
            );
            SendResult send = defaultMQProducer.send(msg);
            result.setIsTrue(true);
            result.setData(send);
            return result;

        } catch (RocketMQException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        }

        result.setIsTrue(false);
        return result;
    }
}
