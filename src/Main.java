public class Main {
    public static void main(String[] args) {
        //задание 1
        int dog = 7;
        byte cat = 1;
        short mouse = 3;
        long elephant = 110L;
        double sugarWeihgt = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog > 10;
        char bar = 35;
        System.out.println(dogIsAdult);

        //задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightOffDiffernce = boxer2 - boxer1;
        System.out.println("Общий вес боксеров" + weightOfAllBoxers);
        System.out.println("Разница в весе" + weightOffDiffernce);

        //задание 3
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200 / 100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int eggs = 4;
        int eggsWeight = 70;

        int total = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (eggs * eggsWeight);
        int gramsInKg = 1000;
        double totalKgs = total / (gramsInKg * 1.0);
        System.out.println("общий вес" + totalKgs);

        //задание 4
        int weight = 7;
        int grammsInKg = 1000;
        int weightInGrams = weight * grammsInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / maxGramsPerDay;
        int maxDays = weightInGrams / minGramsPerDay;

        double avgDays = (minDays + maxDays) / 2;
        System.out.println("минимум дней" + minDays);
        System.out.println("максимум дней" + maxDays);
        System.out.println("дней в среднем" + avgDays);

        //задание 5
        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));
        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary +" рублей. Годовой доход вырос на " + mashaDifference +" рублей");
        System.out.println("Денис теперь получает " + denisNewSalary +" рублей. Годовой доход вырос на " + denisDifference +" рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary +" рублей. Годовой доход вырос на " + kristinaDifference +" рублей");

    }
}