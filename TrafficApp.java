import java.util.Scanner;

public class TrafficApp {
    private static TrafficAnalyzer trafficAnalyzer = new TrafficAnalyzer();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🚦 Welcome to Real-Time Traffic Monitoring System 🚦");

        while (true) {
            System.out.println("\n1. Monitor Real-Time Traffic");
            System.out.println("2. View Traffic History");
            System.out.println("3. Get Alternative Routes");
            System.out.println("4. Predict Traffic Delays");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    trafficAnalyzer.monitorTraffic();
                    break;
                case 2:
                    trafficAnalyzer.viewTrafficHistory();
                    break;
                case 3:
                    trafficAnalyzer.getAlternativeRoutes();
                    break;
                case 4:
                    trafficAnalyzer.predictTraffic();
                    break;
                case 5:
                    System.out.println("Exiting... Drive Safe! 🚗💨");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
