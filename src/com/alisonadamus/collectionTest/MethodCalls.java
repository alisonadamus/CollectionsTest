package com.alisonadamus.collectionTest;

public class MethodCalls {
    public static void addPrimitiveCollections(int initialCapacity) {
        CollectionOperation.createPrimitiveCollections(initialCapacity);

        System.out.println("Результати додавання " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }

    public static void addObjectCollections(int initialCapacity) {
        CollectionOperation.createObjectCollections(initialCapacity);

        System.out.println("Результати додавання " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }

    public static void sortPrimitiveCollections(int initialCapacity){
        CollectionOperation.sortingPrimitiveCollections(initialCapacity);

        System.out.println("Результати сортування " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }

    public static void sortObjectCollections(int initialCapacity){
        CollectionOperation.sortObjectCollections(initialCapacity);

        System.out.println("Результати сортування " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }
    public static void filterPrimitiveCollections(int initialCapacity){
        CollectionOperation.filteringPrimitiveCollections(initialCapacity);

        System.out.println("Результати фільтрації " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }
    public static void filterObjectCollections(int initialCapacity){
        CollectionOperation.filteringObjectCollections(initialCapacity);

        System.out.println("Результати фільтрації " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }

    public static void countPrimitiveCollections(int initialCapacity){
        CollectionOperation.countingPrimitiveCollections(initialCapacity);

        System.out.println("Результати counting " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }
    public static void countObjectCollections(int initialCapacity){
        CollectionOperation.countingObjectCollections(initialCapacity);

        System.out.println("Результати counting " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }

    public static void sumPrimitiveCollections(int initialCapacity){
        CollectionOperation.summingPrimitiveCollections(initialCapacity);

        System.out.println("Результати sum " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }
    public static void sumObjectCollections(int initialCapacity){
        CollectionOperation.summingObjectCollections(initialCapacity);

        System.out.println("Результати sum " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }

    public static void averagePrimitiveCollections(int initialCapacity){
        CollectionOperation.averagingPrimitiveCollections(initialCapacity);

        System.out.println("Результати average " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }
    public static void averageObjectCollections(int initialCapacity){
        CollectionOperation.averagingObjectCollections(initialCapacity);

        System.out.println("Результати average " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }

    public static void concatPrimitiveCollections(int initialCapacity){
        CollectionOperation.concatingPrimitiveCollections(initialCapacity);

        System.out.println("Результати об'єднання " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }
    public static void concatObjectCollections(int initialCapacity){
        CollectionOperation.concatingObjectCollections(initialCapacity);

        System.out.println("Результати об'єднання " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }

    public static void matchPrimitiveCollections(int initialCapacity){
        CollectionOperation.matchPrimitiveCollections(initialCapacity);

        System.out.println("Результати match " + initialCapacity + " числових даних");
        CollectionOperation.getResults();
    }
    public static void matchObjectCollections(int initialCapacity){
        CollectionOperation.matchObjectCollections(initialCapacity);

        System.out.println("Результати match " + initialCapacity + " об'єктів");
        CollectionOperation.getResults();
    }
}
