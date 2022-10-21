import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter commands. Then type exit when finished");
        String cmd = s.nextLine();
        Calculator calc = new Calculator();
        while (!cmd.equalsIgnoreCase("exit")) {
            String[] cmdArgs = cmd.split(" ");
            if (cmdArgs[0].equalsIgnoreCase("add")) {
                System.out.println(calc.add(Integer.parseInt(cmdArgs[1]), Integer.parseInt(cmdArgs[2])));
            }
            else if (cmdArgs[0].equalsIgnoreCase("subtract")) {
                System.out.println(calc.subtract(Integer.parseInt(cmdArgs[1]), Integer.parseInt(cmdArgs[2])));
            }
            else if (cmdArgs[0].equalsIgnoreCase("multiply")) {
                System.out.println(calc.multiply(Integer.parseInt(cmdArgs[1]), Integer.parseInt(cmdArgs[2])));
            }
            else if (cmdArgs[0].equalsIgnoreCase("fibonacci")) {
                System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(cmdArgs[1])));
            }
            else if (cmdArgs[0].equalsIgnoreCase("binary")) {
                System.out.println(calc.intToBinaryNumber(Integer.parseInt(cmdArgs[1])));
            }
            cmd = s.nextLine();
        }
        System.out.println("goodbye");
    }
}
