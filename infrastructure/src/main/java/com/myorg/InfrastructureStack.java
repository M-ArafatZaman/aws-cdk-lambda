package com.myorg;

import software.amazon.awscdk.BundlingOptions;
import software.amazon.awscdk.services.lambda.Code;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;

import java.util.List;
import java.util.Arrays;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class InfrastructureStack extends Stack {
    public InfrastructureStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public InfrastructureStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here


        Function lambdaFunction = Function.Builder.create(this, "TestFunction")
                .functionName("TestFunction")
                .runtime(Runtime.JAVA_21)
                .code(Code.fromAsset("../lambdaFunc/target/testfunction.jar"))
                .handler("org.awsarafat.TestFunction")
                .build();
    }
}
