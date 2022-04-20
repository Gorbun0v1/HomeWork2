public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача №1");
        byte q = 68;
        System.out.println( q );
        short w = 15503;
        System.out.println( w );
        int e = 1_232_458_745;
        System.out.println( e );
        long r = 312312323L;
        System.out.println( r );
        float t = 51.98f;
        System.out.println( t );
        double a = 52.988;
        System.out.println( a );
        char s = 65;
        System.out.println( s );
        boolean d = 1 < 5;
        System.out.println( d );
        System.out.println("******************************************");
        System.out.println("Задача №2");
        double i = 78.2;
        double b = 82.7;
        double g = i + b;
        double h = b - i;
        System.out.println("Общий вес двух бойцов равен " + g +" кг");
        System.out.println("Разница между весами бойцов равна " + h +" кг");
        System.out.println("******************************************");
        System.out.println("Задача №3");
        short banana = 5 * 80;
        short Milk = 2 * 105;
        short iceCream = 2 * 100;
        short rawEggs = 4 * 70;
        int bigMakGr = banana + Milk + iceCream + rawEggs;
        System.out.println("Количество грамм блюда будет равно "  + bigMakGr);
        float bigMakKg = bigMakGr / 1000F;
        System.out.println("Спорт-завтрак будет весить "  + bigMakKg + " кг.");
        System.out.println("******************************************");
        System.out.println("Задача №4");
        short needKg = 7 * 1000;
        short onePr = 200;
        short twoPr = 500;
        int onePrF = needKg / onePr;
        System.out.println(onePrF + " дней потребуется для похудения");
        int twoPrF = needKg / twoPr;
        System.out.println(twoPrF + " дней потребуется для похудения");
        int P = onePrF + twoPrF;
        float X = P / 2F;
        System.out.println(X + " дней в среднем потребуется для похудения");
        System.out.println("Задача №5");
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;
        int MashaPr = Masha * 10 / 100;
        int DenisPr = Denis * 10 / 100;
        int KristinaPr = Kristina * 10 / 100;
        int MashaGn = Masha + MashaPr;
        int DenisGn = Denis + DenisPr;
        int KristinaGn = Kristina + KristinaPr;
        int GeneralPrMasha = (MashaGn * 12) - (Masha * 12);
        int GeneralGnDenis = (DenisGn * 12) - (Denis * 12);
        int GeneralGnKristina = (KristinaGn * 12) - (Kristina * 12);
        System.out.println("Маша теперь получает " + MashaGn + " рублей. Годовой доход вырос на "+ GeneralPrMasha +" рублей");
        System.out.println("Маша теперь получает " + DenisGn + " рублей. Годовой доход вырос на "+ GeneralGnDenis +" рублей");
        System.out.println("Маша теперь получает " + KristinaGn + " рублей. Годовой доход вырос на "+ GeneralGnKristina +" рублей");


    }
}