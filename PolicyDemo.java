import java.io.*;
import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        //declare variables
        String policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        int smokerCount = 0;
        int nonSmokerCount = 0;
        
        String fileName = "PolicyInformation.txt";
        
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                // Read information from file
                policyNumber = fileScanner.nextLine();
                providerName = fileScanner.nextLine();
                firstName = fileScanner.nextLine();
                lastName = fileScanner.nextLine();
                age = Integer.parseInt(fileScanner.nextLine());
                smokingStatus = fileScanner.nextLine();
                height = Double.parseDouble(fileScanner.nextLine());
                weight = Double.parseDouble(fileScanner.nextLine());
                
                // Count smokers and non-smokers
                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
                
                //create a Policy object
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                System.out.println();
                
                //display information about the Policy
                System.out.println("Policy Number: " + policy.getPolicyNumber());
                System.out.println("Provider Name: " + policy.getProviderName());
                System.out.println("Policyholder's First Name: " + policy.getFirstName());
                System.out.println("Policyholder's Last Name: " + policy.getLastName());
                System.out.println("Policyholder's Age: " + policy.getAge());
                System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
                System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
                System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
                System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
                System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
                
                // Consume empty line if present
                if (fileScanner.hasNext()) {
                    fileScanner.nextLine();
                }
            }
            
            // Display smoker/non-smoker counts
            System.out.println("\nNumber of Policyholders that are smokers: " + smokerCount);
            System.out.println("Number of Policyholders that are non-smokers: " + nonSmokerCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
