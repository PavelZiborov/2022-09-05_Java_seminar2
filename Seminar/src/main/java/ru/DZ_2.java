package ru;
import java.io.*;

public class DZ_2 {
    public static void main(String[] args) {
        /*
        2. Дана строка sql-запроса "select * from students where ".
        Сформируйте часть WHERE этого запроса, используя StringBuilder.
        Данные для фильтрации приведены ниже в виде json строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        Ответ: "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'" для приведенного примера
         */

        StringBuilder sb = new StringBuilder("select * from students where ");

        String filter = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";

        String filer2 = filter.replace("\"", "").replace("{","").replace("}", "");
        // name:Ivanov,country:Russia,city:Moscow,age:null

        String[] array1 = filer2.split(",");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals("age:null")) {
//                System.out.println(array1[i]);
            } else {
                sb.append(array1[i]);

            }
//            System.out.println(array1[i]);
//            name:Ivanov
//            country:Russia
//            city:Moscow
//            age:null
        }
        System.out.println(sb);
        // "select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'"




    }
}