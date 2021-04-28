package my.trainee.by.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class ResultForString {
    static final String nameForCompare = "вячеслав";

    public String getNameForCondition() {
        return nameForCondition;
    }

    private String nameForCondition;
    public ResultForString() {
        System.out.println("Enter name");
        this.nameForCondition = enterName();
    }
    String enterName() {
        String nameFromReader = "";
        try {
            BufferedReader readerForName = new BufferedReader(new InputStreamReader(System.in));
            nameFromReader = readerForName.readLine();
            } catch(IOException e){
                e.getMessage();
            }
            return nameFromReader;
    }
    public void getResult(String nameForCondition){
        System.out.println("You enter: " + nameForCondition );
        printHiIfNameCompareCondition(nameForCondition);
    }

    static void printHiIfNameCompareCondition(String name){
        if(name.toLowerCase(Locale.ROOT).strip().equals(nameForCompare)){
            System.out.println("Привет Вячеслав");
        }else {
            System.out.println("Entered value does not fit for condition!");
        }
    }
}
