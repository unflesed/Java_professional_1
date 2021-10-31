package practise.task_1;

import java.util.*;

public class Product {
    String name;
    double price;
    int quantity;
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
class NameSort implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.name.compareTo(o2.name);
    }
}
class PriceSort implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.price < o2.price) return -1;
        if(o1.price > o2.price) return 1;
        return 0;
    }
}
class Main{
    public static void main(String[] args) {
        Product[] arr = {new Product("qwerty", 1000, 3),
                new Product("asdfg", 555, 2),
                new Product("ytrewq", 2222.6, 4)};
        ArrayList<Product> arrayList = new ArrayList<>();
        arrayList.add(new Product("name", 555, 4));
        arrayList.add(new Product("ame", 1000, 3));
        arrayList.add(new Product("me", 333, 7));
        Arrays.sort(arr,new NameSort());
        for (Product temp : arr) {
            System.out.println(temp);
        }
        Collections.sort(arrayList, new PriceSort());
        Iterator<Product> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}