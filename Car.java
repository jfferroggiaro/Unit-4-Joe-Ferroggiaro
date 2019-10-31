public class Car{
  private String make;
  private String model;
  private double mpg;
  private double fuel;
  private double tank;

  public Car(String carMake, String carModel, double carMpg, double carTank){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    fuel = carFuel;
    tank = carTank;
    fuel = tank;
  }

  public void drive(double miles){
    if(miles <= mpg*fuel)
      fuel = miles/mpg;
    else
      fuel = 0.0;
  }

  public void refuel(double gal){
    if(fuel + gal <= tank)
      fuel += gal
    else
      fuel = tank;
  }

  public String toString(){
    String result = "";
    result += (make + " " + model) + "\n";
    result += ("Fuel: " + fuel + " out of " + tank + " gal") + "\n";
    


  }


}
