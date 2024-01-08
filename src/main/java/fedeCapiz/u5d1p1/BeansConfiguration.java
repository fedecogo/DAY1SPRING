package fedeCapiz.u5d1p1;
import fedeCapiz.u5d1p1.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfiguration {


@Bean
    public Pizza  Margherita(){
    Pizza pizza = new Pizza();
    pizza.setName("Margherita");
    pizza.setPrice(4.99);
    pizza.setCalorie(1104);
    pizza.setIngredients(Arrays.asList("pomodoro", "mozzarella"));
    return pizza;
}


}
