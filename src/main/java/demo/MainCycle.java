package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainCycle{
    public static void main(String[] args) {
        SpringApplication.run(MainCycle.class, args);
        
        String ap=3450+"";
       String aps=new  StringBuilder(ap).reverse().toString();
       System.out.println(Integer.parseInt(aps)+2);
       
       
    }
}


