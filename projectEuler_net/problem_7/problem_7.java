public class problem_7{

  public static void main(String args[]){
    long startTime = System.currentTimeMillis();

    int currentPrimeNumber = 1;
    int nthPrimeNumber = 10001;

    for(int x = 1; x < nthPrimeNumber + 1;x++){
      currentPrimeNumber = getNextPrimeNumber(currentPrimeNumber);
    }

    System.out.println(nthPrimeNumber + "th Prime Number found: " + currentPrimeNumber);

    // paste speed of calculation in Milliseconds
    long endTime   = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println(totalTime + " milliseconds");
  }


    private static int getNextPrimeNumber(int currentPrimeNumber){
      int position = currentPrimeNumber;
      do{
          position++;
          if(isPrimeNumber(position)){
            return position;
          }
      }while(true);
      // return position;
    }


      private static boolean isPrimeNumber(int value){
        // loop from 2 untill current
        for(int y = 2; y < value; y++){
          //do a modulus of current by y
          int result = value % y;
              // if result == 0, then break, return false, it is not a prime number
              if(result == 0){
                return false;
              }
            }

            // end of method, return true
            return true;
          }
}
