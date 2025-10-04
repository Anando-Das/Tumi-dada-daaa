package Task0507;

import java.util.Scanner;

public class votingAgeAbility {
    
    public static void validateAge(int age) throws invalidexeption {

        if (age<18) {
            
            throw new invalidexeption("you must 18 to be vote");

        }else {

            System.out.println("you are eligible to vote");

        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        

        try {

            int age = in.nextInt();


            validateAge(age);
        } catch (invalidexeption e) {
            System.out.println(e);
   }

}

}