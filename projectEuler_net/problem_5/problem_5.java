public class problem_5{

  public static void main(String args[]){
    int result = 0;

          int maxValue = 1000000000; //Just guessing below which value it could be
          //loop starting from 1 to maxValue as int i
          for(int i = 1; i < maxValue; i++){
            //set var dividable = true
            boolean dividable = true;

            //loop from 1 to 10 as int j
            for(int j = 1; j <= 20; j++){
              // for debugging
              // System.out.println("i:" + i + "-j:" + j);
              //if i % j != 0 then break and set dividable to false
                if(i%j == 0){
                  //dividable still true
                }
                else
                {
                  dividable = false;
                  break;
                }
            }
            if(dividable == true){
              result = i;
              break;
              //if dividable is still true at this point, then the number has been found
            }
          }
    System.out.println("Largest number: " + result);
  }


}
