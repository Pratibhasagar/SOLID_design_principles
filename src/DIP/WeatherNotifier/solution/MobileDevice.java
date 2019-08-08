package DIP.WeatherNotifier.solution;

public class MobileDevice implements Notifier {

    public void alertWeatherConditions(String weatherConditions) {

        if (weatherConditions.equalsIgnoreCase("rainy"))
            System.out.print("Phone Alert: It is rainy");
    }
}
