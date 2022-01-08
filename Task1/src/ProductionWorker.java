import java.text.DecimalFormat;

//Production worker class is extended from the Employee class
public class ProductionWorker extends Employee{

    //Initializing private and final variables
    private int shift;
    private double payRate;
    final int DAY_SHIFT = 1;
    final int NIGHT_SHIFT = 2;

    //Creating an object to round numbers
    DecimalFormat df = new DecimalFormat("0.00");

    //A construction to read the information from the main class
    public ProductionWorker(String n, String num, String date, int sh, double rate){
        //Sending some information to the super class
        super(n,num,date);
        //Calling the method
        setShift(sh);
        setPayRate(rate);
    }

    public ProductionWorker(){}

    //Assigns the shift value
    public void setShift(int s){
        shift = s;
    }

    //Assigns the pay rate amount
    public void setPayRate(double p){
        payRate = p;
    }

    //Returning the shift value
    public int getShift(){
        return shift;
    }

    //Returns the pay rate
    public double getPayRate() {
        return payRate;
    }

    //A class to print the output.
    public String toString(){
        //Compares the value stored in shift and checks if it is a day or night shift
        if (getShift() == DAY_SHIFT){
            //Calls the super class and prints the remaining information with the shift time and rounds the pay rate.
            return super.toString() + "\nShift: Day" + "\nHourly Pay Rate: $" + df.format(getPayRate());
        }
        else if (getShift() == NIGHT_SHIFT){
            //Calls the super class and prints the remaining information with the shift time and rounds the pay rate.
            return super.toString() + "\nShift: Night" + "\nHourly Pay Rate: $" + df.format(getPayRate());
        }
        else{
            //Default return statement
            return "";
        }
    }
}
