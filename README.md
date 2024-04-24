# Java Spring Boot Application deployed on AWS Lambda

All details can be found in the following video: https://youtu.be/nRKb3WEO-dI

## Build the project

To build the project and get the ZIP file to upload to AWS Lambda, run
```
mvn clean package
```

The ZIP file will be available at target/java-lambda-1.0-SNAPSHOT-lambda-package.zip

## Deploy on AWS

First create a Lambda in the AWS Console. Choose the Runtime Java 21.

Configure the Lambda Handler to point to the method StreamLambdaHandler::handleRequest.

Second create an API Gateway in the AWS Console. Add a resource with the value `{proxy+}` and a method with ANY.

When creating the method, select the previously created Lambda.

And finally, deploy the API Gateway to a desired stage to use a public URL to request the Spring Boot application

## CORS Configuration

The current project has the CORS configuration allow any origin.

But another configuration is needed in the Method of the API Gateway. It must enable the CORS and add the allowed
origins.
