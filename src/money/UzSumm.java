package money;

public class UzSumm extends Currency implements isFreelyConvertible{
    public UzSumm(double kursNBU, double rateBuy, double rateSell, String curr) {
        super(kursNBU, rateBuy, rateSell, curr);
    }

    public boolean getFreelyConvertible() {
        return false;
    }
}
