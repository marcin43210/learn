package projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MessagePrinter {
	
	@Autowired
	private MessageProducer producer;
	
	
	
	MessagePrinter(){}
	

	public MessagePrinter(MessageProducer messageProducer)
	{
		this.producer = messageProducer;
	}
	
	
	public void printMessage()
	{
		String message = producer.getMessage();
		System.out.println(message);
	}


	public MessageProducer getProducer() {
		return producer;
	}


	public void setProducer(MessageProducer producer) {
		this.producer = producer;
	}
	
	
}
