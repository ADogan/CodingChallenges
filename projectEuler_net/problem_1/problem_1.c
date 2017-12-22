#include <stdio.h>
int main(){
    int result = 0;
    int count = 0;
    int max = 1000;
    int divisableBy3;
    int divisableBy5;

    for(count = 1; count < max; count++){
      divisableBy3 = count % 3 == 0 ;
      divisableBy5 = count % 5 == 0 ;
      if(divisableBy3 || divisableBy5){
        result = result + count;
      }
    }
    printf("Result: %d\n", result);
  return 0;
}
