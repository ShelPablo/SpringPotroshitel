import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //SpringApplication.run(PotroshitelApplication.class, args);
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TerminatorQuater.class).sayQuate();




    }


}
