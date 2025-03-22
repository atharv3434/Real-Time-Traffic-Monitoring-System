public class Route {
    private String location;
    private int trafficLevel; // 1 (Low) - 5 (High)
    private int estimatedDelay; // in minutes

    public Route(String location, int trafficLevel, int estimatedDelay) {
        this.location = location;
        this.trafficLevel = trafficLevel;
        this.estimatedDelay = estimatedDelay;
    }

    public String getLocation() { return location; }
    public int getTrafficLevel() { return trafficLevel; }
    public int getEstimatedDelay() { return estimatedDelay; }

    @Override
    public String toString() {
        return "📍 Location: " + location + " | 🚦 Traffic Level: " + trafficLevel + " | ⏳ Delay: " + estimatedDelay + " mins";
    }
}
