package Exeption;

import java.util.Scanner;

public class votingAbility {
    
    public static void votingAge(int age) throws invalidexeption {

        if (age>18) {
            
            throw new invalidexeption("you are not 18");

        }else {

            System.out.println("you are eligble to vote");

        }

    }

    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        try{

            votingAge(age);

        }catch (invalidexeption e) {

            System.out.println(e);

        }

    }

}
