package com.alisonadamus.collectionTest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperation {

    static List<Integer> randomIntegers;
    static List<TestObject> randomObjects;
    static ArrayList<Integer> integerArrayList;
    static ArrayList<TestObject> objectArrayList;
    static LinkedList<Integer> integerLinkedList;
    static LinkedList<TestObject> objectLinkedList;
    static ArrayDeque<Integer> integerArrayDeque;
    static ArrayDeque<TestObject> objectArrayDeque;
    static HashSet<Integer> integerHashSet;
    static HashSet<TestObject> objectHashSet;
    static LinkedHashSet<Integer> integerLinkedHashSet;
    static LinkedHashSet<TestObject> objectLinkedHashSet;
    static TreeSet<Integer> integerTreeSet;
    static TreeSet<TestObject> objectTreeSet;
    static Map<Integer, String> randomIntegerMap;
    static Map<Integer, TestObject> randomObjectMap;
    static HashMap<Integer, String> integerHashMap;
    static HashMap<Integer, TestObject> objectHashMap;
    static LinkedHashMap<Integer, String> integerLinkedHashMap;
    static LinkedHashMap<Integer, TestObject> objectLinkedHashMap;
    static TreeMap<Integer, String> integerTreeMap;
    static TreeMap<Integer, TestObject> objectTreeMap;
    static long startTime;
    static long endTime;
    static long result;
    static Map<String, Long> timeResults;
    static List<String> sortedResults;
    static List<String> colors = new ArrayList<>();
    static boolean testBool;
    static long testLong;
    static OptionalDouble testOptionalDouble;

    public static void createColorList() {
        colors.add("\u001B[32m");
        colors.add("\u001B[32m");
        colors.add("\u001B[32m");
        colors.add("\u001B[33m");
        colors.add("\u001B[33m");
        colors.add("\u001B[33m");
        colors.add("\u001B[31m");
        colors.add("\u001B[31m");
        colors.add("\u001B[31m");
    }

    public static void getResults() {
        sortedResults = timeResults.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .map(entry -> entry.getValue() + "\t" + entry.getKey())
            .toList();

        for (int i = 0; i < 9; i++) {
            System.out.println(colors.get(i) + sortedResults.get(i) + "\u001B[0m");
        }
    }

    public static void createRandomIntegers(int initialCapacity) {
        randomIntegers = Stream.generate(() -> new Random().nextInt(100000))
            .limit(initialCapacity)
            .toList();

        randomIntegerMap = Stream.generate(() -> new Random().nextInt(100000))
            .limit(initialCapacity)
            .collect(Collectors.toMap(Object::hashCode, String::valueOf,
                (existing, replacement) -> existing));
    }

    public static void createPrimitiveCollections(int initialCapacity) {
        createRandomIntegers(initialCapacity);
        timeResults = new HashMap<>();

        startTime = System.currentTimeMillis();
        integerArrayList = new ArrayList<>(randomIntegers);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("Arraylist", result);

        startTime = System.currentTimeMillis();
        integerLinkedList = new LinkedList<>(randomIntegers);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedList", result);

        startTime = System.currentTimeMillis();
        integerArrayDeque = new ArrayDeque<>(randomIntegers);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("ArrayDeque", result);

        startTime = System.currentTimeMillis();
        integerHashSet = new HashSet<>(randomIntegers);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashSet", result);

        startTime = System.currentTimeMillis();
        integerLinkedHashSet = new LinkedHashSet<>(randomIntegers);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashSet", result);

        startTime = System.currentTimeMillis();
        integerTreeSet = new TreeSet<>(randomIntegers);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeSet", result);

        startTime = System.currentTimeMillis();
        integerHashMap = new HashMap<>(randomIntegerMap);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashMap", result);

        startTime = System.currentTimeMillis();
        integerLinkedHashMap = new LinkedHashMap<>(randomIntegerMap);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashMap", result);

        startTime = System.currentTimeMillis();
        integerTreeMap = new TreeMap<>(randomIntegerMap);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeMap", result);
    }

    public static void createRandomObjects(int initialCapacity) {
        randomObjects = Stream.generate(TestObject::new)
            .limit(initialCapacity)
            .toList();

        randomObjectMap = Stream.generate(TestObject::new)
            .limit(initialCapacity)
            .collect(Collectors.toMap(TestObject::getId, x -> x,
                (existing, replacement) -> existing));

    }

    public static void createObjectCollections(int initialCapacity) {
        createRandomObjects(initialCapacity);
        timeResults = new HashMap<>();

        startTime = System.currentTimeMillis();
        objectArrayList = new ArrayList<>(randomObjects);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("Arraylist", result);

        startTime = System.currentTimeMillis();
        objectLinkedList = new LinkedList<>(randomObjects);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedList", result);

        startTime = System.currentTimeMillis();
        objectArrayDeque = new ArrayDeque<>(randomObjects);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("ArrayDeque", result);

        startTime = System.currentTimeMillis();
        objectHashSet = new HashSet<>(randomObjects);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashSet", result);

        startTime = System.currentTimeMillis();
        objectLinkedHashSet = new LinkedHashSet<>(randomObjects);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashSet", result);

        startTime = System.currentTimeMillis();
        objectTreeSet = new TreeSet<>(Comparator.comparingInt(TestObject::getId));
        objectTreeSet.addAll(randomObjects);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeSet", result);

        startTime = System.currentTimeMillis();
        objectHashMap = new HashMap<>(randomObjectMap);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashMap", result);

        startTime = System.currentTimeMillis();
        objectLinkedHashMap = new LinkedHashMap<>(randomObjectMap);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashMap", result);

        startTime = System.currentTimeMillis();
        objectTreeMap = new TreeMap<>(randomObjectMap);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeMap", result);
    }

    public static void sortingPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        startTime = System.currentTimeMillis();
        integerArrayList = integerArrayList.parallelStream().sorted()
            .collect(Collectors.toCollection(ArrayList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("Arraylist", result);

        startTime = System.currentTimeMillis();
        integerLinkedList = integerLinkedList.parallelStream().sorted()
            .collect(Collectors.toCollection(LinkedList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedList", result);

        startTime = System.currentTimeMillis();
        integerArrayDeque = integerArrayDeque.parallelStream().sorted()
            .collect(Collectors.toCollection(ArrayDeque::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("ArrayDeque", result);

        startTime = System.currentTimeMillis();
        integerHashSet = integerHashSet.parallelStream().sorted()
            .collect(Collectors.toCollection(HashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashSet", result);

        startTime = System.currentTimeMillis();
        integerLinkedHashSet = integerLinkedHashSet.parallelStream().sorted()
            .collect(Collectors.toCollection(LinkedHashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashSet", result);

        startTime = System.currentTimeMillis();
        integerTreeSet = integerTreeSet.parallelStream().sorted()
            .collect(Collectors.toCollection(TreeSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeSet", result);

        startTime = System.currentTimeMillis();
        integerHashMap = integerHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                HashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashMap", result);

        startTime = System.currentTimeMillis();
        integerLinkedHashMap = integerLinkedHashMap.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                LinkedHashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashMap", result);

        startTime = System.currentTimeMillis();
        integerTreeMap = integerTreeMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                TreeMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeMap", result);
    }

    public static void sortObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        startTime = System.currentTimeMillis();
        objectArrayList = objectArrayList.parallelStream()
            .sorted(Comparator.comparing(TestObject::getId))
            .collect(Collectors.toCollection(ArrayList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("Arraylist", result);

        startTime = System.currentTimeMillis();
        objectLinkedList = objectLinkedList.parallelStream()
            .sorted(Comparator.comparing(TestObject::getId))
            .collect(Collectors.toCollection(LinkedList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedList", result);

        startTime = System.currentTimeMillis();
        objectArrayDeque = objectArrayDeque.parallelStream()
            .sorted(Comparator.comparing(TestObject::getId))
            .collect(Collectors.toCollection(ArrayDeque::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("ArrayDeque", result);

        startTime = System.currentTimeMillis();
        objectHashSet = objectHashSet.parallelStream()
            .sorted(Comparator.comparing(TestObject::getId))
            .collect(Collectors.toCollection(HashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashSet", result);

        startTime = System.currentTimeMillis();
        objectLinkedHashSet = objectLinkedHashSet.parallelStream()
            .sorted(Comparator.comparing(TestObject::getId))
            .collect(Collectors.toCollection(LinkedHashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashSet", result);

        startTime = System.currentTimeMillis();
        objectTreeSet = objectTreeSet.parallelStream()
            .collect(Collectors.toCollection(
                () -> new TreeSet<>(Comparator.comparing(TestObject::getId))));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeSet", result);

        startTime = System.currentTimeMillis();
        objectHashMap = objectHashMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                HashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashMap", result);

        startTime = System.currentTimeMillis();
        objectLinkedHashMap = objectLinkedHashMap.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                LinkedHashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashMap", result);

        startTime = System.currentTimeMillis();
        objectTreeMap = objectTreeMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                TreeMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeMap", result);
    }

    public static void filteringPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        startTime = System.currentTimeMillis();
        integerArrayList = integerArrayList.parallelStream().filter(x -> x < 50000)
            .collect(Collectors.toCollection(ArrayList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("Arraylist", result);

        startTime = System.currentTimeMillis();
        integerLinkedList = integerLinkedList.parallelStream().filter(x -> x < 50000)
            .collect(Collectors.toCollection(LinkedList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedList", result);

        startTime = System.currentTimeMillis();
        integerArrayDeque = integerArrayDeque.parallelStream().filter(x -> x < 50000)
            .collect(Collectors.toCollection(ArrayDeque::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("ArrayDeque", result);

        startTime = System.currentTimeMillis();
        integerHashSet = integerHashSet.parallelStream().filter(x -> x < 50000)
            .collect(Collectors.toCollection(HashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashSet", result);

        startTime = System.currentTimeMillis();
        integerLinkedHashSet = integerLinkedHashSet.parallelStream().filter(x -> x < 50000)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashSet", result);

        startTime = System.currentTimeMillis();
        integerTreeSet = integerTreeSet.parallelStream().filter(x -> x < 50000)
            .collect(Collectors.toCollection(TreeSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeSet", result);

        startTime = System.currentTimeMillis();
        integerHashMap = integerHashMap.entrySet().stream().filter(x -> x.getKey() < 50000)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                HashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashMap", result);

        startTime = System.currentTimeMillis();
        integerLinkedHashMap = integerLinkedHashMap.entrySet().stream()
            .filter(x -> x.getKey() < 50000)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                LinkedHashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashMap", result);

        startTime = System.currentTimeMillis();
        integerTreeMap = integerTreeMap.entrySet().stream().filter(x -> x.getKey() < 50000)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                TreeMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeMap", result);
    }

    public static void filteringObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        startTime = System.currentTimeMillis();
        objectArrayList = objectArrayList.parallelStream().filter(x -> x.getId() < 50000)
            .collect(Collectors.toCollection(ArrayList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("Arraylist", result);

        startTime = System.currentTimeMillis();
        objectLinkedList = objectLinkedList.parallelStream().filter(x -> x.getId() < 50000)
            .collect(Collectors.toCollection(LinkedList::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedList", result);

        startTime = System.currentTimeMillis();
        objectArrayDeque = objectArrayDeque.parallelStream().filter(x -> x.getId() < 50000)
            .collect(Collectors.toCollection(ArrayDeque::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("ArrayDeque", result);

        startTime = System.currentTimeMillis();
        objectHashSet = objectHashSet.parallelStream().filter(x -> x.getId() < 50000)
            .collect(Collectors.toCollection(HashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashSet", result);

        startTime = System.currentTimeMillis();
        objectLinkedHashSet = objectLinkedHashSet.parallelStream().filter(x -> x.getId() < 50000)
            .collect(Collectors.toCollection(LinkedHashSet::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashSet", result);

        startTime = System.currentTimeMillis();
        objectTreeSet = objectTreeSet.parallelStream().filter(x -> x.getId() < 50000)
            .collect(Collectors.toCollection(
                () -> new TreeSet<>(Comparator.comparing(TestObject::getId))));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeSet", result);

        startTime = System.currentTimeMillis();
        objectHashMap = objectHashMap.entrySet().stream().filter(x -> x.getKey() < 50000)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                HashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("HashMap", result);

        startTime = System.currentTimeMillis();
        objectLinkedHashMap = objectLinkedHashMap.entrySet().stream()
            .filter(x -> x.getKey() < 50000)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                LinkedHashMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("LinkedHashMap", result);

        startTime = System.currentTimeMillis();
        objectTreeMap = objectTreeMap.entrySet().stream().filter(x -> x.getKey() < 50000)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                TreeMap::new));
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put("TreeMap", result);
    }

    public static void countingPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        countigCollection(integerArrayList);
        countigCollection(integerLinkedList);
        countigCollection(integerArrayDeque);
        countigCollection(integerHashSet);
        countigCollection(integerLinkedHashSet);
        countigCollection(integerTreeSet);
        countingMap(integerHashMap);
        countingMap(integerLinkedHashMap);
        countingMap(integerTreeMap);
    }

    public static void countingObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        countigCollection(objectArrayList);
        countigCollection(objectLinkedList);
        countigCollection(objectArrayDeque);
        countigCollection(objectHashSet);
        countigCollection(objectLinkedHashSet);
        countigCollection(objectHashSet);
        countingMap(objectHashMap);
        countingMap(objectLinkedHashMap);
        countingMap(objectTreeMap);
    }

    public static void countigCollection(Collection<?> collection) {
        startTime = System.currentTimeMillis();
        testLong = collection.parallelStream().collect(Collectors.counting());
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void countingMap(Map<?, ?> map) {
        startTime = System.currentTimeMillis();
        testLong = map.entrySet().parallelStream().collect(Collectors.counting());
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(map.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void summingPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        sumPrimitiveCollection(integerArrayList);
        sumPrimitiveCollection(integerLinkedList);
        sumPrimitiveCollection(integerArrayDeque);
        sumPrimitiveCollection(integerHashSet);
        sumPrimitiveCollection(integerLinkedHashSet);
        sumPrimitiveCollection(integerTreeSet);
        sumPrimitiveMap(integerHashMap);
        sumPrimitiveMap(integerLinkedHashMap);
        sumPrimitiveMap(integerTreeMap);
    }

    public static void summingObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        sumObjectCollection(objectArrayList);
        sumObjectCollection(objectLinkedList);
        sumObjectCollection(objectArrayDeque);
        sumObjectCollection(objectHashSet);
        sumObjectCollection(objectLinkedHashSet);
        sumObjectCollection(objectTreeSet);
        sumObjectMap(objectHashMap);
        sumObjectMap(objectLinkedHashMap);
        sumObjectMap(objectTreeMap);
    }

    public static void sumPrimitiveCollection(Collection<Integer> collection) {
        startTime = System.currentTimeMillis();
        testLong = collection.parallelStream().mapToInt(Integer::intValue).sum();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void sumObjectCollection(Collection<TestObject> collection) {
        startTime = System.currentTimeMillis();
        testLong = collection.parallelStream().mapToInt(TestObject::getId).sum();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void sumPrimitiveMap(Map<Integer, ?> map) {
        startTime = System.currentTimeMillis();
        testLong = map.keySet().parallelStream().mapToInt(Integer::intValue).sum();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(map.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void sumObjectMap(Map<Integer, TestObject> map) {
        startTime = System.currentTimeMillis();
        testLong = map.values().parallelStream().mapToInt(TestObject::getId).sum();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(map.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void averagingPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        averagePrimitiveCollection(integerArrayList);
        averagePrimitiveCollection(integerLinkedList);
        averagePrimitiveCollection(integerArrayDeque);
        averagePrimitiveCollection(integerHashSet);
        averagePrimitiveCollection(integerLinkedHashSet);
        averagePrimitiveCollection(integerTreeSet);
        averagePrimitiveMap(integerHashMap);
        averagePrimitiveMap(integerLinkedHashMap);
        averagePrimitiveMap(integerTreeMap);
    }

    public static void averagingObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        averageObjectCollection(objectArrayList);
        averageObjectCollection(objectLinkedList);
        averageObjectCollection(objectArrayDeque);
        averageObjectCollection(objectHashSet);
        averageObjectCollection(objectLinkedHashSet);
        averageObjectCollection(objectTreeSet);
        averageObjectMap(objectHashMap);
        averageObjectMap(objectLinkedHashMap);
        averageObjectMap(objectTreeMap);
    }

    public static void averagePrimitiveCollection(Collection<Integer> collection) {
        startTime = System.currentTimeMillis();
        testOptionalDouble = collection.parallelStream().mapToInt(Integer::intValue).average();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void averageObjectCollection(Collection<TestObject> collection) {
        startTime = System.currentTimeMillis();
        testOptionalDouble = collection.parallelStream().mapToInt(TestObject::getId).average();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void averagePrimitiveMap(Map<Integer, ?> map) {
        startTime = System.currentTimeMillis();
        testOptionalDouble = map.keySet().parallelStream().mapToInt(Integer::intValue).average();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(map.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void averageObjectMap(Map<Integer, TestObject> map) {
        startTime = System.currentTimeMillis();
        testOptionalDouble = map.values().parallelStream().mapToInt(TestObject::getId).average();
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(map.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void concatingPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        ArrayList<Integer> secondIntegerArrayList = new ArrayList<>(randomIntegers);
        LinkedList<Integer> secondIntegerLinkedList = new LinkedList<>(randomIntegers);
        ArrayDeque<Integer> secindIntegerArrayDeque = new ArrayDeque<>(randomIntegers);
        HashSet<Integer> secondIntegerHashSet = new HashSet<>(randomIntegers);
        LinkedHashSet<Integer> secondIntegerLinkedHashSet = new LinkedHashSet<>(randomIntegers);
        TreeSet<Integer> secondIntegerTreeSet = new TreeSet<>(randomIntegers);
        HashMap<Integer, String> secondIntegerHashMap = new HashMap<>(randomIntegerMap);
        LinkedHashMap<Integer, String> secondIntegerLinkedHashMap = new LinkedHashMap<>(
            randomIntegerMap);
        TreeMap<Integer, String> secondIntegerTreeMap = new TreeMap<>(randomIntegerMap);

        concatCollections(integerArrayList, secondIntegerArrayList);
        concatCollections(integerLinkedList, secondIntegerLinkedList);
        concatCollections(integerArrayDeque, secindIntegerArrayDeque);
        concatCollections(integerHashSet, secondIntegerHashSet);
        concatCollections(integerLinkedHashSet, secondIntegerLinkedHashSet);
        concatCollections(integerTreeSet, secondIntegerTreeSet);
        concatMap(integerHashMap, secondIntegerHashMap);
        concatMap(integerLinkedHashMap, secondIntegerLinkedHashMap);
        concatMap(integerTreeMap, secondIntegerTreeMap);

    }

    public static void concatingObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        ArrayList<TestObject> secondObjectArrayList = new ArrayList<>(randomObjects);
        LinkedList<TestObject> secondObjectLinkedList = new LinkedList<>(randomObjects);
        ArrayDeque<TestObject> secindObjectArrayDeque = new ArrayDeque<>(randomObjects);
        HashSet<TestObject> secondObjectHashSet = new HashSet<>(randomObjects);
        LinkedHashSet<TestObject> secondObjectLinkedHashSet = new LinkedHashSet<>(randomObjects);
        TreeSet<TestObject> secondObjectTreeSet = new TreeSet<>(Comparator.comparingInt(TestObject::getId));
        secondObjectTreeSet.addAll(randomObjects);
        HashMap<Integer, TestObject> secondObjectHashMap = new HashMap<>(randomObjectMap);
        LinkedHashMap<Integer, TestObject> secondObjectLinkedHashMap = new LinkedHashMap<>(
            randomObjectMap);
        TreeMap<Integer, TestObject> secondObjectTreeMap = new TreeMap<>(randomObjectMap);

        concatCollections(objectArrayList, secondObjectArrayList);
        concatCollections(objectLinkedList, secondObjectLinkedList);
        concatCollections(objectArrayDeque, secindObjectArrayDeque);
        concatCollections(objectHashSet, secondObjectHashSet);
        concatCollections(objectLinkedHashSet, secondObjectLinkedHashSet);
        concatCollections(objectTreeSet, secondObjectTreeSet);
        concatMap(objectHashMap, secondObjectHashMap);
        concatMap(objectLinkedHashMap, secondObjectLinkedHashMap);
        concatMap(objectTreeMap, secondObjectTreeMap);

    }

    public static void concatCollections(Collection<?> firstCollection,
        Collection<?> secondcollection) {

        startTime = System.currentTimeMillis();
        Stream<?> stream = Stream.concat(firstCollection.stream(), secondcollection.stream());
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(firstCollection.getClass().toString().replace("class java.util.", ""),
            result);
    }

    public static void concatMap(Map<?, ?> firstMap, Map<?, ?> secondMap) {
        startTime = System.currentTimeMillis();
        Stream<?> stream = Stream.concat(firstMap.entrySet().stream(), secondMap.entrySet().stream());
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(firstMap.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void matchPrimitiveCollections(int initialCapacity) {
        createPrimitiveCollections(initialCapacity);
        timeResults = new HashMap<>();

        allMatchPrimitiveCollection(integerArrayList);
        allMatchPrimitiveCollection(integerLinkedList);
        allMatchPrimitiveCollection(integerArrayDeque);
        allMatchPrimitiveCollection(integerHashSet);
        allMatchPrimitiveCollection(integerLinkedHashSet);
        allMatchPrimitiveCollection(integerTreeSet);
        allMatchMap(integerHashMap);
        allMatchMap(integerLinkedHashMap);
        allMatchMap(integerTreeMap);
    }

    public static void matchObjectCollections(int initialCapacity) {
        createObjectCollections(initialCapacity);
        timeResults = new HashMap<>();

        allMatchObjectCollection(objectArrayList);
        allMatchObjectCollection(objectLinkedList);
        allMatchObjectCollection(objectArrayDeque);
        allMatchObjectCollection(objectHashSet);
        allMatchObjectCollection(objectLinkedHashSet);
        allMatchObjectCollection(objectTreeSet);
        allMatchMap(objectHashMap);
        allMatchMap(objectLinkedHashMap);
        allMatchMap(objectTreeMap);
    }

    public static void allMatchPrimitiveCollection(Collection<Integer> collection) {
        startTime = System.currentTimeMillis();
        testBool = collection.parallelStream().allMatch(x -> x < 1000);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void allMatchObjectCollection(Collection<TestObject> collection) {
        startTime = System.currentTimeMillis();
        testBool = collection.parallelStream().allMatch(x -> x.getId() < 1000);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(collection.getClass().toString().replace("class java.util.", ""), result);
    }

    public static void allMatchMap(Map<Integer, ?> map) {
        startTime = System.currentTimeMillis();
        testBool = map.entrySet().parallelStream().allMatch(x -> x.getKey() > 1000);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        timeResults.put(map.getClass().toString().replace("class java.util.", ""), result);
    }
}