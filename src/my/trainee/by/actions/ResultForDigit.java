package my.trainee.by.actions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResultForDigit {

    public int getDigitForCheck() {
        return digitForCheck;
    }

    private int digitForCheck;
    public ResultForDigit() {
        System.out.println("Enter digit:");
        this.digitForCheck = getValueFromUserEnter();
    }
    public void getResult(int digitForCheck){
        getResultIfConditionTrue(digitForCheck);
    }
    int getValueFromUserEnter (){
        BufferedReader enterDigit = new BufferedReader(new InputStreamReader(System.in));
        try {
            String getResultInString = enterDigit.readLine();
            int resultFromReader = Integer.parseInt(getResultInString);
            System.out.println("You enter " + resultFromReader);
            return resultFromReader;
        } catch (Exception e) {
            System.out.println("Incorrect enter!");
            return 0;
        }
    }
    static final int correctDigit = 7;
    static void getResultIfConditionTrue(int digitForCondition){
        if(digitForCondition > correctDigit){
            System.out.println("Привет");
        }
    }
}
