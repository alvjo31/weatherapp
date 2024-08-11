package org.weatherapp.httpConfigData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    private Coord coord;
    private List<Weather> weather;
    private WeatherMain main;
    private Wind wind;
    private Clouds clouds;
    private Sys sys;
    private String name;
    private int timezone;
    private long dt;
    private int id;
    private int cod;
}
