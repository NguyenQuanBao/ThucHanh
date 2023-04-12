package dong.vat;

public class Animal {
    //Thuoc tinh
    private double weight;
    private double height;
//Phuong thuc khoi tao
    public Animal() {
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    //Getter,Setter

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
//toString
    @Override
    public String toString() {
        return "A Animal" + " with weight: " + weight + " and height: " + height;
    }
}
