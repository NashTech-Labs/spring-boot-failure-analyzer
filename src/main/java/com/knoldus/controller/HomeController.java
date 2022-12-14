package com.knoldus.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import com.knoldus.service.UserService;

@RestController
public class HomeController {
	@Resource(name="clientService")
	UserService userService;
}