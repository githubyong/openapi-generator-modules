package com.baeldung.openapi;

import com.baeldung.openapi.client.ApiClient;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration of the generated API client.
 */
@Configuration
public class ApiClientConfiguration {

    public ApiClientConfiguration(ApiClient apiClient) {
        apiClient.setBasePath("https://petstore.swagger.io/v2");
    }

}
