package com.project;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.GetQueueUrlRequest;

public class ClassWithMentionedQueueNames {

    void someMethod1() {
        GetQueueUrlRequest getQueueUrlRequest1 =
                new GetQueueUrlRequest("QueueNameAsHardcode");
    }


    private static final String QUEUE_NAME_BY_CONST = "QueueNameByConst";

    void someMethod2(AmazonSQS amazonSQS) {
        amazonSQS.createQueue(QUEUE_NAME_BY_CONST);
    }

}
