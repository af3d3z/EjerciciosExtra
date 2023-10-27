package aceptaElRetoConstanteKaprekar;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

public class Kaprekar {
    public static int constanteKaprekar(int[] numbers) throws Exception {
        // declaración de variables
        int counter = 0;
        int result = 0;
        int bigger = 0;
        int smaller = 0;

        if(convertToInt(numbers) == 6174){
            return 0;
        }else if(numbers[0] == numbers[1] && numbers[1] == numbers[2] && numbers[2] == numbers[3]){
            return 8;
        }else {
            while(result != 6174){
                bigger = descendOrderToInt(numbers);
                smaller = ascendOrderToInt(numbers);

                result = bigger - smaller;
                numbers = convertToArray(result);
                counter++;
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

    // converts from a single int to an array of digits
    public static int[] convertToArray(int num) {
        String numString = Integer.toString(num);
        int[] numbers = new int[numString.length()];
        for(int i = 0; i < numString.length(); i++){
            numbers[i] = Integer.parseInt(String.valueOf(numString.charAt(i)));
        }
        return numbers;
    }

    // returns an int from an array with its numbers sorted in descending order
    public static int descendOrderToInt(int[] nums) {
        // in this variable we will save array ordered as an int
        int total;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        total = convertToInt(nums);

        return total;
    }

    // returns an int from an array with its numbers sorted in ascending order
    public static int ascendOrderToInt(int[] nums) {
        // this value stores the sorted number as an integer
        int total;
        Arrays.sort(nums);

        total = convertToInt(nums);

        return total;
    }


    public static void main(String[]args) throws Exception {
        int[] array = {1,1,2,1};
        int num = 5000;
        int[] arrays = convertToArray(num);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(constanteKaprekar(array));
    }
}
