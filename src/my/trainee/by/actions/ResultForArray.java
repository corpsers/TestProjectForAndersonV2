package my.trainee.by.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ResultForArray {
    public String getValuesFromReader() {
        return valuesFromReader;
    }
    private String valuesFromReader;
    public ResultForArray() {
        System.out.println("Enter values for array: ");
        this.valuesFromReader = enterValues();
    }

    String enterValues() {
        BufferedReader enterName = new BufferedReader(new InputStreamReader(System.in));
        try {
            String valuesFromReader = enterName.readLine();
            return valuesFromReader;
        }catch (IOException e){
            System.out.println("Incorrect enter!");
            return "0";
        }
    }
    public void getResult(String valuesFromReader){
        printDigitsEqualCondition(makeIntArray(valuesFromReader));
    }
    int[] makeIntArray(String stringInIntArray) throws NumberFormatException {
        String[] stringInStringArray = stringInIntArray.split(" ");
        int [] intArrayFromString = new int[stringInStringArray.length];
        for (int i = 0; i <= stringInStringArray.length - 1; i++)
            intArrayFromString[i] = Integer.parseInt(stringInStringArray[i]);
        return intArrayFromString;
    }
    static void printDigitsEqualCondition(int[] array){
        System.out.println("You enter:"+ Arrays.toString(array));
        System.out.println("Values that equal to the condition are: ");
        for (int i = 0;i <= array.length-1;i++)
            if (array[i] % 3 ==0){
                System.out.print(array[i]+" ");
            }
        System.out.println(" ");
    }
}
