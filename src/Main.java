public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myInt = 20;
        byte myByte = 7;
        short myShort = 850;
        long myLong = 110000L;
        float myFloat = 6.5f;
        double myDouble = 11.99;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        float a = 27.12f;
        System.out.println("а = " + a);
        long b = 987678965549L;
        System.out.println("b = " + b);
        float c = 2.786f;
        System.out.println("c = " + c);
        short d = 569;
        System.out.println("d = " + d);
        short e = -159;
        System.out.println("e = " + e);
        short f = 27897;
        System.out.println("f = " + f);
        byte g = 67;
        System.out.println("g = " + g);

        byte teacherLp = 23;
        System.out.println("У Людмилы Павловны - " + teacherLp + " ученика");
        byte teacherAs = 27;
        System.out.println("у Анны Сергеевны - " + teacherAs + " ученика");
        byte teacherEa = 30;
        System.out.println("у Екатерины Андреевны - " + teacherEa + " учеников");
        short piecePaper = 480;
        System.out.println("Три учительницы закупили все вместе " + piecePaper + " листов бумаги на все три класса");
        int student = teacherLp + teacherAs + teacherEa;
        System.out.println("Всего " + student + " учеников");
        int pPaperst = piecePaper / student;
        System.out.println("На каждого ученика рассчитано " + pPaperst + " листов бумаги");

        byte proBottle = 16;
        byte proTime = 2;
        System.out.println("Производительность машины для изготовления бутылок - " + proBottle + " бутылок за " + proTime + " минуты");
        byte prod20min = 20;
        short prodDay = 24 * 60;
        short prod3Day = (24 * 60) * 3;
        int prod1Month = (24 * 60) * 30;
        System.out.println("За 20 минут машина проивела " + (prod20min / proTime) * proBottle + " штук бутылок");
        System.out.println("За сутки машина проивела " + (prodDay / proTime) * proBottle + " штук бутылок");
        System.out.println("За 3 дня машина проивела " + (prod3Day / proTime) * proBottle + " штук бутылок");
        System.out.println("За 1 месяц машина проивела " + (prod1Month / proTime) * proBottle + " штук бутылок");

        byte schoolPot = 120;
        byte clPotw = 2;
        byte clPotb = 4;
        int clPot = clPotw + clPotb;
        System.out.println("На ремонт школы нужно " + schoolPot + " банок краски двух цветов: белой и коричневой");
        System.out.println("На ремонт одного класса нужно " + clPot + " банок краски двух цветов: белой и коричневой");
        int numClass = schoolPot / clPot;
        int clW = numClass * clPotw;
        int clB = numClass * clPotb;
        System.out.println("В школе, где " + numClass + " классов, нужно " + clW + " банок белой краски и " + clB + " банок коричневой краски");

        byte bananas = 5;
        short milk = 200;
        byte iceCrsun = 2;
        byte rawEggs = 4;
        short bananasW = 5 * 80;
        short milkW = 2 * 105;
        short iceCrsunW = 2 * 100;
        short rawEggsW = 4 * 70;
        int weightProducts = bananasW + milkW + iceCrsunW + rawEggsW;
        float weightProductskg = weightProducts / 1000f;
        System.out.println("В один рецепт входит " + bananas + " бананов, весом " + bananasW + " грамм; "
                + milk + " мл молока, весом " + milkW + " грамм; "
                + iceCrsun + " брикета мороженное-пломбир, весом " + iceCrsunW + " грамм; "
                + rawEggs + " яйца сырые, весом " + rawEggsW + " грамм;");
        System.out.println("Общий вес продуктов для завтрака " + weightProducts + " грамм");
        System.out.println("Общий вес продуктов для завтрака " + weightProductskg + " кг");

        byte loseWeight = 7;
        short weight1 = 250;
        short weight2 = 500;
        int averageWeight = (weight1 + weight2) / 2;
        float loWeitkg = loseWeight * 1000;
        float wD1 = loWeitkg / weight1;
        float wD2 = loWeitkg / weight2;
        float wD3 = loWeitkg / averageWeight;
        System.out.printf("%.0f дней уйдет на похудение, если спортсмен будет терять каждый день по %d грамм \n", wD1, weight1);
        System.out.printf("%.0f дней уйдет на похудение, если спортсмен будет терять каждый день по %d грамм \n", wD2, weight2);
        System.out.printf("%.1f дней уйдет на похудение, если спортсмен будет терять каждый день по %d грамм \n", wD3, averageWeight);

        byte loseWeight1 = 7;
        short weight11 = 250;
        short weight21 = 500;
        int averageWeight1 = (weight11 + weight21) / 2;
        int loWeitkg1 = loseWeight1 * 1000;
        int wD11 = loWeitkg1 / weight11;
        int wD21 = loWeitkg1 / weight21;
        float wD31 = loWeitkg1 / (float) averageWeight1;
        System.out.println(wD11 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weight11 + " грамм");
        System.out.println(wD21 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + weight21 + " грамм");
        System.out.println(wD31 + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + averageWeight1 + " грамм");

        int masha = 67760;
        System.out.println("Маша получает " + masha + " рублей в месяц");
        int denis = 83690;
        System.out.println("Денис получает " + denis + " рублей в месяц");
        int kristina = 76230;
        System.out.println("Кристина получает " + kristina + " рублей в месяц");
        float allowanceM = masha * 1.1f;
        float allowanceD = denis * 1.1f;
        float allowanceK = kristina * 1.1f;
        float mashaY = (float) masha * 12;
        float mashaYn = allowanceM * 12f;
        float mashaR = mashaYn - mashaY;
        System.out.printf("Маша теперь получает %.0f рублей. Годовой доход вырос на %.0f рублей \n", allowanceM, mashaR);
        float denisY = (float) denis * 12;
        float denisYn = allowanceD * 12f;
        float denisR = denisYn - denisY;
        System.out.printf("Денис теперь получает %.0f рублей. Годовой доход вырос на %.0f рублей \n", allowanceD, denisR);
        float kristinaY = (float) kristina * 12;
        float kristinaYn = allowanceK * 12f;
        float kristinaR = kristinaYn - kristinaY;
        System.out.printf("Кристина теперь получает %.0f рублей. Годовой доход вырос на %.0f рублей \n", allowanceK, kristinaR);

        int masha1 = 67760;
        System.out.println("Маша получает " + masha1 + " рублей в месяц");
        int denis1 = 83690;
        System.out.println("Денис получает " + denis1 + " рублей в месяц");
        int kristina1 = 76230;
        System.out.println("Кристина получает " + kristina1 + " рублей в месяц");
        int allowanceM1 = (masha1 / 10) * 11;
        int allowanceD1 = (denis1 / 10) * 11;
        int allowanceK1 = (kristina1 / 10) * 11;
        int mashaY1 = masha1 * 12;
        int mashaYn1 = allowanceM1 * 12;
        int mashaR1 = mashaYn1 - mashaY1;
        System.out.println("Маша теперь получает " + allowanceM1 + " рублей. Годовой доход вырос на " + mashaR1 + " рублей");
        int denisY1 = denis1 * 12;
        int denisYn1 = allowanceD1 * 12;
        int denisR1 = denisYn1 - denisY1;
        System.out.println("Денис теперь получает " + allowanceD1 + " рублей. Годовой доход вырос на " + denisR1 + " рублей");
        int kristinaY1 = kristina1 * 12;
        int kristinYn1 = allowanceK1 * 12;
        int kristinR1 = kristinYn1 - kristinaY1;
        System.out.println("Кристина теперь получает " + allowanceK1 + " рублей. Годовой доход вырос на " + kristinR1 + " рублей");


    }
}