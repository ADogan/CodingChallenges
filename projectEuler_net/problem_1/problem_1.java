public class problem_1 {
  public static void main(String args[]){
    int result = 0;
    //loop through the numbers
    for(int x = 1; x < 1000; x++){
      //check if number(x) is divisable by 3 or 5
      boolean divisableBy3 = (x % 3 == 0);
      boolean divisableBy5 = (x % 5 == 0);
      if(divisableBy3 || divisableBy5){
        //yes?
          // add x to result
            result = result + x;
        }
        else{
        //no?
          // x + " is not divisable by 3 or 5. "
          //skip to next x
        }
    }

    System.out.println("Result: \n" + result);
  }
}
