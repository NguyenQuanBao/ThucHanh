package dong.vat;

public class Cat extends Animal {
    //Thuoc tinh
    private double age;

    //Phuong thuc khoi tao
    public Cat() {
        super();
        this.age = 1.0;
    }

    public Cat(double age) {
        super();
        this.age = age;
    }

    public Cat(double weight, double height, double age) {
        super(weight, height);
        this.age = age;
    }

    //getter, setter
    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    //Phuong thuc
    public String sound() {
        return "Meo meo nikga";
    }

    public String eat() {
        return "You're dead";
    }

    //toString
    @Override
    public String toString() {
        return "A Cat" + " with age: " + age + ", which a subClass of " + super.toString();
    }
}

class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        cat = new Cat(3.5);
        System.out.println(cat);

        cat = new Cat(3.5, 5, 10);
        System.out.println(cat);
    }
}
