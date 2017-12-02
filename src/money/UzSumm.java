package money;

public class UzSumm extends Currency implements isFreelyConvertible{
    public UzSumm(double kursNBU, double rateBuy, double rateSell) {
        super(kursNBU, rateBuy, rateSell);
    }

    public boolean getFreelyConvertible() {
        return false;
    }
}
