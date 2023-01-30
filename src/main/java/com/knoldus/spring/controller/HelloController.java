package com.knoldus.spring.controller;

import com.knoldus.spring.service.UserService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Resource(name="clientService")
	UserService userService;
}