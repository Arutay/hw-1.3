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












    }
}