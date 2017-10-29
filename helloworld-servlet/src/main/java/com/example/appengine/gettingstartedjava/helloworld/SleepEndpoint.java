package com.example.appengine.gettingstartedjava.helloworld;

import java.util.concurrent.TimeUnit;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiClass;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

@Api
@ApiClass(resource = "sleep")
public class SleepEndpoint {
	
	@ApiMethod(path = "/sleep", httpMethod = "GET")
	public void timeout(@Named("sleep") int sleep) {
		try {
			TimeUnit.SECONDS.sleep(sleep);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
}
