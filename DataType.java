public class DataType {
    public static void main(String[] args) {
        byte myAge = 25;
        int quantity = 10;
        long nigeriaPopulation = 223804632L;
        long worldsPopulation = 8000000000L;
        double price = 45.99;
        char symbol = '$';
        double balance = 1234.56;
        boolean isFun = true;

        System.out.printf("I am %d years old%n", myAge);
        System.out.printf("I ordered %d quantity of phones%n", quantity);
        System.out.printf("The population of Nigeria is %d%n", nigeriaPopulation);
        System.out.printf("The world's population is %d%n", worldsPopulation);
        System.out.printf("The price for 2 books is %.2f%n", price);
        System.out.printf("My account balance is %c%.2f%n", symbol, balance);
        System.out.printf("Is Java fun? %b%n", isFun);
    }
}

