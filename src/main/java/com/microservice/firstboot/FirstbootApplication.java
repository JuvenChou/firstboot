package com.microservice.firstboot;

//import com.mozimentu.comom.Basic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableSwagger2 //启动SWAGGER
@RestController
public class FirstbootApplication {

    public static final int INITNUM = 10;
    public static final int INITNUM_MAX = 100;
    public static final int INITNUM_MIN = 1;
    public static final int INITNUM_VOL = 20;
//    private static final Basic bs= new Basic();

    public static final String aa="flek";

    public static void main(String[] args) {
        SpringApplication.run(FirstbootApplication.class, args);

        hello();
    }


    @RequestMapping("/hello")
    public static String hello() {
        int s1 = 1;
        s1 += 6;

        if (printSingleton()) return "Hello,Studip spring!";
        return null;
    }

    private static boolean printSingleton() {
        try {
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY....");
        }
        return false;
    }
}
