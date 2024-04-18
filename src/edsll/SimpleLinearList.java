package edsll;

public class SimpleLinearList {
    private Node top;
    private Node bottom;

    public SimpleLinearList(){
        this.top = null;
        this.bottom = null;
    }

    private boolean empty(){
        return (this.top == null && this.bottom == null);
    }
}
