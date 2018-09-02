package quater;//package quaters;


import quater.Quater;

public class TerminatorQuater implements Quater {

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
