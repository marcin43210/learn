package pl.javastart.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import projekt.MessagePrinter;

public class SpringDiApplication {
	
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		printer.printMessage();
		ctx.close();
		
	
	}
	
	

}
