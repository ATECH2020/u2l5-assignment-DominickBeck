import java.util.Scanner;

public class ConstructionTester
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    double lumber = 8;
    double windows = 11;

    System.out.println("Enter the sales tax rate: ");
    double taxRate = scanner.nextDouble();

    System.out.println("How many boards do you need? ");
    int numBoards = scanner.nextInt();

    System.out.println("How many windows do you need? ");
    int numWindows = scanner.nextInt();

    Construction c = new Construction(lumber, windows, taxRate);
    double total = c.windowCost(numWindows) + c.lumberCost(numBoards);
    System.out.println("Total: " + total);
    double grandTotal = c.grandTotal(total);
    System.out.println("Grand Total: " + grandTotal);
  }
}
