package pl.javastart.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import projekt.MessagePrinter;

public class SpringDiApplication {
	
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		printer.printMessage();
		ctx.close();
		
	
	}
	
	

}
