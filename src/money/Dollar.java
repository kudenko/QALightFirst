package money;

public class Dollar extends Currency implements isFreelyConvertible{

    public Dollar(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);
    }

    public boolean getFreelyConvertible() {
        return true;
    }
}
