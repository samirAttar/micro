package com.RestAPI.Service;

import com.RestAPI.VO.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {

    @Autowired
    private RestTemplate restTemplate;

        public UserResponse ConsumeAPI(){

            return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1", UserResponse.class);
        }

}
