package fedeCapiz.u5d1p1.entities;

public class CoseInCoumne {
    private String name;
    private double price;
    private int calorie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return "CoseInCoumne{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calorie=" + calorie +
                '}';
    }
}
