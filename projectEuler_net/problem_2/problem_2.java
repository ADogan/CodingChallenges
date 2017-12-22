public class problem_2{

  static int previousValue = 0;
  static int value = 1;

  public static void main(String args[]){
    int result = 0;
    int max = 4000000;

    while(true){
      //get the next fibonacci number
      setNextFibonacci();

      //check if value is below 4 million
      if(value >= max){
        break;
      }
        //check if value is even
        if(value % 2 == 0){
            //yes?-> add to result
            result = result + value;
          }
    }
    System.out.println("Result: "+ result);
  }

  private static void setNextFibonacci(){
    //add previousvalue with the new value
    int tempValue = value;
    value = value + previousValue;
    previousValue = tempValue;

  }
}
