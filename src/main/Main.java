package main;

import java.util.Scanner;
import edsll.Node;
import edsll.Nothing;
import edsll.SimpleLinearList;

public class Main {
    public static void main(String[] args) {
        SimpleLinearList list = new SimpleLinearList();
        Scanner in = new Scanner(System.in);

        int id = 0;
        String name;
        String email;

        for(; id >=0;){
            System.out.print("Numbers: ");
            id = in.nextInt();
            name = in.next();
            email = in.next();
            if(id < 0){
                break;
            }
            list.add(new Node(id, new Nothing(id, name, email)));
        }
        list.show();
        in.close();
    }
}
