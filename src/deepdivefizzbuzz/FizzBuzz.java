package deepdivefizzbuzz;

public class FizzBuzz {

  private static final int DEFAULT_UPPER_LIMIT = 100;
  public static void main(String[] args) {
    int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]): DEFAULT_UPPER_LIMIT; 
    emitFizzBuzz(upperLimit);
  }
  private static void emitFizzBuzz(int limit) {
   for (int i= 1; i<= limit; i++) {
     String response = "";
     if (i % 3 == 0) {
     response += "Fizz";
     }
     if (i % 5 == 0) {
       response += "Buzz";
     }
     if (response.length() == 0) {// Is response still empty?
       response = String.format("%d", i);
     }
     System.out.println(response);
     }
  }

}
