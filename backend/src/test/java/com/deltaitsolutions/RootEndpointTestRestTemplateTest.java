package com.deltaitsolutions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RootEndpointTestRestTemplateTest {

    private static String EXPECTED_BODY = "Salestool App";

    private static String ROOT_ENDPOINT = "/";

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void test_root_endpoint() {
        ResponseEntity<String> responseEntity = this.restTemplate.getForEntity(ROOT_ENDPOINT, String.class);
        Assert.assertEquals(EXPECTED_BODY, responseEntity.getBody());
        Assert.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
