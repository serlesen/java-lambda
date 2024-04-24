package com.sergio;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Handler implements RequestHandler<Map<String,Object>, String> {

    @Override
    public String handleRequest(Map<String,Object> event, Context context) {

        LambdaLogger logger = context.getLogger();
        logger.log("Handler invoked");

        return "Hello";
    }
}