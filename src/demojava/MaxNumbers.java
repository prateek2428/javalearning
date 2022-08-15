package demojava;


public class MaxNumbers {

        public static void main(String[] args) {
        	int array[]= {1,2,4,58,52};
            int maxOne = 0;
            int maxTwo = 0;
            for(int num : array){
            	if(maxOne < num){            //1 2  4    58  
                    maxTwo = maxOne;         //0  1   2   4
                    maxOne =num;              //1 2   4  58
                } else if(maxTwo < num){      //4<52
                    maxTwo = num;            //52
                }
            }
            System.out.println("First Max Number: " + maxOne);
            System.out.println("Second Max Number: " + maxTwo);
        }

        }
    

