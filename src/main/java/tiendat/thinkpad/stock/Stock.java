package tiendat.thinkpad.stock;

import java.text.DecimalFormat;

public class Stock {
    //lưu mã cố phiếu
    String symbol;

    //lưu tên cổ phiếu
    String name;

    //lưu giá cổ phiếu của ngày trước đó
    double previousClosingPrice;

    //lưu giá cổ phiếu hiện tại
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        double percentChanged = (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        return Double.valueOf(decimalFormat.format(percentChanged));
    }

}
