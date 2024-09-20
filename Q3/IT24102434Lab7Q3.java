import java.util.Scanner;

public class IT24102434Lab7Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        int i,number1,number2;
        char cash1 = 'c';
        char cash2 = 'C';
        char other1 = 'o';
        char other2 = 'O';
        double discount,amount;

        for(i=1 ; i<=5 ; i++)
        {
            System.out.println("Customer "+i);

            System.out.print("Enter total bill amount: ");
            number1 = input.nextInt();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            number2 = input.next().charAt(0);

            if(number2==cash1 || number2==cash2) 
            {
                discount = (number1*5.00)/100.00;
                System.out.println("Discount is : "+discount);
                
                amount = number1 - discount;
                System.out.println("Amount to be paid: "+amount);

                System.out.print("\n");
               
            }
            else if (number2==other1 || number2==other2)
            {
                System.out.println("No discount applicable");

                amount = number1;
                System.out.println("Amount to be paid: "+amount);

                System.out.print("\n");             
            }
            else if (number2!=cash1 || number2!=cash2 || number2!=other1 || number2!=other2)
            {
                System.out.println("Payment Mode is Not Valid");

                System.out.print("\n");
                
            }   
        }

       
        
        
        
    }
}


    
