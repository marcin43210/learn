package pl.javastart.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import projekt.MessagePrinter;


@Configuration
@ComponentScan(basePackageClasses = MessagePrinter.class)
public class SpringDiApplication {
	
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDiApplication.class);
		MessagePrinter printer = ctx.getBean(MessagePrinter.class);
		printer.printMessage();
		ctx.close();
		
	
	}
	
	

}
