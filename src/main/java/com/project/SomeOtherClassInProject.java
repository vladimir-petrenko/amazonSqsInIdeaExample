package com.project;

import com.amazonaws.services.sqs.model.CreateQueueRequest;

public class SomeOtherClassInProject {

    void someMethod() {
        CreateQueueRequest createQueueRequest =
                new CreateQueueRequest("QueueNameAsHardcode");
    }

}
