package ec.edu.espoch.concessionaire.Implementacion;

import ec.edu.espoch.concessionaire.objects.Automobile;
import ec.edu.espoch.concessionaire.interfaces.InterfaceAutomobile;

public class Automobiles implements InterfaceAutomobile {

    public double accelerate(double speed, Automobile carOne) {
        if (carOne.getCurrentSpeed() + speed > carOne.getMaximumSpeed()) {
            System.out.println("No se puede acelerar: se superaria la velocidad máxima de " + carOne.getMaximumSpeed() + "Km/h");
        } else {
            double aux = carOne.getCurrentSpeed() + speed;
            carOne.setCurrentSpeed(aux);
        }
        return carOne.getCurrentSpeed();

    }

    public double decelerate(double speed, Automobile carOne) {
        if (carOne.getCurrentSpeed() - speed <= 0) {
            System.out.println("No se puede desacelerar menos de 0 km/h");
        } else {
            double aux = carOne.getCurrentSpeed() - speed;
            carOne.setCurrentSpeed(aux);
        }
        return carOne.getCurrentSpeed();

    }

    public double brake() {
        return 0;
    }

    public double estimateArrivalTime(double distance, Automobile carOne) {
        double time = distance / carOne.getCurrentSpeed();

        return time;
    }

    public void display(Automobile carOne) {
        System.out.println("brand: " + carOne.getBrand());
        System.out.println("model: " + carOne.getModel());
        System.out.println("engine: " + carOne.getEngine());
        System.out.println("fuelType: " + carOne.getFuelType());
        System.out.println("carType: " + carOne.getCarType());
        System.out.println("numberOfDoors: " + carOne.getNumberOfDoors());
        System.out.println("numberOfSeats: " + carOne.getNumberOfSeats());
        System.out.println("maximumSpeed: " + carOne.getMaximumSpeed());
        System.out.println("color: " + carOne.getColor());
        System.out.println("currentSpeed: " + carOne.getCurrentSpeed());

    }
}
