package ec.edu.espoch.concessionaire.interfaces;

import ec.edu.espoch.concessionaire.objects.Automobile;

public interface InterfaceAutomobile {

    public double accelerate(double speed, Automobile carOne);

    public double decelerate(double speed, Automobile carOne);

    public double brake();

    public double estimateArrivalTime(double distance, Automobile carOne);

    public void display(Automobile carOne);
}
