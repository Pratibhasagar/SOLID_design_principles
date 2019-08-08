package DIP.WeatherNotifier.solution;

public class EmailClient implements Notifier {

    public void alertWeatherConditions(String weatherConditions) {

        if (weatherConditions.equalsIgnoreCase("sunny")) {
            System.out.print("Email Alert: It is sunny");
        }
    }
}
