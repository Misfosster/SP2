public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Bil bil1 = new Benzinbil(129309, "Ford", "Escort", 1990, 28, 95, 1);
        Bil bil2 = new Dieselbil(129308, "Peugeot", "Stor i størrelsen", 0, 2, false, 46);
        Bil bil3 = new Elbil(129307, "Tesla", "Marsmand", 3009, 1, 100, 80000, 500);

        garage.tilføjBilTilGarage(bil1);
        garage.tilføjBilTilGarage(bil2);
        garage.tilføjBilTilGarage(bil3);
        System.out.println("Bilerne i garagen: \r\n" + garage);
        garage.udregnGrønEjerafgift();
    }
}
