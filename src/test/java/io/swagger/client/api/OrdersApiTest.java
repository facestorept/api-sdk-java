/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.NotFoundResponse;
import io.swagger.client.model.Order;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Ignore
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    
    /**
     * 
     *
     * Returns all orders from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;products, customers&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        Long id = null;
        List<String> includes = null;
        List<Order> response = api.getOrderById(id, includes);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all orders from the system that the user has access to  ### Includes You can give the following values on includes parameter: &#x60;products, customers&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        List<String> includes = null;
        Integer limit = null;
        List<String> orderBy = null;
        List<Order> response = api.getOrders(includes, limit, orderBy);

        // TODO: test validations
    }
    
}
