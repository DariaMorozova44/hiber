package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoimpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada",2107, "pink"));
        carList.add(new Car("Lada", 2108, "red"));
        carList.add(new Car("Lada", 2109, "white"));
        carList.add(new Car("Lada",  2110, "blue"));
        carList.add(new Car("Lada", 2111, "green"));
    }


    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}