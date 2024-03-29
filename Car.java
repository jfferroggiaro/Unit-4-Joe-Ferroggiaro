public class Car{
  private String make;
  private String model;
  private double mpg;
  private double fuel;
  private double tank;
  private int miles;

  public Car(String carMake, String carModel, double carMpg, double carTank, int carMiles){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tank = carTank;
    fuel = tank;
    miles = carMiles;
  }

  public void drive(double dist){
    if(dist <= mpg*fuel){
      fuel -= dist/mpg;
      miles += dist;
    } else {
      fuel = 0.0;
      miles += (mpg*fuel);
    }
  }

  public String refuel(double gal){
    String refResult = "";
    if(fuel + gal <= tank){
      fuel += gal;
      refResult = (gal + "gallons added. " + fuel + "/" +  tank + "gallons.");
    } else {
      fuel = tank;
      refResult = ("tank is full");
    }
    return refResult;
  }

  public String toString(){
    String result = "";
    result += (make + " " + model + "   " + "MPG: " + mpg) + "\n";
    result += ("Fuel: " + fuel + " out of " + tank + " gal") + "\n";
    if(fuel == 0.0)
      result += ("You're out of gas!") + "\n";
    result += ("Miles: " + miles) + "\n";
    return result;

  }


}
