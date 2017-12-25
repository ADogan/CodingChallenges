public class problem_6{

  public static void main(String args[]){
    int result1 = 0;
    int maxValue = 100;

  //loop 1 to 10 use x
  for(int x = 1; x <= maxValue;x++){
    //multiply x by x and save to result
    result1 = result1 + (x * x);
  }

    System.out.println("Result1: " + result1);

      int result2 = 0;
      int subtotal = 0;
      //loop 1 to 10 use y
    for(int y = 1; y <= maxValue;y++){
      //get sum of all y
      subtotal += y;
    }
    // calculate square of sum
    result2 = subtotal * subtotal;
      System.out.println("Result2: " + result2);

      //get difference of the 2 results
      int difference = result2 - result1;
      System.out.println("Difference is: " + difference);
  }
}
