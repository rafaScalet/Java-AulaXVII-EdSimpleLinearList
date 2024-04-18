package main;

import java.util.Scanner;
import edsll.Node;
import edsll.SimpleLinearList;

public class Main {
    public static void main(String[] args) {
        SimpleLinearList list = new SimpleLinearList();
        Scanner in = new Scanner(System.in);

        for(int number = 0, indx = 0; number >=0; indx++){
            System.out.print("Numbers: ");
            number = in.nextInt();
            if(number < 0){
                break;
            }
            list.add(new Node(indx, number));
            list.append(new Node(indx, number));
        }
        list.show();
        in.close();
    }
}
