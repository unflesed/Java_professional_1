package professional.additional;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене/моделе/цвету машины
    public int compareTo(Object o) {
        int temp = this.speed - ((Car)o).speed;
        if (temp == 0) {
            if (this.price == ((Car)o).price) {
                if (this.model.equals(((Car)o).model)) {
                    return this.color.compareTo(((Car)o).color);
                }
                    return this.model.compareTo(((Car)o).model);
                }
                return this.price - ((Car)o).price;
            }
        return temp;
        }
}