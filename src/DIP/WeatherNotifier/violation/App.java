package DIP.WeatherNotifier.violation;

public class App{
    public static void main(String[] args) {
        WeatherTracker weatherTracker = new WeatherTracker();
        weatherTracker.setCurrentConditions("sunny");
    }
}
