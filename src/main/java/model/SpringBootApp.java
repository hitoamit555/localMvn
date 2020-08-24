package model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*@SpringBootApplication
public class SpringBootApp extends SpringBootServletInitializer { //implements SpringBootApplication
 {

     @Override
     protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
     return application.sources(SpringBootApp.class);
 }

     public static void main(String[] args) {
         SpringApplication.run(SpringBootApp.class,args);
     }

}*/



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.server.support.SpringBootServletInitializer;

    @SpringBootApplication
    public class SpringBootApp extends SpringBootServletInitializer {

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(SpringBootApp.class);
        }

        public static void main(String[] args) throws Exception {
            SpringApplication.run(SpringBootApp.class, args);
        }
    }
