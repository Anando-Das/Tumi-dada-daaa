package pex;

import java.util.Scanner;

public class exp {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
int count = 0;
        do  {
            try{

            int x = in.nextInt();
             int y = in.nextInt();

           int res = x/y;

          System.out.println(res);

          count++;

         }catch(Exception x){

             System.out.println(x+"you must enter int");

         }
        }while(count == 1);

    }

}
