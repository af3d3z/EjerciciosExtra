package aceptaElRetoConstanteKaprekar;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class Kaprekar {
    public static int constanteKaprekar(int[] numbers) throws Exception {
        // variable declaration
        int result = 0;
        int[] greaterArray;
        int greaterNum = convertToInt(ascendOrder(numbers));;
        int[] lesserArray = numbers;
        int lesserNumber;
        int counter = 0;

        //check if the array of numbers has at least two different numbers
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(numbers[i] == numbers[j])
                    counter++;
            }
        }
        if (counter < 3){
            // we tell the user that they must at least input two different digits
            throw new Exception("AtLeastTwoDifferentDigits");
        }
        counter = 0;

        while(result != 6174){
            greaterNum = convertToInt(ascendOrder(numbers));
            Arrays.sort(numbers);
            lesserNumber= convertToInt(numbers);

            result = greaterNum - lesserNumber;
            numbers = convertToArray(result);
            counter++;
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

    // converts from a single int to an array of digits
    public static int[] convertToArray(int num) {
        String numString = Integer.toString(num);
        int[] numbers = new int[numString.length()];
        for(int i = 0; i < numString.length(); i++){
            numbers[i] = Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        return numbers;
    }

    // returns an array with its numbers sorted in ascending order as the exercise specified
    public static int[] ascendOrder(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static void main(String[]args) throws Exception {
        int[] array = {1, 2, 3, 4};
        int num = 5000;
        int[] arrays = convertToArray(num);
        System.out.println(constanteKaprekar(arrays));
        System.out.println("I want your love and i want your revenge.");
    }
}
