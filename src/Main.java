public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        for(int i =0; i <11; i++) {
            System.out.println(i);
        }
        // Задача 2
        System.out.println("Задача 2");
        for(int i =10; i > 0; i--) {
            System.out.println(i);
        }
        // Задача 3
        System.out.println("Задача 3");
        for(int i =0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        // Задача 4
        System.out.println("Задача 4");
        for(int i =10; i > -11; i--) {
            System.out.println(i);
        }
        // Задача 5
        System.out.println("Задача 5");
        for(int i =1904; i < 2097; i= i + 4) {
            System.out.println(i + " год является високосным");
        }
        // Задача 6
        System.out.println("Задача 6");
        for(int i =7; i < 99; i= i + 7) {
            System.out.println(i);
        }
        // Задача 7
        System.out.println("Задача 7");
        for(int i =1; i < 513; i= i * 2) {
            System.out.println(i);
        }
        // Задача 8
        System.out.println("Задача 8");
        int sum = 29000;
        int totalAmount = 0;
        for(int i =1; i < 13; i++) {
            totalAmount = totalAmount + sum;
            System.out.println("Месяц " + i + ", сумма накопленная составляет " + totalAmount + " рублей");
        }
        // Задача 9
        System.out.println("Задача 9");
        int sum1 = 29000;
        int totalAmount1 = 0;
        for(int i =1; i < 13; i++) {
            totalAmount1 = totalAmount1 + totalAmount1/100;
            totalAmount1 = totalAmount1 + sum1;
            System.out.println("Месяц " + i + ", сумма накопленний равна " + totalAmount1 + " рублей");
        }
        // Задача 10
        System.out.println("Задача 10");
        for(int i = 1; i < 11; i++) {
            int sum2 = 2 * i;
            System.out.println("2 * " + i + " = " + sum2);
        }
    }
}