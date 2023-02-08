package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/speakingclock")
public class SCController {

	@Autowired
	SpeakingClock speakingClock;

	@PostMapping("/getTime")
	public String getTime(@RequestBody Object time) {
		return speakingClock.convertToString(time.toString());
	}

	@GetMapping("/test")
	public String getAllBook() {
		System.out.println("Hi..");
		return "Hi..";
	}

}