public class Main {
    public static void main(String[] args) {
        // 1 задача
        int total = 0;
        short i = 0;
        while (total < 2_459_000) {
            i++;
            total += 15000;
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        // 2 задача
        byte l = 0;
        while (l < 10) {
            l++;
            System.out.print(l);
        }
        System.out.println();
        for (byte l1 = 10; l1 > 0; l1--) {
            System.out.print(l1);
        }
        System.out.println();
        // 3 задача
        int number = 12_000_000;
        float birth = 0.017f;
        float mortality = 0.008f;
        byte year = 0;
        while (year < 10) {
            year++;
            float population = number * (birth - mortality);
            float newPopulation = number + population;
            number = (int) newPopulation;
            System.out.println("Год " + year + ", численность населения составляет " + (int) newPopulation);
        }
        // 4 задача
        int amount = 15_000;
        short month = 0;
        while (amount < 12_000_000) {
            amount += amount * 0.07;
            month++;
            System.out.println("Месяц " + month + " сумма " + amount);
        }
        // 5 задача
        int amount1 = 15_000;
        short month1 = 0;
        while (amount1 < 12_000_000) {
            amount1 += amount1 * 0.07;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " сумма " + amount1);
            }
        }
        // 6 задача
        int amount2 = 15_000;
        short month2 = 0;
        while (month2 < 12 * 9) {
            amount2 += amount2 * 0.07;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма " + amount2);
            }
        }
        // 7 задача
        short Friday = 5;
        short days = 31;
        do {
            System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо подготовить отчет.");
            Friday += 7;
        } while (Friday <= days);
        // 8 задача
        short currentYear = 2024;
        for (short cometa = 0; cometa < 2124; cometa += 79) {
            if (currentYear - 200 < cometa && currentYear + 100 > cometa) {
                System.out.println(cometa);
            }
        }
    }
}