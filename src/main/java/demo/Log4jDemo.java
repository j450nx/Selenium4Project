package demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
			
	public static void main(String[] args) {
		System.out.println("Hello World!\n");

		BasicConfigurator.configure();
		
		logger.trace("This is a trace message");
		logger.info("This is informatin message");
		logger.error("this is an error message");
		logger.warn("this is a warning message");
		logger.fatal("this is a fatal message");
		
		System.out.println("\nCompleted");
	}

}
