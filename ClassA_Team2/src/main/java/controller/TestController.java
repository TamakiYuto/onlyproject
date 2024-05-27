package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import service.TestService;

@CrossOrigin(origins = "http://localhost:3000") // クライアントのURLを指定
@RestController
public class TestController {
	
	 @Autowired
	    private TestService TestService;


}
