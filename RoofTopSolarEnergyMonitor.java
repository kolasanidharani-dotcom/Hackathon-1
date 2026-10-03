import java.util.Scanner;

public class RoofTopSolarEnergyMonitor {

    // 2c) Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ------------------------------------------------------------
        // Part 2a: Data Types & Basic Storage
        // ------------------------------------------------------------
        System.out.println("=== 2a) Storing and Displaying Initial System Details ===");
        
        // Variable declaration using appropriate Java data types
        int panelId = 4502;
        double initialEnergyGenerated = 8.5; // Initial hardcoded decimal value
        int numberOfPanels = 16;
        char systemStatus = 'O'; // 'O' for Operational, 'M' for Maintenance

        // Displaying the initial details
        System.out.println("Panel ID: " + panelId);
        System.out.println("Initial Energy Generated: " + initialEnergyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
        System.out.println(); // Blank line for separation


        // ------------------------------------------------------------
        // Part 2c: Methods (Calculating Total Energy from User Input)
        // ------------------------------------------------------------
        System.out.println("=== 2c) Calculating Total Energy (Using Methods) ===");
        
        // Reading morning and evening values from the user
        System.out.print("Enter morning energy generation (kWh): ");
        double morning = scanner.nextDouble();

        System.out.print("Enter evening energy generation (kWh): ");
        double evening = scanner.nextDouble();

        // Calling the method and storing the returned value
        double totalEnergy = calculateTotalEnergy(morning, evening);
        System.out.println("Total energy calculated by method: " + totalEnergy + " kWh");
        System.out.println();


        // ------------------------------------------------------------
        // Part 2b: If-Else Condition (Monitoring performance of total energy)
        // ------------------------------------------------------------
        System.out.println("=== 2b) Monitoring Performance (If-Else Condition) ===");
        
        // Checking the calculated total energy against the 10 kWh threshold
        if (totalEnergy >= 10.0) {
            System.out.println("Status Report: Good Energy Generation");
        } else {
            System.out.println("Status Report: Low Energy Generation");
        }

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}