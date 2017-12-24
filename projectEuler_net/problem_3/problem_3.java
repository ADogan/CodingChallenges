
import java.util.ArrayList;

public class problem_3{

  static long value = 600851475143L;
  static ArrayList<Long> primeFactors = new ArrayList<Long>();

  public static void main(String args[]){

    getPrimeFactors(value);

    for(Long primeFactor : primeFactors){
      System.out.println("Result: " + primeFactor);
    }
  }


  private static void getPrimeFactors(long number){
    long divisableBy = divisableByANumberBesidesOneOrSelf(number);
    //check if value is dividable
    if(divisableBy != 0){
          //if yes
            // add dividableby to primeFactors
            //  then do modulus dividable value
            // rerun this method with remainder
        primeFactors.add(divisableBy);
        // System.out.println("It's a dividable number: " + divisableBy);
        long newValue = number / divisableBy;
        if(newValue == 0){
          System.out.println("this should not be 0, something went wrong.");
        }
        getPrimeFactors(newValue);
    }


    //if it is not dividable then add it to result
  }

  private static long divisableByANumberBesidesOneOrSelf(long number){
    //for loop max number
    for( int x = 2; x <= number; x++){
      if(number % x == 0){
        System.out.println("divisable by " + x);
        return x;
      }
      //if dividable by x return true
    }
      System.out.println("return 0 at " + number);
    return 0;
  }
}
