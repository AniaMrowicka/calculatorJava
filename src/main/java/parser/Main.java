package parser;

import java.io.*;
import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")
class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int operation;
    private static double result = 0;
    private static double number = 5;


    public static void main(String[] args) throws IOException {
            saveToFile("");
        printResult(result);
        operation = firstMenuOption();
        while (true) {
            selectAvailableOption(operation, number);
            operation = menuOption();
        }

    }

    private static void saveToFile(String command)  {
        Writer output = null;
        try {
            output = new BufferedWriter(new FileWriter("C:\\Users\\mrowi\\IdeaProjects\\Calculator\\src\\main\\java\\parser\\messages.txt", true
            ));
            output.write("\n");
            if (command != "" || command != null){
               output.append(command);
            }
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printResult(double result) {
        System.out.println("Twój wynik to: " + (int)result);
    }

    private static int firstMenuOption() {
        System.out.println("Co chcesz zrobić? (Wpisz przyporządkowaną liczbę) \nNasze opcje to: \n1:dodaj X \n2:odejmij X" +
                "\n3:mnóż X \n4:dziel X \n5:czyść");
        operation = scanner.nextInt();
        return operation;
    }
    private static int menuOption() {
        System.out.println("Co chcesz zrobić?");
                operation = scanner.nextInt();
        return operation;
    }

    private static void selectAvailableOption(int operation, double number) {
        switch (operation) {
            case 1:
                saveToFile("dodaj "+(int)number);
                result = addNumber(result, number);
                printResult(result);
                break;
            case 2:
                saveToFile("odejmij "+(int)number);
                result = substractNumber(result, number);
                printResult(result);
                break;
            case 3:
                saveToFile("pomnóż "+(int)number);
                result = multiplyNumber(result, number);
                printResult(result);
                break;
            case 4:
                saveToFile("dziel "+(int)number);
                result = divideTheNumber(result, number);
                printResult(result);
                break;
            case 5:
                saveToFile("czyść "+(int)number);
                printResult(clear());
                break;
            default:
                System.out.println("błąd");
                break;
        }
    }

    private static double addNumber(double result, double number) {
        return result + number;
    }

    private static double substractNumber(double result, double number) {
        return result - number;
    }

    private static double multiplyNumber(double result, double number) {
        return result * number;
    }

    private static double divideTheNumber(double result, double number) {
        return result / number;
    }

    private static double clear() {
        result = 0;
        return result;
    }
}
