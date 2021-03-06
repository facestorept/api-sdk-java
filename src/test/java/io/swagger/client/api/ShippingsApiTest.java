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
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2013;
import io.swagger.client.model.Shipping;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShippingsApi
 */
@Ignore
public class ShippingsApiTest {

    private final ShippingsApi api = new ShippingsApi();

    
    /**
     * 
     *
     * Creates a new shipping in the store.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addShippingTest() throws ApiException {
        Shipping shipping = null;
        InlineResponse2013 response = api.addShipping(shipping);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * deletes a single shipping based on the ID supplied
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteShippingByIdTest() throws ApiException {
        Long id = null;
        api.deleteShippingById(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a shipping based on a single ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippingByIdTest() throws ApiException {
        Long id = null;
        Integer limit = null;
        InlineResponse2013 response = api.getShippingById(id, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all shippings from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippingsTest() throws ApiException {
        List<String> includes = null;
        Integer limit = null;
        List<String> orderBy = null;
        InlineResponse2003 response = api.getShippings(includes, limit, orderBy);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a single shipping based on the ID supplied
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShippingByIdTest() throws ApiException {
        Long id = null;
        Shipping tax = null;
        InlineResponse2013 response = api.updateShippingById(id, tax);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * update a single shipping based on the ID supplied
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShippingById_0Test() throws ApiException {
        Long id = null;
        Shipping tax = null;
        InlineResponse2013 response = api.updateShippingById_0(id, tax);

        // TODO: test validations
    }
    
}
