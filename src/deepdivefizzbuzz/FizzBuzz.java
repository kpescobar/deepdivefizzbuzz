package deepdivefizzbuzz;

public class FizzBuzz {
    
    /** Default upper limit for counting */
  private static final int DEFAULT_UPPER_LIMIT = 100;
  
  public static final String USAGE = 
      "Usage:%n"
      + "\tjava [options] edu.cnm.deepdive.fizzbuzz.FizzBuzz [limit]%n"
      + "%n"
      + "where%n"
      + "\toptions = VM options%n"
      + "\tlimit = positive upper counting limit (default = 100)";
  
  public static void main(String[] args) {
    try {
    int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]): DEFAULT_UPPER_LIMIT; 
    if (upperLimit <= 0) {
      throw new IllegalArgumentException("Upper limit must be positive");
    }
    emitFizzBuzz(upperLimit);
    }
    catch (IllegalArgumentException ex) {
      ex.printStackTrace();
      emitUsage();
    }
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
  
  private static void emitUsage() {
    System.out.printf(USAGE);
  }

}
