package Collections_hm.HM_Dictionary;

import java.util.Map;
import java.util.Scanner;

public class TestDictionary {
    public static void main(String[] args) {

        Eng_Rus_Dictionary dictionary = new Eng_Rus_Dictionary();

        dictionary.addWord("air ","воздух");
        dictionary.addWord("well ","хорошо");
        dictionary.addWord("play ","играть");
        dictionary.addWord("small ","маленький");
        dictionary.addWord("home ","дом");
        dictionary.addWord("hand ","рука");
        dictionary.addWord("very ","очень");
        dictionary.addWord("low ","низкий");
        dictionary.addWord("much ","много");
        dictionary.addWord("day ","день");

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить слово");
            System.out.println("2. Изменить перевод");
            System.out.println("3. Удалить перевод");
            System.out.println("4. Удалить слово");
            System.out.println("5. Отобразить перевод");
            System.out.println("6. Отобразить топ 10 популярных слов");
            System.out.println("7. Отобразить топ 10 непопулярных слов");
            System.out.println("8. Выйти из программы");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите слово:");
                    String word = scanner.nextLine();
                    System.out.println("Введите перевод:");
                    String translation = scanner.nextLine();
                    dictionary.addWord(word, translation);
                    System.out.println("Слово добавлено в словарь.");
                    break;
                case 2:
                    System.out.println("Введите слово:");
                    word = scanner.nextLine();
                    System.out.println("Введите новый перевод:");
                    translation = scanner.nextLine();
                    dictionary.updateTranslation(word, translation);
                    break;
                case 3:
                    System.out.println("Введите слово:");
                    word = scanner.nextLine();
                    dictionary.deleteTranslation(word);
                    break;
                case 4:
                    System.out.println("Введите слово:");
                    word = scanner.nextLine();
                    dictionary.deleteWord(word);
                    break;
                case 5:
                    System.out.println("Введите слово:");
                    word = scanner.nextLine();
                    dictionary.displayTranslation(word);
                    break;
                case 6:
                    dictionary.displayPopularWords();
                    break;
                case 7:
                    dictionary.displayUnpopularWords();
                    break;
                case 8:
                    run = false;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }


        }

    }
}

