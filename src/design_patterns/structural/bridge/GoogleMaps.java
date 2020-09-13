package design_patterns.structural.bridge;

import java.net.URL;

public class GoogleMaps implements Mapa{

    @Override
    public String devolveMapa(String rua) {
        try {
            String urlMaps = "http://maps.google.com.br/maps?g=ruaXyz";
            URL url = new URL(urlMaps);
            //....
            return "retorna o mapa";

        } catch(Exception exception){
            throw new RuntimeException(exception);
        }
    }
}
