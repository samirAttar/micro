package com.RestAPI.Controller;

import com.RestAPI.Service.ServiceLayer;
import com.RestAPI.VO.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private ServiceLayer serviceLayer;

    //http://localhost:8083/
    @GetMapping("/")
    public ResponseEntity<UserResponse> getData() {
        return new ResponseEntity<>( serviceLayer.ConsumeAPI(), HttpStatus.OK);

    }

}
