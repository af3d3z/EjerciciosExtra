package aceptaElRetoConstanteKaprekar;

import java.util.Arrays;

public class Kaprekar {
    public int constanteKaprekar (int[] numbers) {
        // variable declaration
        int result;
        int greaterNum;
        int lesserNumber;
        int counter;

        //check if the array of numbers has at least two different numbers
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){

            }
        }


        return counter;
    }

    // function used for converting an array of integers to a single integer
    public static int convertToInt(int[] nums) {
        String numsString = "";
        for(int i = 0; i < nums.length; i++){
            numsString += nums[i];
        }
        return Integer.parseInt(numsString);
    }

    public static void main(String[]args){
        int[] array = {1, 2, 3,4 };
        System.out.println(convertToInt(array));
    }
}
