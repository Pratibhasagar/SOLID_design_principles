package DIP.WeatherNotifier.solution;

class WeatherTracker {
    private String currentConditions;

    void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
    }

    void notify(Notifier notifier) {
        notifier.alertWeatherConditions(currentConditions);
    }
}
