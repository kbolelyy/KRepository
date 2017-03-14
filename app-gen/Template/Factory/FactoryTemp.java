package Template.Factory;

public class FactoryTemp {

    public static void main(String[] args) throws Exception {
            CreaterCar createrCar = getBynameCar("CarB");
            Car car = createrCar.createCar();
            car.RunCar();
    }


    public static CreaterCar getBynameCar(String name) throws Exception {
        if (name.equals("CarA")) {
            return new FactoryOfCarA();
        } else if (name.equals("CarB")) {
            return new FactoryOfCarB();
        } else if (name.equals("CarC")) {
            return new FactoryOfCarC();
        } else {
            throw new Exception("Нет такой машины");
        }

    }
}

interface Car {
    void RunCar();
}

class CarA implements Car {
    public void RunCar() {
        System.out.println(getClass().getName() + " поехал");
    }
}

class CarB implements Car {
    public void RunCar() {
        System.out.println(getClass().getName() + " поехал");
    }
}

class CarC implements Car {
    public void RunCar() {
        System.out.println(getClass().getName() + " поехал");
    }
}


interface CreaterCar {
    Car createCar();
}


class FactoryOfCarA implements CreaterCar {
    public Car createCar() {
        return new CarA();
    }
}

class FactoryOfCarB implements CreaterCar {
    public Car createCar() {
        return new CarB();
    }
}

class FactoryOfCarC implements CreaterCar {
    public Car createCar() {
        return new CarC();
    }
}