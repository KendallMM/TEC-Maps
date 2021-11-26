/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
/**
 *
 * @author Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


/**
 *
 * Esta clase genera las distancias entre los puntos.
 */

public class GetDistanceAPI {
    public double distance[][];
    public static int Matriz[][] = {
            {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0},
            {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
    };
    private static final String API_KEY = "AIzaSyDr5F7IKRcEUmHPaQZHXlGZwIV4Ru2ElLA";
    public static float[][] distances;
    public static float[][] times;
    public static String[] cities = {"", "TourEiffel", "ParcdesPrincesParis", "NotreDameParis", "Muséed'OrsayParis", "OpéraGarnierParis", "ArcdeTriompheParis", "SacréCoeurParis", "RépubliqueParis", "SalleOlympedeGouges", "ParcdelaVillette", "PlacedelaNation", "BercyParis", "AusterlitzStation", "StadedeFrance", "TourMontparnasseParis"};
    public static final int n = cities.length;


   /**
 *
 * Este metodo obtiene las distancias por medio del API de Google
 */
    public static String getData(String source, String destination) throws Exception {
        var url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + source + "&destinations=" + destination + "&key=" + API_KEY;
        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client = HttpClient.newBuilder().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
//        System.out.println(response);
        return response;

    }

    public static void parse(String response, int i, int j) {
        float distance;
        long time = -1L;
        //parsing json data and updating data
        {
            try {
                JSONParser jp = new JSONParser();
                JSONObject jo = (JSONObject) jp.parse(response);
                JSONArray ja = (JSONArray) jo.get("rows");
                jo = (JSONObject) ja.get(0);
                ja = (JSONArray) jo.get("elements");
                jo = (JSONObject) ja.get(0);
                JSONObject je = (JSONObject) jo.get("distance");
                JSONObject jf = (JSONObject) jo.get("duration");
                distance = (long) je.get("value");
                time = (long) jf.get("value");

                distances[i][j] = distance/1000;
                times[i][j] = time;

            } catch (Exception e) {
                System.out.println(e + " for " + cities[j]);
            }
        }
    }


    public void run() throws Exception {
        distances = new float[n][n];
        times = new float[n][n];
        for (int i = 1; i < n; i++)
            for (int j = 1; j < n; j++) {
                if (Matriz[i-1][j-1] == 1){
                   if (i != j) {
                    String response = getData(cities[i], cities[j]);
                    parse(response, i, j);
                } else {
                    "".isEmpty();
                   }
                }

            }
        double distanceweight[][] = {
                {0, distances[1][2], 0, distances[1][4], 0, distances[1][6], 0, 0, 0, 0, 0, 0, 0, 0, distances[1][15]},
                {distances[1][2], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, distances[2][15]},
                {0, 0, 0, distances[3][4], 0, 0, 0, distances[3][8], 0, 0, distances[3][11], distances[3][12], distances[3][13], 0, 0},
                {distances[1][4], 0, distances[3][4], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, distances[4][15]},
                {0, 0, 0, 0, 0, distances[5][6], distances[5][7], distances[5][8], 0, 0, 0, 0, 0, 0, 0},
                {distances[1][6], 0, 0, 0, distances[5][6], 0, distances[6][7], 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, distances[5][7], distances[6][7], 0, 0, 0, distances[7][10], 0, 0, 0, distances[7][14], 0},
                {0, 0, distances[3][8], 0, distances[5][8], 0, 0, 0, distances[8][9], 0, distances[8][11], 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, distances[8][9], 0, distances[9][10], distances[9][11], 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, distances[7][10], 0, distances[9][10], 0, 0, 0, 0, distances[10][14], 0},
                {0, 0, distances[3][11], 0, 0, 0, 0, distances[8][11], distances[9][11], 0, 0, distances[11][12], 0, 0, 0},
                {0, 0, distances[3][12], 0, 0, 0, 0, 0, 0, 0, distances[11][12], 0, 0, 0, 0},
                {0, 0, distances[3][13], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, distances[13][15]},
                {0, 0, 0, 0, 0, 0, distances[7][14], 0, 0, distances[10][14], 0, 0, 0, 0, 0},
                {distances[1][15], distances[2][15], 0, distances[4][15], 0, 0, 0, 0, 0, 0, 0, 0, distances[13][15], 0, 0},
        };
        this.distance = distanceweight;
    }
    public double[][] getDistance() throws Exception{
        run();
        return this.distance;
    }
    
}

