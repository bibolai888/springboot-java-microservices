package idt.oasis.clients.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}

@RefreshScope
@RestController

class MessageRestController{

	@Value("${msg:Hello world - config server is not working pls check}")
	private String msg;

	@RequestMapping("/msg")
	String getMsg(){
		return  this.msg;
	}
}