package com.alisonadamus.collectionTest;

import java.util.Arrays;
import java.util.List;

public class streamApiTask {
    public static void changeSentence(String string){
        List<String> listStrings = Arrays.asList(string.toLowerCase().split(" "));
        listStrings.stream()
            .map(x -> new StringBuilder(x).reverse().toString())
            .forEachOrdered(x -> System.out.print("\u001B[32m" + x + " \u001B[0m"));
        System.out.println(" ");
    }
}
