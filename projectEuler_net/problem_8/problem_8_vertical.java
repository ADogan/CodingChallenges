/*

Did not managed to send in the correct answer for this. Code is currently at this state:

*/


/*
Assignment:
The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.

73167176531330624919225119674426574742355349194934
96983520312774506326239578318016984801869478851843
85861560789112949495459501737958331952853208805511
12540698747158523863050715693290963295227443043557
66896648950445244523161731856403098711121722383113
62229893423380308135336276614282806444486645238749
30358907296290491560440772390713810515859307960866
70172427121883998797908792274921901699720888093776
65727333001053367881220235421809751254540594752243
52584907711670556013604839586446706324415722155397
53697817977846174064955149290862569321978468622482
83972241375657056057490261407972968652414535100474
82166370484403199890008895243450658541227588666881
16427171479924442928230863465674813919123162824586
17866458359124566529476545682848912883142607690042
24219022671055626321111109370544217506941658960408
07198403850962455444362981230987879927244284909188
84580156166097919133875499200524063689912560717606
05886116467109405077541002256983155200055935729725
71636269561882670428252483600823257530420752963450

Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
*/

import java.util.ArrayList;
import java.util.List;

public class problem_8_vertical{

  public static void main(String args[]){
    long startTime = System.currentTimeMillis();

    List<String> listOfSeries = new ArrayList<String>();

    int highestValue = 0;
    String highestValueString = "";
    int digitSize = 4;

    String thousendDigitNumber =
    "73167176531330624919225119674426574742355349194934" +
    "96983520312774506326239578318016984801869478851843" +
    "85861560789112949495459501737958331952853208805511" +
    "12540698747158523863050715693290963295227443043557" +
    "66896648950445244523161731856403098711121722383113" +
    "62229893423380308135336276614282806444486645238749" +
    "30358907296290491560440772390713810515859307960866" +
    "70172427121883998797908792274921901699720888093776" +
    "65727333001053367881220235421809751254540594752243" +
    "52584907711670556013604839586446706324415722155397" +
    "53697817977846174064955149290862569321978468622482" +
    "83972241375657056057490261407972968652414535100474" +
    "82166370484403199890008895243450658541227588666881" +
    "16427171479924442928230863465674813919123162824586" +
    "17866458359124566529476545682848912883142607690042" +
    "24219022671055626321111109370544217506941658960408" +
    "07198403850962455444362981230987879927244284909188" +
    "84580156166097919133875499200524063689912560717606" +
    "05886116467109405077541002256983155200055935729725" +
    "71636269561882670428252483600823257530420752963450";

    final int horizontalPositions = 50;
    final int verticalLines = 20;

  // get horizontal lines and add to listofSeries

  for(int y = 0; y <  verticalLines; y++){
    int startingposition = y * horizontalPositions;
    int endPosition = startingposition + horizontalPositions;
    String series = thousendDigitNumber.substring(startingposition, endPosition);
    listOfSeries.add(series);
  }

  //get vertical lines and add to listofSeries
  for(int y = 0; y <  horizontalPositions; y++){
    String series = "";

    for(int z = 0; z < verticalLines; z++){
      int position = (z * horizontalPositions) + y;
      series = series + thousendDigitNumber.substring(position, position + 1);
    }
    listOfSeries.add(series);
  }

    //get diagonal? from leftup to right bottom lines and add to listofSeries
    for(int y = 0; y <  horizontalPositions; y++){
      String series = "";

      for(int z = 0; z < verticalLines; z++){
        if(((z * horizontalPositions) + y + series.length()) > thousendDigitNumber.length()-1){
          continue;
        }
        int position = (z * horizontalPositions) + y + series.length();
        series = series + thousendDigitNumber.substring(position, position + 1);
      }
      listOfSeries.add(series);
    }

  //seperate into a series of strings
  for(String series: listOfSeries){
  System.out.println("series: "+ series);


    //Loop through thousendDigitNumber
    for(int x = 0; (x + digitSize) <= series.length(); x++){
      //at every step get Value
      String aDigist =  series.substring(x, x + digitSize);
      // if(aDigist.contains("0")){
      //   //if there is a 0 in it, just skip to the next
      //   continue;
      // }
      System.out.println("aDigist: "+ aDigist);

        // if value is higher then highestValue then save as highestValue
          int value = getProduct(aDigist);
          if(value > highestValue){
            highestValue = value;
            highestValueString = aDigist;
          }

      }
    }
    System.out.println("Highest Value: "+ highestValue);
    System.out.println("highestValueString: "+ highestValueString);

    // paste speed of calculation in Milliseconds
    long endTime   = System.currentTimeMillis();
    long totalTime = endTime - startTime;
    System.out.println("\n" + totalTime + " milliseconds");
  }



    private static int getProduct(String adjacentDigits){
      int product = 1;
      //split the string into seperate digits
        for(int x=0; x < adjacentDigits.length();x++){
          int digit = Integer.parseInt(adjacentDigits.substring(x, x+1));
          product = product * digit;
          // System.out.println("---------product: "+ product + "-------------digit: " + digit);
        }

      return product;
    }

}
