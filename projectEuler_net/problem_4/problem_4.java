public class problem_4{

  public static void main(String args[]){
    int result = 0;
    int minimalNumbers = 100;
    int maxNumbers = 1000;
    //loop through the numbers untill maxNumbers, use int i
    for(int i = minimalNumbers; i < maxNumbers;i++){
      // loop through the numbers untill maxNumbers within previous loop use int j
      for(int j = minimalNumbers; j < maxNumbers; j++){
        //Multiply i and j
        int product = i * j;
        //check if the number is a palindrome isPalindrome(product)
        boolean palindrome = isPalindrome(product);
        // For debugging
        // System.out.println("i:" + i + "-j:" + j + "And product is: " + product + (palindrome? "palindrome found":"" ));
        if(palindrome){
          //palindrome found
          // check if product is larger then result
          if(product > result){
            //yes?  save as new result
            result = product;
          }
        }
      }
    }

    System.out.println("Largest number: " + result);
  }

  private static boolean isPalindrome(int product){
    String numberAsText = String.valueOf(product);
    int numberSize = numberAsText.length();

      //loop and every step get 2 ints,
      for(int x = 0; x < numberSize;x++){
        int positionA = x;
        int positionB = numberSize - 1 - x;
        if(positionB < positionA)
        {
          break;
        }
        // 1 int from the nth position,
        char a = numberAsText.charAt(positionA);

        // 1 int from the product.size - n position
        char b = numberAsText.charAt(positionB);

            // System.out.println("a: " + a +"-b: " + b);

            //check first and last number
            if(a != b){
                // System.out.println("a is not the same as b ");
                return false;
            }
      }
    return true;

  }

}
