package com.example.appengine.gettingstartedjava.helloworld;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "endpoints", value = "/_ah/api/*", initParams = {
		@WebInitParam(name = "services", value = "com.example.appengine.gettingstartedjava.helloworld.SleepEndpoint")
})
public class EndpointsServlet extends com.google.api.server.spi.EndpointsServlet {
}
