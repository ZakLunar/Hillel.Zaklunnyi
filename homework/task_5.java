package homework;
//import java.util.*;

public class task_5 {
    public static void main(String[]args){
        /**
         * program generate random int in a specific range 20-70
         */
        double a = Math.random() * 100;
        int random = (int)a;
        if (random < 20){
            random += 20;
            System.out.println(random);
        } else if(random > 70){
            random -= 30;
            System.out.println(random);
        } else {
            System.out.println(random);
        }

        //Date current_Date = new Date();
        //System.out.println(current_Date);

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info
    }
}