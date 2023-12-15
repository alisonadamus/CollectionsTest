package com.alisonadamus.collectionTest;

import java.util.Scanner;

public class Display {

    static Scanner scanner = new Scanner(System.in);

    static int many = 50000;
    static int more = 500000;
    static int theMost = 1000000;

    public static void errorKey() {
        System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
        main();
    }

    public static void main() {
        CollectionOperation.createColorList();

        System.out.println("Дослідження колекцій по функції:");
        System.out.println("[1] Додавання");
        System.out.println("[2] Фільтр");
        System.out.println("[3] Сортування");
        System.out.println("[4] Count");
        System.out.println("[5] Sum");
        System.out.println("[6] Середнє значення");
        System.out.println("[7] Об'єднання");
        System.out.println("[8] Match");
        System.out.println("[9] Завдання Stream API");

        switch (scanner.nextLine()) {
            case "1":
                adding();
                break;
            case "2":
                filter();
                break;
            case "3":
                sorting();
                break;
            case "4":
                count();
                break;
            case "5":
                sum();
                break;
            case "6":
                average();
                break;
            case "7":
                concat();
                break;
            case "8":
                match();
                break;
            case "9":
                srtreamTask();
                break;
            default:
                errorKey();
        }
    }

    public static void adding() {
        System.out.println("[1] Додавання примітивних даних");
        System.out.println("[2] Додавання об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.addPrimitiveCollections(many);
                MethodCalls.addPrimitiveCollections(more);
                MethodCalls.addPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.addObjectCollections(many);
                MethodCalls.addObjectCollections(more);
                MethodCalls.addObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void filter() {
        System.out.println("[1] Фільтр примітивних даних");
        System.out.println("[2] Фільтр об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.filterPrimitiveCollections(many);
                MethodCalls.filterPrimitiveCollections(more);
                MethodCalls.filterPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.filterObjectCollections(many);
                MethodCalls.filterObjectCollections(more);
                MethodCalls.filterObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void sorting() {
        System.out.println("[1] Сортування примітивних даних");
        System.out.println("[2] Сортування об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.sortPrimitiveCollections(many);
                MethodCalls.sortPrimitiveCollections(more);
                MethodCalls.sortPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.sortObjectCollections(many);
                MethodCalls.sortObjectCollections(more);
                MethodCalls.sortObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void count() {
        System.out.println("[1] Обрахунок кількості примітивних даних");
        System.out.println("[2] Обрахунок кількості об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.countPrimitiveCollections(many);
                MethodCalls.countPrimitiveCollections(more);
                MethodCalls.countPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.countObjectCollections(many);
                MethodCalls.countObjectCollections(more);
                MethodCalls.countObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void sum() {
        System.out.println("[1] Обрахунок суми примітивних даних");
        System.out.println("[2] Обрахунок суми об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.sumPrimitiveCollections(many);
                MethodCalls.sumPrimitiveCollections(more);
                MethodCalls.sumPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.sumObjectCollections(many);
                MethodCalls.sumObjectCollections(more);
                MethodCalls.sumObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void average() {
        System.out.println("[1] Обрахунок середнього значення примітивних даних");
        System.out.println("[2] Обрахунок середнього значення об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.averagePrimitiveCollections(many);
                MethodCalls.averagePrimitiveCollections(more);
                MethodCalls.averagePrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.averageObjectCollections(many);
                MethodCalls.averageObjectCollections(more);
                MethodCalls.averageObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void concat() {
        System.out.println("[1] Об'єднання примітивних даних");
        System.out.println("[2] Об'єднання об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.concatPrimitiveCollections(many);
                MethodCalls.concatPrimitiveCollections(more);
                MethodCalls.concatPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.concatObjectCollections(many);
                MethodCalls.concatObjectCollections(more);
                MethodCalls.concatObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    public static void match() {
        System.out.println("[1] Match примітивних даних");
        System.out.println("[2] Match об'єктів");

        switch (scanner.nextLine()) {
            case "1":
                MethodCalls.matchPrimitiveCollections(many);
                MethodCalls.matchPrimitiveCollections(more);
                MethodCalls.matchPrimitiveCollections(theMost);
                break;
            case "2":
                MethodCalls.matchObjectCollections(many);
                MethodCalls.matchObjectCollections(more);
                MethodCalls.matchObjectCollections(theMost);
                break;
            default:
                errorKey();
        }
        main();
    }

    private static void srtreamTask() {
        System.out.println("Введіть речення:");

        String string = scanner.nextLine();

        System.out.println("Змінене речення:");

        streamApiTask.changeSentence(string);

        main();
    }

}
