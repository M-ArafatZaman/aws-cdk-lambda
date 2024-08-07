package org.awsarafat;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;

public class TestFunction implements RequestHandler<Event, String>{

    @Override
    public String handleRequest(Event event, Context context) {
        StringBuilder res = new StringBuilder();
        res.append("Hi from ");
        res.append(event.message());
        return res.toString();
    }

}

record Event(String message) {}
