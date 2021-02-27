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
	
	
	
	return new LimitsConfiguration(properties.getMaximum(),properties.getMinimum());
	
}
	
	
}
