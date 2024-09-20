import java.util.Scanner;

public class IT24102434Lab7Q1B
{
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);

        int i;
        int num1,num2,num3,num4;
        double average;

        for(i=1; i<=3; i++)
        {
            System.out.println("Student "+i);

            System.out.print("Enter marks: ");
            num1 = input.nextInt(); 
            num2 = input.nextInt(); 
            num3 = input.nextInt();
            num4 = input.nextInt();
            
            average = (num1 + num2 + num3 + num4) / 4.0;
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

            System.out.println("");

        }
        

       
    }

}