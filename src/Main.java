public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Цикл for");
        System.out.println("\n" + "Задача #1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }
        System.out.println("\n" + "Задача #2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }
        System.out.println("\n" + "Задача #3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Число " + i);
        }
        System.out.println("\n" + "Задача #4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }
        System.out.println("\n" + "Задача #5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("\n" + "Задача #6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Число " + i);
        }
        System.out.println("\n" + "Задача #7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Число " + i);
        }
        System.out.println("\n" + "Задача #8 - 9");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\n" + "Задача #10");
        int numberOne = 1, numberTwo = 1, numberThree;
        System.out.print(numberOne + " " + numberTwo + " ");
        for (int i = 2; i < 11; i++) {
            numberThree = numberOne + numberTwo;
            System.out.print(numberThree + " ");
            numberOne = numberTwo;
            numberTwo = numberThree;

        }
        System.out.println("\n" + "Цикл while");
        System.out.println("\n" + "Задача #1");
        int accumulation = 15_000;
        int totalAccumulation = 0;
        int month = 1;
        while (totalAccumulation <= 2_459_000) {
            totalAccumulation = totalAccumulation + totalAccumulation / 100;
            totalAccumulation = totalAccumulation + accumulation;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalAccumulation + " рублей");
            month++;
        }
        System.out.println("\n" + "Задача #2");
        int plus = 1;
        while (plus <= 10) {
            System.out.print(plus + " ");
            plus++;
        }
        System.out.println(" ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "Задача #3");
        int population = 12_000_000;
        int birth = population / 1_000 * 17;
        int death = population / 1_000 * 8;
        int totalPopulation = birth - death;
        int year = 1;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population = population + totalPopulation;
            year++;
        }
        System.out.println("\n" + "Задача #4 - 6");
        float totalAmount = 12_000_000f;
        float actualAmount = 15_000f;
        float percentInMonth = (actualAmount / 100) * 7;
        int monthCount = 1;
        int nineYears = 108;
        while (actualAmount < totalAmount) {
            if (monthCount % 6 == 0 && monthCount <= nineYears) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений " + actualAmount);
            }
            actualAmount += percentInMonth;
            monthCount++;
        }
        System.out.println("\n" + "Задача #7");
        int firstFriday = 2;
        int week = 7;
        while (firstFriday <= 31) {
            System.out.println(firstFriday + " число этого месяца - пятница. Ура!");
            firstFriday += week;
        }
        System.out.println("\n" + "Задача #8");
        int actualYear = 2022;
        int startYear = actualYear - 200;
        int finishYear = actualYear + 100;
        while (startYear <= finishYear) {
            if (startYear % 79 == 0){
                System.out.println(startYear);
            }
            startYear++;
        }
    }
}