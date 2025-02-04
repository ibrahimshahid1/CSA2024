import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class employeetester {

    public static void main(String[] args) {
        String filename = "data.txt"; // string filename stores the name of the file to read data from. 
        ArrayList<employee> employees = new ArrayList<>(); //array list is a list to store all the employee names in my txt file, i used this because i thought it was easier than using the scanner method as well as because it was mentioned in the thinkjava2e textbook
        Scanner scanner = null; //declares the scanner which will be intialized later

        try { //try catch block, i used this in order to handle errors like filenotfoundexception and numberformatexception
          
            scanner = new Scanner(new File(filename)); // scanner method to scan the txt file, which is stored in the string variable filename
            while (scanner.hasNextLine()) { // checks if theres another line to read in the file, a while loop, if the scanner has another line, this loop is to read and trim the first line for the employee number
               //converts into integer using integer.parseint
                if (!scanner.hasNextLine()) break; // if the scanner doesnt have another line, break the loop
                String empNumStr = scanner.nextLine().trim(); //
                int employeeNumber = Integer.parseInt(empNumStr);

            
                if (!scanner.hasNextLine()) break;
                String jobTitle = scanner.nextLine().trim();

              
                if (!scanner.hasNextLine()) break; // reads and trims the second line for the job title
                String payRateStr = scanner.nextLine().trim();
                double payRate = Double.parseDouble(payRateStr.replace("$", ""));

                if (!scanner.hasNextLine()) break; // reads the third line, which has the pay rate, 
                String hoursStr = scanner.nextLine().trim();
                double hoursWorked = Double.parseDouble(hoursStr);

           
                employee emp = new employee(employeeNumber, jobTitle, payRate, hoursWorked); // creates an employee object using the parsed data from the while loop, and adds Employee to the employees list
                employees.add(emp);
            }
        } catch (FileNotFoundException e) { // exception handeling because i know how to do catch and finally because of the thinkjava2e textbook, if filenotfoundexception, then an error message is printed
            System.out.println("File not found: " + filename); // If a number (like employeeNumber, payRate, or hoursWorked) cannot be parsed, an error is displayed.
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
            e.printStackTrace();
        } finally { // inorder to make sure the scanners closed
        
            scanner.close();
        }

   
        System.out.println("You have " + employees.size() + " employees\n"); // printing results, 
        System.out.printf("%-10s %-10s %-15s %-15s\n",
                "Emp ID", "Pay Rate", "Hours Worked", "Gross Pay");
        for (employee emp : employees) {
            double grossPay = emp.calculatePay();
            System.out.printf("%-10d $%-9.2f %-15.2f $%-15.2f\n",
                    emp.getEmployeeNumber(),
                    emp.getPayRate(),
                    emp.getHoursWorked(),
                    grossPay);
        }
    }
}
