package projekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MessagePrinter {
	
	
	private MessageProducer producer;
		


	MessagePrinter(){}
	
	
	public MessagePrinter(MessageProducer producer)
	{
		this.producer = producer;
	}
	
	
	public void printMessage()
	{
		String message = producer.getMessage();
		System.out.println(message);
	}

	public MessageProducer getProducer() {
		return producer;
	}
	@Autowired
	public void setProducer(MessageProducer producer) {
		this.producer = producer;
	}
	
}
