package pl.javastart.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import projekt.FileMessageProducer;
import projekt.MessagePrinter;
import projekt.MessageProducer;
import projekt.SimpleMessageProducer;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public MessagePrinter getPrinter()
	{
		MessageProducer producer = new SimpleMessageProducer();
		return new MessagePrinter(producer);
	}

}
