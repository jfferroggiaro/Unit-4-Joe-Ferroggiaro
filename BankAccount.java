public class BankAccount {
    private String name;
    private String pin;
    private double bal;

    public BankAccount(String accName, String accPin, Double accBal){
        name = accName;
        pin = accPin;
        bal = accBal;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    //public void interest(double

    public String toString(){
        String statement = "";
        statement += ("Name: " + name);
        statement += ("Pin: " + pin);
        statement += ("Balance: $" + bal);
        return statement;
    }
}
