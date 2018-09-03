package quater;//package quaters;


import quater.Quater;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuater implements Quater {

    public TerminatorQuater() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }


    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    @Override
    public void sayQuate() {
        for (int i = 0; i < repeat; i++)
            System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
