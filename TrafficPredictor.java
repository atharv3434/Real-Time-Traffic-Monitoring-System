import java.util.List;

public class TrafficPredictor {
    public static int calculateAverageDelay(List<Route> trafficRoutes) {
        int totalDelay = 0;
        for (Route route : trafficRoutes) {
            totalDelay += route.getEstimatedDelay();
        }
        return trafficRoutes.isEmpty() ? 0 : totalDelay / trafficRoutes.size();
    }
}
