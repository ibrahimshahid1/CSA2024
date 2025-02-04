import java.io.File;
public class employee { // class named employee
    private int employeeNumber; //privant instance variables, employee number, job title, pay rate, and hours worked. Cant be accessed outside of class employee
    private String jobTitle;
    private double payRate;
    private double hoursWorked;

    
    public employee(int employeeNumber, String jobTitle, double payRate, double hoursWorked) { // constructor, constructors are special methods that are intialized when an object of that method is created
        this.employeeNumber = employeeNumber; // the this keyword is used to insure the instance variables are distigunished from the parameters
        this.jobTitle = jobTitle;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
public double calculatePay() { //method to calculate gross pay, it calculates the gross pay of the employees based off of numbers worked
    double grossPay = 0.0;
    double regularHours = Math.min(40, hoursWorked);
    double overtimeUnder50Hours = 0.0;
    double overtimeOver50Hours = 0.0;
    grossPay += regularHours * payRate; // regular pay up to 40 hours 
    if (hoursWorked > 40) { // loop stating that if the amount of hours worked is less than fourty, then a double hoursbetween40and50 is assigned value of Math.min(50,hoursworked)-40,
                            // if thats true, then
        double hoursBetween40And50 = Math.min(50, hoursWorked) - 40; //  between 40 and 50 hours
        if (hoursBetween40And50 < 0) {
            hoursBetween40And50 = 0;
        }
        overtimeUnder50Hours = hoursBetween40And50 * payRate * 1.5;
    }

    // If hours above 50
    if (hoursWorked > 50) { // overtime pay, above 50 hours
        double hoursAbove50 = hoursWorked - 50;
        overtimeOver50Hours = hoursAbove50 * payRate * 2.0;
    }

    return grossPay + overtimeUnder50Hours + overtimeOver50Hours;
}

// Getters (no setters needed if we don’t allow changes after construction)

public int getEmployeeNumber() {
    return employeeNumber;
}

public String getJobTitle() {
    return jobTitle;
}

public double getPayRate() {
    return payRate;
}

public double getHoursWorked() {
    return hoursWorked;
}

}
