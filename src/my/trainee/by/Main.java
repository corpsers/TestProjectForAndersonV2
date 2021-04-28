package my.trainee.by;

import my.trainee.by.actions.ResultForArray;
import my.trainee.by.actions.ResultForDigit;
import my.trainee.by.actions.ResultForString;

import java.io.IOException;


public class Main {
    public static void main(String[] args)
    {
        ResultForDigit resultForDigit = new ResultForDigit();
        resultForDigit.getResult(resultForDigit.getDigitForCheck());
        ResultForArray resultForArray = new ResultForArray();
        resultForArray.getResult(resultForArray.getValuesFromReader());
        ResultForString resultForString = new ResultForString();
        resultForString.getResult(resultForString.getNameForCondition());

    }
}
