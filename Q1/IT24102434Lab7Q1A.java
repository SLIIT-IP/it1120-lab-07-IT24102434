import java.util.Scanner;

public class IT24102434Lab7Q1A
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);

        int i,sum=0;
        int number;
        double average;

        System.out.println("Enter marks for four subjects:");

        for( i=1; i<=4 ; i++)
        {
            System.out.print("Enter Subject Mark "+i+": ");
            number = input.nextInt();
            sum = sum + number;
        }

        
        average = sum / 4.0;
       
        System.out.println("");
        System.out.println("Average is : " + average);

        if(average>=0 && average<=49)
        {
            System.out.println("Overall Grade is : Fail");  
        }
        else if(average>=50 && average<=74)
        {
            System.out.println("Overall Grade is : Credit");
        }
        else if(average>=75 && average<=100)
        {
            System.out.println("Overall Grade is : Distinction");
        }
       
    }
}