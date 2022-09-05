package ru;

public class task3 {
    public static void main(String[] args) {
        // полиндром
        // (линейный алгоритм) написать программу где в тексте используется самый длинный полиндром

        String word = "abcdcba";
        char[] array = word.toCharArray();
        boolean result = false;

        for (int i = 0; i < array.length/2-1; i++) {
            if (array[i] == array[array.length-i-1]) {
                result = true;
            }
            else result = false;
        }
        System.out.println(result);
    }
}
