package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    public Calculadora calc;
    @Autowired
    public Cadastro cadastro; 

    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado é " + calc.somar(10, 2938));
        System.out.println(cadastro.getNome());
        System.out.println(cadastro.toString());
    }

}
