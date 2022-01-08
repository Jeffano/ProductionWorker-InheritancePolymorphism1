/**
 * Name: Jeffano John
 * Date: Wed, Dec. 4th 2021
 * Student Number: 251230759
 * Description: Printing out information using multiple classes.
 */
public class Task1Demo {
    public static void main(String[] args) {

        //Creating objects and it's information to call the production worker class
        ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A","11-15-2005",1,16.50);
        ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L","12-12-2005",2,18.50);

        //Printing the output and the worker 1s information
        System.out.println("The first production worker");
        System.out.println(workerOne);

        //Printing the output and the worker 2s information
        System.out.println("\nThe second production worker");
        System.out.println(workerTwo);
    }
}
