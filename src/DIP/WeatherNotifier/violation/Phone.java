package DIP.WeatherNotifier.violation;

class Phone {
    String generateWeatherAlert(String weatherConditions) {
        String alert = "Phone Alert: It is " + weatherConditions;
        return alert;
    }
}
