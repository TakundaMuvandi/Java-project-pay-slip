import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class InCome {
    public void Main() {
    }

    public static void main(String[] args) throws IOException {
        double weekdayRate = 18.0;
        double weekendRate = 20.0;
        double savingsRate = 0.75;
        boolean wasItWeekend = true;
        Date now = new Date();
        FileWriter fw = new FileWriter("Income.txt", true);
        PrintWriter outputFile = new PrintWriter(fw);
        System.out.println("Hello sir please input the hours you worked");
        Scanner keyboard = new Scanner(System.in);
        double hoursWorked = keyboard.nextDouble();
        System.out.println("You worked during the weekend : true/false");
        wasItWeekend = keyboard.nextBoolean();
        double pay;
        if (wasItWeekend) {
            pay = hoursWorked * weekendRate;
        } else {
            pay = hoursWorked * weekdayRate;
        }

        System.out.println("Please input the tips you received ");
        double tips = keyboard.nextDouble();
        double totalPay = tips + pay;
        double savings = savingsRate * totalPay;
        double myMoney = totalPay - savings;
        System.out.println("Your total pay is : $" + totalPay);
        System.out.println("Please set aside this amount as your savings :$" + savings);
        System.out.println("Money for your day today :$" + myMoney);
        outputFile.println(now);
        outputFile.println("Good day, Here is your income Sir Muvandi ");
        outputFile.println("Pay for the day :$" + totalPay);
        outputFile.println("These are your savings :$" + savings);
        outputFile.println("Here is your allowance :$" + myMoney);
        outputFile.close();
    }
}
