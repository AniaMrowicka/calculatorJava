package parser;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static int operation;
    public static double result = 0;
    public static void main(String[] args) {
        // Stwórz aplikację kalkulatora. Kalkulator powinien pozwalać na operowanie na stale jednej zmiennej.
        // Po uruchomieniu kalkulator mówi:
        double number = 5;

        printResult(result);
        operation = firstMenuOption();
        while (true) {
            selectAvailableOption(operation, number);
            operation = menuOption();
        }



        // **Dodatkowe rozwinięcie.
        // Zapisuj do pliku wszystkie polecenia użytkownika (NIE ZAPISUJ PYTAŃ KTÓRE KIERUJESZ DO NIEGO)
        // Po każdym uruchomieniu aplikacji dopisuj do pliku jedną pustą linię żeby rozdzielić kolejne uruchomienia aplikacji.
        // Plik ma być czytelny dla użytkownika. Wyników nie zapisuj w pliku. Stan pliku po powyższym:


    }

    public static void printResult(double result) {
        System.out.println("Twój wynik to: " + (int)result);
    }

    public static int firstMenuOption() {
        System.out.println("Co chcesz zrobić? (Wpisz przyporządkowaną liczbę) \nNasze opcje to: \n1:dodaj X \n2:odejmij X" +
                "\n3:mnóż X \n4:dziel X \n5:czyść");
        operation = scanner.nextInt();
        return operation;
    }
    public static int menuOption() {
        System.out.println("Co chcesz zrobić?");
                operation = scanner.nextInt();
        return operation;
    }

    public static void selectAvailableOption(int operation, double number) {
        switch (operation) {
            case 1:
                result = addNumber(result, number);
                printResult(result);
                break;
            case 2:
                result = substractNumber(result, number);
                printResult(result);
                break;
            case 3:
                result = multiplyNumber(result, number);
                printResult(result);
                break;
            case 4:
                result = divideTheNumber(result, number);
                printResult(result);
                break;
            case 5:
                printResult(clear());
                break;
            default:
                System.out.println("błąd");
                break;
        }
    }

    public static double addNumber(double result, double number) {
        return result + number;
    }

    public static double substractNumber(double result, double number) {
        return result - number;
    }

    public static double multiplyNumber(double result, double number) {
        return result * number;
    }

    public static double divideTheNumber(double result, double number) {
        return result / number;
    }

    public static double clear() {
        result = 0;
        return result;
    }
}
