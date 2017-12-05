package money;

public class Bitcoin extends Currency {

    public Bitcoin(double kursNBU, double rateBuy, double rateCell, String bitcoin) {
        super(kursNBU, rateBuy, rateCell, bitcoin);
    }

    @Override
    public double exchangeCurrencyToHrn(int curr) {
        System.out.println("Операция запрещена нацбанком");
        return curr;
    }
}
