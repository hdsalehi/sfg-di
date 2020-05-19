package isc.co.ir.sfgdi;

import isc.co.ir.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext	ctx=SpringApplication.run(SfgDiApplication.class, args);
		//MyController myController=(MyController) ctx.getBean("myController");
		MyController myController=(MyController) ctx.getBean("salehiController");


		String greeting=myController.sayHello();
		System.out.printf(greeting);//test
	}

}
