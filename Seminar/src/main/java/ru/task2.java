package ru;

public class task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddd";
        StringBuilder result = new StringBuilder(' ');
        char buf = ' ';
        int count = 1;
        // RLE метод
        // результат = a4b3c1d3

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            }
            else {
                buf = str.charAt(i-1);
                result.append(buf);
                result.append(count);
                count = 1;
            }
        }
        System.out.println(result);


    }
}
