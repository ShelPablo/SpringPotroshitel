//package quaters;


public class TerminatorQuater implements Quater {
    private String message;
    @Override
    public void sayQuate() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
