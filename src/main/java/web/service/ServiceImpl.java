package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class ServiceImpl implements CarService{

    private final List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Lada","Red",2112));
        carList.add(new Car("BMW","Black",558));
        carList.add(new Car("Skoda","Blue",4313));
        carList.add(new Car("Lada Niva","Black",14));
        carList.add(new Car("Subaru","Red",011));
    }


    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    


}
