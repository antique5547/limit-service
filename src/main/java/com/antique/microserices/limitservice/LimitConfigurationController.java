package com.antique.microserices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
@Autowired
private Configuration configuration;
@GetMapping("/limits")
public LimitConfguration retrieveLimitConfiguration() {
	return new LimitConfguration(configuration.getMaximum(), configuration.getMinimum());
}
}
