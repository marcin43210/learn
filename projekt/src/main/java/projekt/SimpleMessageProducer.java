package projekt;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessageProducer implements MessageProducer{

	
	public String getMessage() {
		return "chuj";
		
	}

}
