package rivisionBasic;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("a sweet red  Fruit");
//            case "Orange" -> System.out.println("Round Fruit");
//            default -> System.out.println("please enter valid fruit");
//        }

        int day = in.nextInt();
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
