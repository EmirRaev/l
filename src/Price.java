import java.util.ArrayList;
import java.util.Scanner;

public interface Price {
    default public ArrayList<Car> serchPrice(ArrayList<Car> cars){
        ArrayList<Car> cars1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цену от: ");
        double priceDown=sc.nextDouble();
        System.out.println("Введите цену до: ");
        double priceTop= sc.nextDouble();
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getPrice() <= priceDown && cars.get(i).getPrice() >=priceTop){
                cars1.add(cars.get(i));
            }
        }
        return cars1;
    }
}
