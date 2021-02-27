package com.gang5.config.limitservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gang5.config.limitservices.configuration.ConfigurationProps;

@RestController
public class LimitsConfigController {
	
@Autowired
ConfigurationProps properties;
	
@GetMapping("/limits")
public LimitsConfiguration	retriveLimitsFromConfiguration() {
	
	System.out.println("properties.getMaximum()"+properties.getMaximum());
	
	return new LimitsConfiguration(10,1000);
	
}
	
	
}
