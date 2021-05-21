package br.univates.java.poo.exemplo_erik;

public class teste {
    /**
     * @date 26/03/2021
     * @author jean.franz
     **/
    public static void main(String[] args) {
        double ounce;
        double grams;
        grams = 0.00;
        System.out.println("This programme will print a table that can be used to convert ounces to grams, from values 1-15.");
        System.out.println("One ounce is equal to 28.35 grams.\n\nOunces \t\t\t Grams");

        ounce = 0;
        do {
            ounce++;
            grams += 28.35;
            System.out.println(("" + ounce + "\t\t\t" + grams + ""));
        } while (ounce < 15);
    }
}
