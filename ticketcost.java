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
