public class Employee {

    //Initializing private variables
    private String name;
    private String employeeNumber;
    private String hireDate;

    //A constructor to read the inofmration from the subclass
    public Employee (String n, String num, String date){
        //Uses the method to assign the values to a variable
        setName(n);
        setEmployeeNumber(num);
        setHireDate(date);
    }

    public Employee(){}

    //Assigns the name variable
    public void setName(String n){
        name = n;
    }

    //Assigns the employee number variable
    public void setEmployeeNumber(String e){
        employeeNumber = e;
    }

    //Assigns the hire date variable
    public void setHireDate(String h){
        hireDate = h;
    }

    //Returns the name
    public String getName(){
        return name;
    }

    //Returns the employee number
    public String getEmployeeNumber(){
        return employeeNumber;
    }

    //Returns the hire date
    public String getHireDate(){return hireDate;}

    //method that is never called but is set to return true
    private boolean isValidEmpNum(String e){
        return true;
    }

    //Output method to print the information in the employee class
    public String toString(){
        return "Name: " + getName() + "\nEmployee Number: " + getEmployeeNumber() + "\nHire Date: " + getHireDate();
    }
}
