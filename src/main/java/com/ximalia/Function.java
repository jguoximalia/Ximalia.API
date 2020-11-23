package com.ximalia;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Optional;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function {
    /**
     * This function listens at endpoint "/api/CalcCo2Compensation". Two ways to
     * invoke it using "curl" command in bash: 1. curl -d "HTTP Body" {your
     * host}/api/CalcCo2Compensation 2. curl "{your
     * host}/api/CalcCo2Compensation?Co2EmissionAmount=HTTP%20Query"
     */
    @FunctionName("CalcCo2Compensation")
    public HttpResponseMessage run(@HttpTrigger(name = "req", methods = {
            HttpMethod.GET }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

        // Parse query parameter
        final String query = request.getQueryParameters().get("Co2EmissionAmount");
        final String co2_emission = request.getBody().orElse(query);

        if (co2_emission == null) {
            return request.createResponseBuilder(HttpStatus.BAD_REQUEST)
                    .body("Please pass a numberic value on the query string or in the request body").build();
        } else {
            return request
                    .createResponseBuilder(HttpStatus.OK).body("When your CO2 emission is " + co2_emission
                            + " metric ton per year," + " you need to plant " + co2_emission + " trees to offset.")
                    .build();
        }
    }
}
