package org.weatherapp.httpConfigData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sys {

    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
