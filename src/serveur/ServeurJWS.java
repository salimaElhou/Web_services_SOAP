package serveur;

import service.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args){
        String url = "http://localhost:4000/";
        Endpoint.publish(url,new BanqueService());
        System.out.println(url);
    }

}
