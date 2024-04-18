package edsll;

public class SimpleLinearList {
    private Node top;
    private Node bottom;

    public SimpleLinearList() {
        this.top = null;
        this.bottom = null;
    }

    private boolean empty() {
        return (this.top == null && this.bottom == null);
    }

    public void add(Node node) {
        if (empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.top;
            this.top = node;
            this.top.setNext(serv);
        }
    }

    public void append(Node node) {
        if (empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.bottom;
            this.bottom = node;
            serv.setNext(node);
        }
    }
}
