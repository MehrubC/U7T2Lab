import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner
    {
        public static void main(String[] args)
        {
            Car car1 = new Car("Tesla", 5);
            Car car2 = new Car("Nissan", 124234);
            Car car3 = new Car("Ford", 12235);
            Car car4 = new Car("Chevrolet", 45);
            Car[] cars = {car1, car2, car3, car4};

            ArrayList<Car> intList = new ArrayList<Car>(Arrays.asList(cars));
            System.out.println(intList);
        }
    }

