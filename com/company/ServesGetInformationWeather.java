package com.company;

import java.io.InputStream;
import java.net.URL;
public class ServesGetInformationWeather {
    public String getJsonInform(String city){
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+"&lang=ru&appid=06ed80ddb1827b8f65b8f2796f798dc7");
            InputStream input = url.openStream();
            byte[] buffer = input.readAllBytes();
            return new String(buffer);
        }catch (Exception e){
            return "Город не найден";
        }
    }
}
