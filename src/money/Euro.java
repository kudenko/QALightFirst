package money;

public class Euro extends Currency implements isFreelyConvertible{
    public Euro(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);
    }

    @Override
    public boolean getFreelyConvertible() {
        return true;
    }
}
