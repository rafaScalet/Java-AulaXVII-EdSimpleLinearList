package main;

import java.util.Scanner;
import edsll.Node;
import edsll.NodeValue;
import edsll.Nothing;
import edsll.SimpleLinearList;

public class Main {
    public static void main(String[] args) {
        SimpleLinearList list = new SimpleLinearList();
        Scanner in = new Scanner(System.in);

        int id = 0;
        String name;
        String email;

        for (; id >= 0;) {
            System.out.print("Informations: ");
            id = in.nextInt();
            name = in.next();
            email = in.next();
            if (id < 0) {
                break;
            }
            list.append(new Node(id, new Nothing(id, name, email)));
        }
        list.show();

        /*
        System.out.println("Search nth. imform the position: ");
        int position = in.nextInt();
        in.close();

        Node searchNodeClone = list.searchWithClone(position);
        NodeValue searchNodeInterface = list.searchWithInterface(position);

        System.out.println("Node: " + searchNodeClone.getValue());
        System.out.println("Node: " + searchNodeInterface.getValue());
        */

        System.out.println("Removing the first node from the list");
        Node retNode = list.remove();
        list.show();

        System.out.println("Removing the last node from the list");
        retNode = list.pop();
        list.show();
    }
}
