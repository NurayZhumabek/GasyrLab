package module1.exceptions.glab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     try {
         int age=sc.nextInt();
         requestAge(age);
         System.out.format("Input answer: %d", age);
     } catch (InvalidAgeException e){
         e.printStackTrace();
     }
    }

   static void requestAge(int age) throws InvalidAgeException{
        if (age<1 || age>150){
            throw new InvalidAgeException("The input value for this range is not valid!");
        }
   }
}
