package DIP.WeatherNotifier.violation;

class Emailer {
    String generateWeatherAlert(String weatherConditions) {
        String alert = "Email Alert: It is " + weatherConditions;
        return alert;
    }
}
