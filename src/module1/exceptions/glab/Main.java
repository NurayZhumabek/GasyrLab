package module1.exceptions.glab;

public class Main {
    public static void main(String[] args) {
     try {
         requestAge(160);
     } catch (InvalidAgeException e){
         e.printStackTrace();
     }
    }

   static void requestAge(int age) throws InvalidAgeException{
        if (age<1 && age>150){
            throw new InvalidAgeException("The input value for this range is not valid!");
        }
   }
}
