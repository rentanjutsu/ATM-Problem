import java.util.Scanner;

   public class ATM {
      public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int amount = 0;
      //Prompt the user for amount in dollars
      System.out.print("Enter the amount: ");
      amount = userInput.nextLine.int();
      if (amount > 300) {//Print limit exceeded
      System.out.println("Limit of $300 exceeded!");
      }
      if (amount <= 300 && (amount > 0)); {//Calculate bills by denomination
      d20 = (amount / 20);
      d10 = ((amount % 20) / 10);
      d5 = (((amount % 20) % 10) / 5);
      d1 = ((((amount %20) % 10) % 5) / 1);
      System.out.println("Bills by denominations: " + 
      "/nt$20: " + d20 + 
      "/nt$10: " + d10 + 
      "/nt$5: " + d5 + 
      "/nt$1: " + d1 +
      "/n(amount) = " + "((d20) * $20)" + "((d10) * $10" + "((d5) * $5)" + "((d1) + * $1");
      }
   }
}