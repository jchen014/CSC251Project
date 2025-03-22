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
      Scanner user = new Scanner(System.in);
   
      //prompt the user to enter information  
      System.out.print("Please enter the Policy Number: ");
      policyNumber = user.nextLine();
            
      System.out.print("Please enter the Provider Name: ");
      providerName = user.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = user.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = user.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = user.nextInt();
      user.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = user.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = user.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = user.nextDouble();
      
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
   }
}