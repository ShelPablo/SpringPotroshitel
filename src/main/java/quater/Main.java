package quater;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //SpringApplication.run(PotroshitelApplication.class, args);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        while (true) {
            Thread.sleep(100);
            context.getBean(TerminatorQuater.class).sayQuate(); // This is wrong! Look up for interface!
            //context.getBean(Quater.class).sayQuate(); // This is wrong! Look up for interface!
        }


    }


}
