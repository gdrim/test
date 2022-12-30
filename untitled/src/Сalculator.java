import java.util.Scanner;

public class Сalculator {
    private double oper1;
    private char operation;
    private byte step;

    public void run() {
        boolean execution = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("For help use command \"help\"\n");
        while (execution) {
            String value = scanner.next().toString();
            switch (value) {
                case "exit":
                    execution = false;
                    break;

                case "help":
                    this.help();
                    break;

                case "C":
                    step = 0;
                    break;

                default:
                    calc(value);
                    break;
            }
        }
    }

    private void help() {
        System.out.print("Use \"C\" to reset\n");
        System.out.print("To exit - \"exit\"\n");
        System.out.print(
                "Calculate in three steps:\n" +
                        "1. Enter operand 1;\n" +
                        "2. Enter the operation;\n" +
                        "3. Enter operand 2.\n");
    }

    private void calc(String value) {
        switch (step) {
            case 0:
                break; // Integer.parseInt(value);
            case 1:
                /*if (value = "+" || value = "-" || value = "*" || value = "/") {

                } else {

                }*/
                break;
            case 2:
                step = 1;
                break;
        }
    }
}
