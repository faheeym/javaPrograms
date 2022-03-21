/*
(Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
Here is a sample run of the program:

The card you picked is Jack of Hearts

*/
import java.util.*;
public class index {
    public static void main(String[] args) {
       int max=13, min=1;
        Random num= new Random();
        int number = num.nextInt(13+1)+1;
        int card=num.nextInt(4+1)+1;

        System.out.print("The card you picked is ");
        if(number==1){
            System.out.print("Ace");
        }
        else if(number==2){
            System.out.print("Two of");
        }
        else if(number==3){
            System.out.print("Three of");
        }
        else if(number==4){
            System.out.print("Four of");
        }
        else if(number==5){
            System.out.print("Five of");
        }
        else if(number==6){
            System.out.print("Six of");
        }else if(number==7){
            System.out.print("Seven of");
        }
        else if(number==8){
            System.out.print("Eight of");
        }
        else if(number==9){
            System.out.print("Nine of");
        }
        else if(number==10){
            System.out.print("Ten of");
        }else if(number==11){
            System.out.print("Jack of");
        }else if(number==12){
            System.out.print("Queen of");
        }else{
            System.out.print("King of");
        }

        if(card==1){
            System.out.print(" Clubs");

        }
        else if(card==2){
            System.out.print(" Spades");
        }
        else if(card==3){
            System.out.print(" Hearts");
        }
        else{
            System.out.print(" Diamonds");
        }


    }
}
