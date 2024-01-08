package fedeCapiz.u5d1p1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1p1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1p1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1p1Application.class);
		System.out.println(ctx.getBean("Margherita"));

	}
}
