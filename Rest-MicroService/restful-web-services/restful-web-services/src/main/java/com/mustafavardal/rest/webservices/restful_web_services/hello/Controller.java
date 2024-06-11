package com.mustafavardal.rest.webservices.restful_web_services.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "hello-world")
	public String get(String s) {

		s = "Hello world 1!";

		return s;
	}

	@GetMapping(path = "hello-world-bean")
	public HelloWorldBean helloworldBean() {

		return new HelloWorldBean("Hello world");
	}

	@GetMapping(path = "hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {

		return new HelloWorldBean(String.format("Hello world, %s", name));
	}

	@GetMapping(path = "/internationalization")
	public String getInternationalization() {

		// en = helloworld
		// nl = Goede Morgen
		// fr = Bonjour
		// return "Hello world 1!";

		return messageSource.getMessage("good.morning.message", null, "Default Message",
				LocaleContextHolder.getLocale());
	}

}
