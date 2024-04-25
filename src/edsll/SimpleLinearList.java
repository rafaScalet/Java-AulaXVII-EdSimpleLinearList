package edsll;

public class SimpleLinearList {
    private Node top;
    private Node bottom;
    private long size;

    public SimpleLinearList() {
        this.top = null;
        this.bottom = null;
        this.size = 0;
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
        this.addSize();
    }

    public void append(Node node) {
        if (empty()) {
            this.top = this.bottom = node;
        } else {
            Node serv = this.bottom;
            this.bottom = node;
            serv.setNext(node);
        }
        this.addSize();
    }

    public void show() {
        Node serv = this.top;
        while (serv != this.bottom) {
            System.out.println("-->" + serv.getValue().toString());
            serv = serv.getNext();
        }
        System.out.println("-->" + serv.getValue());
    }

    private void addSize() {
        this.size++;
    }

    private long length() {
        return this.size;
    }
}
