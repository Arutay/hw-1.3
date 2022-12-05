public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1 ");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом int равно " + applesCount);
        byte orangesCount = 4;
        System.out.println("Значение переменной orangesCount с типом byte равно " + orangesCount);
        short catsCount = 3;
        System.out.println("Значение переменной catsCount с типом short равно " + catsCount);
        long peopleCount = 7_500_000_000L;
        System.out.println("Значение переменной peopleCount с типом long равно " + peopleCount);
        float pi = 3.141592F;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double e = 2.8;
        System.out.println("Значение переменной e с типом double равно " + e);

        // Задача 2
        System.out.println("Задача 2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        // Задача 3
        System.out.println("Задача 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int papers = 480;
        int papersPerPupil = papers / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        // Задача 4
        System.out.println("Залача 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут произвела бутылок " + productivityPerMinute * twentyMinutes + " штук");
        int minutesInDay = 24 * 60;
        System.out.println("За " + minutesInDay + " минут произвела бутылок " + productivityPerMinute * minutesInDay + " штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За " + minutesInThreeDays + " минут произвела бутылок " + productivityPerMinute * minutesInThreeDays + " штук");
        int minutesInMonth = 10 * minutesInThreeDays;
        System.out.println("За " + minutesInMonth + " минут произвела бутылок " + productivityPerMinute * minutesInMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPeerClass = 2;
        int brownCansPeerClass = 4;
        int totalClasses = totalCans / (whiteCansPeerClass + brownCansPeerClass);
        int totalWhiteCans = totalClasses * whiteCansPeerClass;
        int totalBrownCans = totalClasses * brownCansPeerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        int weightOneBananas = 80;
        int weightFiveBananas = weightOneBananas * bananas;
        System.out.println("Вес всех бананов составляет " + weightFiveBananas + " грамм");
        int milk = 200;
        int weight100Ml = 105;
        int weight200Ml = weight100Ml + weight100Ml;
        System.out.println("Вес молока составляет " + weight200Ml + " грамм");
        int iceCream = 2;
        int iceCreamOne = 100;
        int weightIceCream = iceCreamOne + iceCreamOne;
        System.out.println("Вес пломбира составляет " + weightIceCream + " грамм");
        int eggs = 4;
        int eggsOne = 70;
        int weightFourEggs = eggsOne * eggs;
        System.out.println("Вес яиц составляет " + weightFourEggs + " грамм");
        int totalWeight = weightFiveBananas + weight200Ml +weightIceCream + weightFourEggs;
        float oneKg = 1000;
        float kg = totalWeight / oneKg;
        System.out.println("Вес спорт- завтрака составляет " + totalWeight + " грамм");
        System.out.println("в килограммах - это будет " + kg + " кг");

        // Задача 7
        System.out.println("Задача 7");
        int loseWeight = 7000;
        int weightLoseOneDay = 250;
        int totalDay = loseWeight / weightLoseOneDay;
        System.out.println("Уйдет " + totalDay + " дней, если будет скидывать по " + weightLoseOneDay + " грамм ");
        int losWeight = 7000;
        int weightLosOneDay = 500;
        int totalBay = losWeight / weightLosOneDay;
        System.out.println("Уйдет " + totalBay + " дней, если будет скидывать по " + weightLosOneDay + " грамм ");
        int a = 14;
        int b = 28;
        int middle = a + b;
        System.out.println("Среднее количество дней составит " + middle + " дня");

        // Задача 8
        System.out.println("Задача 8");
        long m = 67760;
        double procM = 100;
        double  j = m / procM;
        int k = 10;
        j = j * k;
        double total = j + m;
        int month = 12;
        long totalMashaOld = m * month;
        double maxTotal = total * month;
        double raz = maxTotal - totalMashaOld;

        System.out.println("Маша теперь получает " + total + " р. Годовой доход вырос на " + raz + " p");
        long d = 83690;
        double pr = 100;
        double u = d / pr;
        int i = 10;
        u = u * i;
        double totalD = u + d;
        int monthD = 12;
        long totalDenisOld = d * monthD;
        double maxTotalD = totalD * monthD;
        double razD = maxTotalD - totalDenisOld;
        System.out.println("Денис теперь получает " + totalD + " р. Годовой доход вырос на " + razD + "р");
        long t = 76230;
        double r = 100;
        double g = t / r;
        int h = 10;
        j = g * h;
        double totalK = j + t;
        int monthK = 12;
        long totalKrisOld = t * monthK;
        double maxTotalK = totalK * monthK;
        double razK = maxTotalK - totalKrisOld;
        System.out.println("Кристина теперь получает  " + totalK + " р. Годовой доход вырос на " + razK + "р");































    }
}