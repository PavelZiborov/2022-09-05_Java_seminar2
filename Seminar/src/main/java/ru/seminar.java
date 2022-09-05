package ru;

public class seminar {
    public static void main(String[] args) {

        // Работа со строками

        // сравнение пула строк и нового элемента типа String
        String str = new String("first");
        System.out.println(str == "first");

        // сравнение пула строк и пула строк
        String str2 = "second";
        System.out.println(str2 == "second");

        // сравнение посимвольное (лучше их сравнивать через equals)
        System.out.println("v Через equals: ");
        System.out.println(str.equals("first"));
        System.out.println(str2.equals("second"));
        System.out.println("^ Через equals: ");



        // Вывести n раз 2 переменные "чар"
        int n = 12;
        char c1 = 'a';
        char c2 = 'b';
        // ababab
        String result = task1(c1,c2,n);
        System.out.println(result);

    }

    public static String task1 (char a, char b, int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(a);
            str.append(b);
        }
        return str.toString();
    }
}
