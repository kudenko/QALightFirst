package money;

abstract public class Currency {

    double kursNBU;
    double rateCell;
    double rateBuy;
    double kursSell;
    double kursBuy;

    public Currency(double kursNBU, double rateBuy, double rateCell){
        this.kursNBU = kursNBU;
        this.rateBuy = rateBuy;
        this.rateCell = rateCell;
        kursBuy = kursNBU * rateBuy;
        kursSell = kursNBU * rateCell;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
        updateKursSellAndBuy();
    }

    public void setRateCell(double rateCell) {
        this.rateCell = rateCell;
        updateKursSellAndBuy();
    }

    public void setRateBuy(double rateBuy) {
        this.rateBuy = rateBuy;
        updateKursSellAndBuy();
    }

    public double getRateCell() {
        return rateCell;
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public double getKursSell() {
        return kursSell;
    }

    public double getKursBuy() {
        return kursBuy;
    }

    public double exchangeHrnToCurrency(int hrn){

        double tempResult;
        tempResult = hrn / kursBuy;
        System.out.println("For " + hrn + " you get " + tempResult + " hrn");
        return tempResult;
    }
    public double exchangeCurrencyToHrn(int curr){
        double tempResult = curr * kursSell;
        System.out.println("You got " + tempResult + " hrn for " + curr + " your currency");
        return tempResult;
    }

    private void updateKursSellAndBuy(){
        kursBuy = kursNBU * rateBuy;
        kursSell = kursNBU * rateCell;
    }
}
