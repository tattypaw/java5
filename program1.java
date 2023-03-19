/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568 */

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class program1 {
        
        
    // public static Map<String, List<String>> phoneBook = new HashMap<>();
    
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in, "Cp866");
            Map<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
            boolean flag = true;
            ArrayList<String> list = new ArrayList<String>();
            while (flag){
                System.out.print("Задайте действие \n 1) Добавление номера \n 2) Вывод всего \n Ваш выбор: ");
                int ch = iScanner.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Имя: ");
                        String str = iScanner.next();
                        if (phoneBook.containsKey(str)) {
                            System.out.printf("%s: %s", str, phoneBook.get(str));
                            System.out.print("Введите дополнительный номер: ");
                            String number = iScanner.next();
                            list = new ArrayList<>();
                            list = phoneBook.get(str);
                            list.add(number);
                            phoneBook.put(str, list);
                            System.out.printf("%s: %s", str, phoneBook.get(str));
                            } else {
                                System.out.print("Введите номер: ");
                                String number = iScanner.next();
                                list = new ArrayList<>();
                                list.add(number);
                                phoneBook.put(str, list);
                                System.out.printf("%s: %s", str, phoneBook.get(str));
                            }
                        break;
                    case 2:
                        System.out.println(phoneBook);;
                        break;
                    default:
                        flag = false;
                        System.out.println("Конец работы");
                        break;
                }
            }
         
    }
}