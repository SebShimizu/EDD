package Json;
import java.util.Arrays;
public class EDD {

    public static void main(String[] args) {
        ApiHelper api = new ApiHelper();
        String datos = api.get("https://rickandmortyapi.com/api/character");
        /*System.out.println(datos);*/
        JsonHelper jsonHelper = new JsonHelper();
        Personaje[] personajes = jsonHelper.convertJsonAPersonajes(datos);
        Arrays.sort(personajes);
        if(personajes != null){
            for (Personaje personaje : personajes) {
                System.out.println(personaje.getName());
            }
        }
        
    }
}
