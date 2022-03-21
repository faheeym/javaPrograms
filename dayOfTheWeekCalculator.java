/*
(Science: day of the week) Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is

h=(q+(26(m+1)))+k+(k/4)+(j/4)+(5*j))%7

where
h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).
q is the day of the month.
m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
j is year/100.
k is the year of the century (i.e., year % 100).

Note all divisions in this exercise perform an integer division.

(Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m and 2015 for year, m will be 13 and year will be 2014 used in the formula.)

Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.

Here is a sample run:

Enter year: (e.g., 2008): 2019
Enter month: 1-12: 1
Enter the day of the month: 1-31: 22
Day of the week is Tuesday

*/
import java.util.*;
public class index {
    public static void main(String[] args) {
        int h;
        int q,m,j,k;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2008):");
        k=input.nextInt();

        System.out.print("Enter month: 1-12: ");
        m=input.nextInt();
        while(m>12){
            System.out.print("There are 12 months in a year. Please input a number from 1-12: ");
            m=input.nextInt();
        }
        System.out.print("Enter the day of the month: 1-31: ");
        q=input.nextInt();
        while(q>31){
            System.out.print("A day Cannot have more than 31 days in a month. Try again!: ");
            q=input.nextInt();
        }

        k=k%100;
        j=k/100;

        h=((q+((26*(m+1)))/10)+(k+(k/4))+(j/4)+5*j)%7;

        if(h==0){
            System.out.print("Day of the week is Saturday");
        }
        else if(h==1){
            System.out.println("Day of the week is Sunday");
        }
        else if(h==2){
            System.out.println("Day of the week is Monday");
        }
        else if(h==3){
            System.out.println("Day of the week is Tuesday");
        }
        else if(h==4){
            System.out.println("Day of the Week is Wednesday");
        }
        else if(h==5){
            System.out.println("Day of the week is Thursday");
        }
        else{
            System.out.println("Day of the week is Friday");
        }

    }
}
