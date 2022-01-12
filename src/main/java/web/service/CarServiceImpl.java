package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getListCar(String countStr) {
        int count = 0;
        if (countStr != null){
            count = Integer.parseInt(countStr);
        }
        if ((count == 0)|(count >5)) {
            count = 5;
        }

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 923, "red"));
        cars.add(new Car("Honda", 12, "green"));
        cars.add(new Car("Mersedes", 15, "white"));
        cars.add(new Car("Ford", 376, "blue"));
        cars.add(new Car("Nissan", 129, "dark"));
        List<Car> resulCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            resulCar.add(cars.get(i));
        }
        return resulCar;
    }
}
