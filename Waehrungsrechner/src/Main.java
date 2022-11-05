public class Main {
    public static void main(String[] args) {


        System.out.println("Test ChainOfResponsibility & TemplateMethod:");

        IUmrechnen rechnerDollar = new EURO2Dollar();
        IUmrechnen rechnerYen = new EURO2Yen();
        IUmrechnen rechnerSEK = new EURO2SEK();
        IUmrechnen rechnerReal = new EURO2BrReal();

        rechnerDollar.setNextConverter(rechnerYen);
        rechnerYen.setNextConverter(rechnerSEK);
        rechnerSEK.setNextConverter(rechnerReal);

        /*System.out.println(rechnerDollar.umrechnen("sek", 95));

        System.out.println();
        System.out.println("Test Decorator:");


        WRDecorator decorator = new DecoraterFixFees(rechnerDollar);

        System.out.println(decorator.umrechnen("sek", 95));

        WRDecorator decorator1 = new DecoratorFeesInPercent(rechnerDollar);

        System.out.println(decorator1.umrechnen("sek", 95));

        rechnerSEK.setFaktor(50);

        System.out.println(rechnerDollar.umrechnen("sek", 95));

        System.out.println();


        System.out.println("Test Builder:");


        System.out.println(rechnerDollar.umrechnen("brl", 95));

        IUmrechnen converterBRL = new EURO2BrReal.Builder()
                .setFaktor(8)
                .setNextConverter(new EURO2Yen())
                .build();

        System.out.println(converterBRL.umrechnen("brl", 95));
        System.out.println(converterBRL.umrechnen("yen", 95));

        System.out.println();
        System.out.println("Test Adapter:");


        double[] test = {5.4, 95, 7.6};

        Sammelrechner sammelrechner = new Sammelrechner(decorator);
        System.out.println(sammelrechner.sammelumrechnen(test, "usd"));
        System.out.println(decorator.umrechnen("usd", 5.4) +
                decorator.umrechnen("usd", 95) +
                decorator.umrechnen("usd", 7.6));*/

        System.out.println();
        System.out.println("Test Observer:");

        Observer observer = new LogObserver((WR) rechnerDollar);
        rechnerDollar.umrechnen("usd", 435);
        observer.update();
        int o = 0;
        for(int i = 0; i < Integer.MAX_VALUE; ++i){
            o = i;
        }
        System.out.println(o);
        rechnerDollar.umrechnen("sek", 732);
        observer.update();


    }
}