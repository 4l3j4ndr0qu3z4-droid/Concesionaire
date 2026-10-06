package ec.edu.espoch.concessionaire;

import ec.edu.espoch.concessionaire.Implementacion.Automobiles;
import ec.edu.espoch.concessionaire.objects.Automobile;
import ec.edu.espoch.concessionaire.enumeration.CarType;
import ec.edu.espoch.concessionaire.enumeration.Color;
import ec.edu.espoch.concessionaire.enumeration.FuelType;

public class Concessionaire {

    public static void main(String[] args) {
        //Automobile carOne = new Automobile("Toyota", 2019, 40, FuelType.GASOLINE, CarType.FAMILY_CAR, 4, 6, 200, Color.RED, 100);
        Automobile carOne = new Automobile();
        carOne.setBrand("Toyota");
        carOne.setModel(2019);
        carOne.setEngine(40);
        carOne.setFuelType(FuelType.BIODIESEL);
        carOne.setCarType(CarType.CITY_CAR);
        carOne.setNumberOfDoors(23);
        carOne.setNumberOfSeats(4);
        carOne.setMaximumSpeed(400);
        carOne.setColor(Color.RED);
        carOne.setCurrentSpeed(23);
            
        
        
        Automobiles carOnes = new Automobiles();
        carOnes.display(carOne);
        
        
        
        
        /*System.out.println("Velocidad actual de " + carOne.currentSpeed);
        carOne.accelerate(20);
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
        carOne.accelerate(50);
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
        carOne.brake();
        System.out.println("Velocidad actual de " + carOne.currentSpeed);
            */
    }

}
