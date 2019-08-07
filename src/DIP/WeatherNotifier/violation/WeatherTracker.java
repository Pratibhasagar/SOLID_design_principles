package DIP.WeatherNotifier.violation;

public class WeatherTracker {
    private String currentConditions;
    private Phone phone;
    private Emailer emailer;

    public WeatherTracker() {
        phone = new Phone();
        emailer = new Emailer();
    }

    void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription.equalsIgnoreCase("rainy")) {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription.equalsIgnoreCase("sunny")) {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}

