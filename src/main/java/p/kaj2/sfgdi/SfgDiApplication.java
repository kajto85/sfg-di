package p.kaj2.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import p.kaj2.sfgdi.controller.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);


		System.out.println("---I18Controller---");
		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayHello());




		System.out.println("---Primary Bean------");
		System.out.println(controller.sayHello());

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
