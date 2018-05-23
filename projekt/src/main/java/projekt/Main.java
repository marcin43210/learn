package projekt;

public class Main {

	public static void main(String[] args) {
		MessageProducer file = new FileMessageProducer();
		MessagePrinter printer = new MessagePrinter(file);
		
		printer.printMessage();
		
		MessageProducer simple = new SimpleMessageProducer();
		MessagePrinter simplePrinter = new MessagePrinter(simple);
		
		simplePrinter.printMessage();

	}

}
