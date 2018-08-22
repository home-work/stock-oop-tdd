package tiendat.thinkpad.stock;

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
        return (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
    }

}
