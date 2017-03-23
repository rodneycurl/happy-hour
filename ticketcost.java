// This program allows for a zoo visitor to calculate the cost of their ticket by entering their age and day they wish to visit the Zoo.
import javax.swing.JOptionPane;

public class TicketCost {
  public static void main(String[] args) {
    double ticketPrice = 0.0;
  //The user will enter their age then based on their age the price of their ticket will be assigned, childrens tickets under 6 are free, all other tickets are not free
  int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
  //This if else statement will validate that the user is entering in integer for their age
  if (age > 0 && age < 999) {
    if (age < 6) {
      ticketPrice = 0.00;
    }
    else{
      if(age >= 6 && age < 18) {
        ticketPrice = 2.93;
      }
      else{
        if (age >= 18) {
          ticketPrice = 8.65;
        }
        else{
        }
      }
    }
  }
else {
  JOptionPane.showMessageDialog(null,"You have entered an invalid age");
}
String monday = "Monday";
   String tuesday = "Tuesday";
   String wednesday = "Wednesday";
   String thursday = "Thursday";
   String friday = "Friday";
   String saturday = "Saturday";
   String sunday = "Sunday";
   double discountRate = 0.0;
   String weekDay = JOptionPane.showInputDialog("What day would you like to visit the Zoo? ");
   if ((weekDay.equalsIgnoreCase(monday)) || (weekDay.equalsIgnoreCase(tuesday)) || (weekDay.equalsIgnoreCase(wednesday)) || (weekDay.equalsIgnoreCase(thursday)) || (weekDay.equalsIgnoreCase(friday)) || (weekDay.equalsIgnoreCase(saturday)) || (weekDay.equalsIgnoreCase(sunday))) {
      if ((weekDay.equalsIgnoreCase(monday)) || (weekDay.equalsIgnoreCase(tuesday)) || (weekDay.equalsIgnoreCase(wednesday)) || (weekDay.equalsIgnoreCase(thursday)) || (weekDay.equalsIgnoreCase(friday))) {
         discountRate = 0.20;
      }
      else{
         if ((weekDay.equalsIgnoreCase(saturday)) || (weekDay.equalsIgnoreCase(sunday))) {
            discountRate = 0.00;
         }
         else {
         }
      }
   }
   else {
      JOptionPane.showMessageDialog(null,"You entered an invalid week day");
   }
   //The convenience fee is the dame for each ticket
   double convenienceFee = 0.85;
   //The discount is the amount that will be subtracted from the actual price of the ticket
   double discount = discountRate * ticketPrice ;
   // ticketCost is the total cost of the ticket before the sales tax is applied
   double ticketCost = (ticketPrice - discount) + convenienceFee;
   double salesTax = ticketCost * 0.10;
   // totalCost is the price of the ticket after the sales tax has been added
   double totalCost = ticketCost + salesTax;
   JOptionPane.showMessageDialog(null, "Ticket Reciept\n" + "Age of ticket holder: " + age + "\nCost of the ticket: " + String.format("$%.2f",ticketCost) + " (Convenience Fee: " + String.format("$%.2f",convenienceFee) + " and Discount: " + String.format("$%.2f",(discountRate * 100)) + "%" + ")" + "\nSales Tax: " + String.format("$%.2f",salesTax) + "\nTotal Cost: " + String.format("$%.2f",totalCost));
   }
}
