package ru;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class DZ_3 {
    public static void main(String[] args) {
        /*
        3**** Дана json строка (можно сохранить в файл и читать из файла)
        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

        Пример вывода:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
         */

//        File file = new File("/Users/pavel/Documents/IT/2022-09-05_Java_seminar2/Seminar/Students.json");
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(ParseJson(jsonString));



//        try (PrintWriter wr = new PrintWriter(file)) {
//            wr.println(); // запись построковая
//        } catch (IOException ex) {
//            System.out.println(ex.getLocalizedMessage());
//        }
    }

    public static String ParseJson (String str) {

        StringBuilder resultStringB = new StringBuilder();
        //        String resultStr = str.substring(str.indexOf('.') + 1, str.indexOf(':'));
        String [] newStringArray = str.replace("[", "").replace("]","").split("},\\{");
//        String [] temp = newStringArray[0].replace("{", "");
        for (int i = 0; i < newStringArray.length; i++) {
            System.out.println(newStringArray[i]);
        }

//        for (int i = 0; i < charArray.length; i++) {
//
//
//            System.out.print(charArray[i]);
//        }

//        System.out.println(stringArray);
//
//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
//        }



//        for (int i = 0; i < stringArray.length; i++) {
//            if (!stringArray[i].contains("null")) {             // если не содержит подстроку null
//                sb.append(stringArray[i].split(":")[0])
//                        .append(" = ").append('\'')
//                        .append(stringArray[i].split(":")[1])
//                        .append('\'').append(" and ");
//            }
//        }
        return str;
    }


}
