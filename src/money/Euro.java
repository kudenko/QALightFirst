package money;

public class Euro extends Currency implements isFreelyConvertible{
    public Euro(double kursNBU, double rateBuy, double rateSell, String curr) {
        super(kursNBU, rateBuy, rateSell, curr);
    }

    @Override
    public boolean getFreelyConvertible() {
        return true;
    }
}
