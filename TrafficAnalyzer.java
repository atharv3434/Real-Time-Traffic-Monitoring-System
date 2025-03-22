import java.util.*;

public class TrafficAnalyzer {
    private List<Route> trafficRoutes;
    private Scanner sc;

    public TrafficAnalyzer() {
        this.trafficRoutes = TrafficDataStorage.loadTrafficData();
        this.sc = new Scanner(System.in);
    }

    public void monitorTraffic() {
        System.out.print("Enter your current location: ");
        String location = sc.nextLine();
        int trafficLevel = new Random().nextInt(5) + 1; // Simulating real-time traffic levels (1-5)
        int delay = trafficLevel * 5; // Each traffic level increases delay by 5 mins

        Route newRoute = new Route(location, trafficLevel, delay);
        trafficRoutes.add(newRoute);
        TrafficDataStorage.saveTrafficData(trafficRoutes);

        System.out.println("\n🚦 Real-Time Traffic Update:");
        System.out.println(newRoute);
    }

    public void viewTrafficHistory() {
        if (trafficRoutes.isEmpty()) {
            System.out.println("📄 No previous traffic data.");
            return;
        }

        System.out.println("\n📜 Past Traffic Reports:");
        for (Route route : trafficRoutes) {
            System.out.println(route);
        }
    }

    public void getAlternativeRoutes() {
        if (trafficRoutes.isEmpty()) {
            System.out.println("📌 No traffic data available for alternative routes.");
            return;
        }

        System.out.println("\n🔄 Alternative Routes:");
        for (Route route : trafficRoutes) {
            if (route.getTrafficLevel() < 3) {
                System.out.println("✅ Less Congested Route: " + route.getLocation());
            }
        }
    }

    public void predictTraffic() {
        if (trafficRoutes.isEmpty()) {
            System.out.println("📌 No data available for traffic prediction.");
            return;
        }

        int avgDelay = TrafficPredictor.calculateAverageDelay(trafficRoutes);
        System.out.println("\n⏳ Predicted Traffic Delay: " + avgDelay + " minutes.");
    }
}
