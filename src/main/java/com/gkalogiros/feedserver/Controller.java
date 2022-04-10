package com.gkalogiros.feedserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class Controller {

	@GetMapping()
	public String saveFeed() {
		return "pong";
	}
}
