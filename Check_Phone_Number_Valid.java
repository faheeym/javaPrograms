/*
(Check Phone Number) Write a program that prompts the user to enter their phone number in the format DDD-DDD-DDDD, where D is a digit. Your program should check whether the input is valid. 

Here are two sample runs:

Enter a phone number: 232−213−5435 
232−213−5435 is a valid phone number

Enter a phone number: 23−213−5435 
23−213−5435 is an invalid phone number

*/
import java.util.*;
public class index {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String enter;
        System.out.print("Enter a phone number: ");
        enter = input.nextLine();
        boolean a= (enter.length()==12) &&(Character.isDigit(enter.charAt(0)))
                &&(Character.isDigit(enter.charAt(1))) &&(Character.isDigit(enter.charAt(2))) && (enter.charAt(3)=='-')
                &&(Character.isDigit(enter.charAt(4)))&&(Character.isDigit(enter.charAt(5)))
                &&(Character.isDigit(enter.charAt(6)))&& enter.charAt(7)=='-'&&(Character.isDigit(enter.charAt(8)))&&(Character.isDigit(enter.charAt(9)))
                &&(Character.isDigit(enter.charAt(10)))&&(Character.isDigit(enter.charAt(11)));

        if(!a){
            System.out.print(enter+" is not a valid number");
        }
        else{
            System.out.print(enter+" is a valid number");
        }
    }
}
