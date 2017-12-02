package money;

/**
 * Created by grey on 02.12.17.
 */
public class Bitcoin extends Currency implements isFreelyConvertible {

    public Bitcoin(double kursNBU, double rateBuy, double rateCell) {
        super(kursNBU, rateBuy, rateCell);
    }

    public boolean getFreelyConvertible() {
        return false;
    }

    @Override
    public double exchangeCurrencyToHrn(int curr) {
        System.out.println("Операция запрещена нацбанком");
        return curr;
    }
}
