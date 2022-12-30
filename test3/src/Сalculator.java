import java.util.Scanner;

public class Сalculator {
    private double oper1;
    private char operation;
    private byte step;

    public Сalculator() {
    }

    public void run() {
        boolean execution = true;
        String value;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Для справки используйьте \"help\"\n");
        while (execution) {
            this.printInstr();
            value = scanner.next().toString();
            switch (value) {
                case "exit":
                    execution = false;
                    break;
                case "help":
                    this.help();
                    break;
                case "C":
                    this.step = 0;
                    break;
                default:
                    this.calc(value);
                    break;
            }
        }
    }

    private void printInstr() {
        switch (this.step) {
            case 0:
                System.out.print("Введите число или команду\n");
                break;
            case 1:
                System.out.print("Введите операцию или команду\n");
                break;
            case 2:
                System.out.print("Введите число или команду\n");
                break;
        }
    }

    private void help() {
        System.out.print("Используйте \"C\" для сброса\n");
        System.out.print("Используйте \"exit\" для выхода\n");
        System.out.print("Вычисление в три шага:\n1. Введите операнд 1;\n2. Введите операцию;\n3. Введите операнд 2.\n");
    }

    private void calc(String value) {
        switch (this.step) {
            case 0:
                try {
                    oper1 = Double.parseDouble(value);
                    this.step = 1;
                } catch (NumberFormatException e) {
                } catch (NullPointerException e) {
                }
                break;
            case 1:
                this.operation = value.charAt(0);
                if (this.operation == '+' || this.operation == '-' || this.operation == '*' || this.operation == '/') {
                    this.step = 2;
                }
                break;
            case 2:
                try {
                    double oper2 = Double.parseDouble(value);

                    switch (operation) {
                        case '+':
                            oper1 += oper2;
                            this.step = 1;
                            System.out.print("Результат - " + oper1 + "\n");
                            break;
                        case '-':
                            oper1 -= oper2;
                            this.step = 1;
                            System.out.print("Результат - " + oper1 + "\n");
                            break;
                        case '*':
                            oper1 *= oper2;
                            this.step = 1;
                            System.out.print("Результат - " + oper1 + "\n");
                            break;
                        case '/':
                            if (oper2 != 0.0) {
                                oper1 /= oper2;
                                this.step = 1;
                                System.out.print("Результат - " + oper1 + "\n");
                            } else {
                                System.out.print("Нельзя делить на 0\n");
                            }
                            break;
                    }
                } catch (NumberFormatException e) {
                } catch (NullPointerException e) {
                }
                break;
        }
    }
}