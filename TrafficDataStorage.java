import java.io.*;
import java.util.*;

public class TrafficDataStorage {
    private static final String FILE_PATH = "traffic_data.txt";

    public static void saveTrafficData(List<Route> trafficRoutes) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(trafficRoutes);
        } catch (IOException e) {
            System.out.println("❌ Error saving traffic data.");
        }
    }

    public static List<Route> loadTrafficData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Route>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
