/*
 * ibrahim shahid
 * north carolina virtual public schools
 * using custom methods and importing text files to make grade calculators
 * 11/26/2024
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class lessonthree {

    // Method to calculate average for an array of scores
    public static double calculateAverage(ArrayList<Integer> scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }

    // Method to generate a visual bar chart
    public static void printChart(String course, double avg1, double avg2) {
        System.out.printf("%s\t", course);
        for (int i = 0; i < avg1; i += 2) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("\t");
        for (int i = 0; i < avg2; i += 2) {
            System.out.print("#");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // File path
        String filePath = "ModuleEightLessonTwoAssignmentTwoDataFile.txt"; // Replace with your file path

        // Create necessary structures to store data
        ArrayList<String> courses = new ArrayList<>();
        ArrayList<Double> student1Averages = new ArrayList<>();
        ArrayList<Double> student2Averages = new ArrayList<>();

        Scanner scanner;
        try {
            scanner = new Scanner(new File(filePath));
        } catch (Exception e) {
            System.out.println("File not found or cannot be read.");
            return;
        }

        // Process file line by line
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue; // Skip empty lines

            String[] parts = line.split(":");
            String courseName = parts[0].trim();
            courses.add(courseName);

            String[] student1Scores = parts[1].split("-999")[0].trim().split(" ");
            String[] student2Scores = parts[2].split("-999")[0].trim().split(" ");

            // Convert scores for Student 1
            ArrayList<Integer> student1 = new ArrayList<>();
            for (String score : student1Scores) {
                student1.add(Integer.parseInt(score.trim()));
            }

            // Convert scores for Student 2
            ArrayList<Integer> student2 = new ArrayList<>();
            for (String score : student2Scores) {
                student2.add(Integer.parseInt(score.trim()));
            }

            // Calculate averages
            student1Averages.add(calculateAverage(student1));
            student2Averages.add(calculateAverage(student2));
        }

        // Close scanner
        scanner.close();

        // Print results and chart
        System.out.println("\n--- Course Averages ---");
        double totalAvg1 = 0, totalAvg2 = 0;

        for (int i = 0; i < courses.size(); i++) {
            String course = courses.get(i);
            double avg1 = student1Averages.get(i);
            double avg2 = student2Averages.get(i);

            totalAvg1 += avg1;
            totalAvg2 += avg2;

            System.out.printf("%s\tStudent 1: %.2f\tStudent 2: %.2f\n", course, avg1, avg2);
            printChart(course, avg1, avg2);
        }

        // Print overall averages
        double overallAvg1 = totalAvg1 / courses.size();
        double overallAvg2 = totalAvg2 / courses.size();

        System.out.printf("\nAverage for Student 1: %.2f\n", overallAvg1);
        System.out.printf("Average for Student 2: %.2f\n", overallAvg2);
    }
}
/*
 * sample output
 * 
 * Course ID  Student#    Course Average
CIS 110  	1		79.10
		2		65.00
ENG 111	1		73.40
		2		85.00
MTH141	1		89.80
		2		80.60
CHM 121	1		72.20
		2		91.40

Average for student 1:  78.625
Average for student 2:  80.50	

	0   10  20 30  40  50  60  70  80  90  100
	|----|----|----|----|----|----|----|----|-----|-----|
CSC   *********************************
	###################

ENG   *******************************
   	#########################

MTH   **************************************
	#######################

CHM	******************************
	############################

 */