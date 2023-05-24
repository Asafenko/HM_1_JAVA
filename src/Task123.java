import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("""
                ”Your time is limited,
                    so don’t waste it
                         living someone else’s life”
                             Steve Jobs""");

        //////////////////////////////////////////////////////

        boolean bunting;
        do {
            System.out.println("Введите ваше значние:");
            while (!scanner.hasNextInt()){
                System.out.println("Некорректный ввод. Введите число:");
                scanner.next();
            }
            int num1 = scanner.nextInt();
            System.out.println("Значение: " + num1);

            System.out.println("Введите необходимый процент:");
            while (!scanner.hasNextInt()){
                System.out.println("Некорректный ввод. Введите число:");
                scanner.next();
            }
            int num2 = scanner.nextInt();
            System.out.println("Процент: " + num2);

            double answer =  (double) (num1 * num2) / 100;
            System.out.println("Ответ: " + answer);

            System.out.println("Хотите продолжить ? (y-да : n-нет):");
            char reply = scanner.next().charAt(0);
            bunting = reply == 'y' || reply == 'Y';
        }while(bunting);

        ////////////////////////////////

        boolean bunting2;
        String str = "";
        do{
            System.out.println("Enter number:");
            int num3 = scanner.nextInt();
            str +=  Integer.toString(num3) + "";

            System.out.println("Хотите ввести ещё число ? (y-да : n-нет):");
            char reply2 = scanner.next().charAt(0);
            bunting2 = reply2 == 'y' || reply2 == 'Y';
            if(!bunting2){
                System.out.println(str);
            }
        }while(bunting2);

        /////////////////////////////////////////////

        System.out.println("Введите шестизначное число !");

        String num = scanner.nextLine();
        if(num.length() != 6){
            System.out.println("\"Ошибка! Введите шестизначное число.\"");
        } else {
            System.out.println("Ваше число: " + num);
            char digits[] = num.toCharArray();
            char i = digits[0];
            digits[0] = digits[5];
            digits[5] = i;

            char k = digits[1];
            digits[1] = digits[4];
            digits[4] = k;
            String newNum = new String(digits);
            int intNum = Integer.parseInt(newNum);

            System.out.println("Новое число: " + intNum);
        }

        ////////////////////////////////////////////////////////////

        System.out.println("Введите число от 1 до 12 !" );
        int number = scanner.nextInt();
        if(number == 1 || number == 2 || number == 12){
            System.out.println("WINTER");
        }if(number >= 3 && number <=5){
            System.out.println("SPRING");
        }if(number >=6 && number <=8){
            System.out.println("SUMMER");
        }if(number >= 9 && number<=11){
            System.out.println("AUTUMN");
        }else{
            System.out.println("ОШИБКА");
        }

        /////////////////////////////////////////////////////////////

        System.out.println("Введите метры !");
        int length = scanner.nextInt();

        double miles = length * 0.0006213;
        System.out.println("В милях :" + miles);

        double yards = length * 1.09361;
        System.out.println("В ярдах :" + yards);

        double inches = length * 39.3701;
        System.out.println("В дюймах :" + inches);

        ///////////////////////////////////////////////////////////////

        System.out.println("Введите первое число !");
        int num = scanner.nextInt();
        System.out.println("Введите второе число !");
        int num2 = scanner.nextInt();

        int max = num > num2 ? num : num2;
        System.out.println("max: "+max);
        int min = num < num2 ? num : num2;
        System.out.println("min: "+min);
        int counter=0;
        for(int i = min; i <= max; i++){
            if(i % 2 ==0){
                counter++;
            }
        }
        System.out.println("Количество четных чисел от "+min +" до " + max +" равно: "+ counter);

        /////////////////////////////////////////////////////////////////////

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        while (min <= max) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(min + " * " + i + " = " + i * min);
            }
            System.out.println("---------------------------------");
            min++;
        }

        ///////////////////////////////////////////////////////////////////////

        int[] array = new int[100];
        int min = -10;
        int max = 100;

        for (int i = 0; i < 100; i++) {
            int rand = random.nextInt(max - min + 1) + min;
            array[i] = rand;
        }

        int k = 1;
        for (int i : array) {
            System.out.println("Число " + (k++) + ": " + i);
        }

//////////////////////////////////
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        System.out.println("Максимальное число: " + maximum);

//////////////////////////////////
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        System.out.println("Минимальное число: " + minimum);

//////////////////////////////////
        int negative = 0;
        for ( int i:array) {
            if(i < 0) negative++;
        }
        System.out.println("Колличество отрицательных чисел: " + negative);

//////////////////////////////////
        int positive=0;
        int positiveWithZero=0;
        for ( int i: array) {
            if(i >= 0) positiveWithZero++;
            if(i >0) positive++;
        }
        System.out.println("Колличество положительных чисел: " + positive + ", " +
                            "положительные с нулём: " + positiveWithZero);

//////////////////////////////////
        int countZero=0;
        for (int i : array) {
            if(i == 0) countZero++;
        }
        System.out.println("Колличество нулей: " + countZero);

        ////////////////////////////////////////////////////////////////////////

        int array2[] = new int[50];
        int min = -10;
        int max = 100;
        for (int i = 0; i < 50; i++) {
            int rand = random.nextInt(max - min + 1) + min;
            array2[i] = rand;
        }

        System.out.println("Наш массив из ста элементов");
        int k = 1;
        int count = 0;
        for (int i : array2) {
            System.out.print(" " + k++ + ") " + i + "  ");
            count++;
            if (count % 10 == 0) System.out.println();
        }

        /////////////////////////////////////////////////////////////////

        int evenIntegers[] = getEvenIntegers(array2);
        int len = evenIntegers.length;
        System.out.println("Массив из чётных чисел , колличество " + len);

        int index = 0;
        for (int i : evenIntegers) {
            System.out.print(i + " ");
            index++;
            if (index % 10 == 0) System.out.println();
        }
        System.out.println();
////////////////////////////////////////////////////////////

        int unevenIntegers[] = getUnevenIntegers(array2);
        int len2 = unevenIntegers.length;
        System.out.println("Массив из нечётных чисел , колличество " + len2);
        int index2 = 0;
        for (int i : unevenIntegers) {
            System.out.print(i + " ");
            index2++;
            if (index2 % 5 == 0) System.out.println();
        }
        System.out.println();
/////////////////////////////////////////////////////////////

        int negativeIntegers[] = getNegativeIntegers(array2);
        int len3 = negativeIntegers.length;
        System.out.println("Массив из отрицательных чисел , колличество " + len3);
        for (int i = 0; i < negativeIntegers.length; i++) {
            System.out.print(negativeIntegers[i] + " ");
            if (i % 5 == 0) System.out.println();
        }
        System.out.println();
/////////////////////////////////////////////////////////////////

        int positiveIntegers[] = getPositiveIntegers(array2);
        int len4 = positiveIntegers.length;
        System.out.println("Массив из положительных чисел , колличество " + len4);
        for(int i =0; i < positiveIntegers.length;i++){
            System.out.print(positiveIntegers[i] + " ");
            if(i % 10 == 0) System.out.println();
        }
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Выбрать горизонтально: 0 , вертикально: 1");
        int choose = scanner.nextInt();
        System.out.println("Колличество симвлов: ");
        int amount = scanner.nextInt();
        String spaces = " ".repeat(100);
        switch (choose){
            case 0:
                for(int i = 0; i < amount; i++){
                    System.out.print("(^_^)");
                }
                break;
            case 1:
                for(int i = 0; i < amount; i++) {
                    System.out.println(spaces + "(^_^)");
                }
                break;
            default:
                System.out.println("ERROR");
                break;
        }

        //////////////////////////////////////////////////////////////////////////

        int array3[] = {4,5,1,3,8,7,10,2,9,6};
        System.out.println("Сортировка по возрастанию: 1 , по убыванию: 0");
        int choose = scanner.nextInt();
        switch (choose){
            case 0:
                // выборчная сортировка
                for (int i = 0; i < array3.length - 1;i++){
                    int maxIndex = i;
                    for(int j = i + 1;j < array3.length;j++){
                        if(array3[j] > array3[maxIndex]) maxIndex = j;
                    }
                    int temp = array3[i];
                    array3[i] = array3[maxIndex];
                    array3[maxIndex] = temp;
                }
                System.out.println(Arrays.toString(array3));
                break;
            case 1:
                // пузырьковая сортировка
                for(int i =0;i < array3.length -1 ;i++){
                    for( int j =0; j < array3.length - i - 1 ;j++){
                        if(array3[j] > array3[j+1]){
                            int temp = array3[j];
                            array3[j] = array3[j + 1];
                            array3[j + 1] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(array3));
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    public static int[] getEvenIntegers(int array[]) {
        int quantity = 0;
        for (int i : array) {
            if (i % 2 == 0 && i > 1) quantity++;
        }
        int newEvenIntegers[] = new int[quantity];
        int index = 0;
        for (int i : array) {
            if (i % 2 == 0 && i > 1) {
                newEvenIntegers[index] = i;
                index++;
            }
        }
        return newEvenIntegers;
    }

    public static int[] getUnevenIntegers(int array[]) {
        int quantity = 0;
        for (int i : array) {
            if (i % 2 != 0 && i > 0) quantity++;
        }
        int newUnevenIntegers[] = new int[quantity];
        int index = 0;
        for (int i : array) {
            if (i % 2 != 0 && i > 0) {
                newUnevenIntegers[index] = i;
                index++;
            }
        }
        return newUnevenIntegers;
    }


    public static int[] getNegativeIntegers(int[] array) {
        int quantity = 0;
        for (int i : array) {
            if (i < 0) quantity++;
        }

        int newNegativeIntegers[] = new int[quantity];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newNegativeIntegers[index] = array[i];
                index++;
            }
        }
        return newNegativeIntegers;
    }

    public static int[] getPositiveIntegers(int[] array) {
        int quantity = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) quantity++;
        }

        int newPositiveIntegers[] = new int[quantity];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                newPositiveIntegers[index] = array[i];
                index++;
            }
        }
        return newPositiveIntegers;
    }


}
