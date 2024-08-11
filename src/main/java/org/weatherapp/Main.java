package org.weatherapp;

import org.weatherapp.httpConfigData.HttpUtils;
import org.weatherapp.httpConfigData.WeatherResponse;

public class Main {
    public static void main(String[] args) throws Exception {
        //        User user = new User();
//        user.setId("1");
//        user.setName("test");
//
//        UserDao userDao = new UserDao();
//        userDao.saveUser(user);

        HttpUtils httpUtils = new HttpUtils();
        WeatherResponse weather = httpUtils.getWeather(44, 45);
        System.out.println(weather);
    }
}