import java.util.Scanner;

   public class ATM {
      public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int amount = 0;
      //Prompt the user for amount in dollars
      System.out.print("Enter the amount: ");
      amount = userInput.nextInt();
      if (amount > 300) {//Print limit exceeded
      System.out.println("Limit of $300 exceeded!");
      }
      if (amount <= 300 && (amount > 0)); {//Calculate bills by denomination
      int d20 = (amount / 20);
      int d10 = ((amount % 20) / 10);
      int d5 = (((amount % 20) % 10) / 5);
      int d1 = ((((amount %20) % 10) % 5) / 1);
      System.out.println("Bills by denominations: " + 
      "\n\t$20: " + 20 + 
      "\n\t$10: " + 10 + 
      "\n\t$5: " + 5 + 
      "\n\t$1: " + 1 +
      "\n"amount + " = " + "(" + d20 + " * $20)" + "(" + d10 + " * 10)" + "(" + d5 + " * 5)" + "(" + d1 + " * 1)"
      }
   }
}