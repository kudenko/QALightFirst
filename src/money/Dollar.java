package money;

public class Dollar extends Currency implements isFreelyConvertible{

    public Dollar(double kursNBU, double rateBuy, double rateSell, String dollar) {
        super(kursNBU, rateBuy, rateSell, dollar);
    }

    public boolean getFreelyConvertible() {
        return true;
    }
}
