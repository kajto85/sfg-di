package p.kaj2.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import p.kaj2.sfgdi.controller.ConstructorInjectedController;
import p.kaj2.sfgdi.controller.MyController;
import p.kaj2.sfgdi.controller.PropertyInjectedController;
import p.kaj2.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);
		String greeting = controller.sayHello();
		System.out.println(greeting);

		System.out.println("--------------------");

		PropertyInjectedController pic = ctx.getBean(PropertyInjectedController.class);
		System.out.println(pic.getGreeting());

		System.out.println("--------------------");

		SetterInjectedController sic = ctx.getBean(SetterInjectedController.class);
		System.out.println(sic.getGreeting());

		System.out.println("--------------------");

		ConstructorInjectedController cic = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(cic.getGreeting());
	}

}
