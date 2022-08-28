package excepciones;
import java.net.*;

public class CalcularIva {
    public double calcularIva(double precio, String type){
        try {
            if(type=="basico"){
                return precio+(precio*0.10);
            };
            if(type=="cultural"){
            return precio;
        }else{
            return precio + (precio*0.19);
        }
            
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }
        return 0;

    }

    public void verificarUrl(String url) throws Exception{
        try {
            URL url2= new URL(url);
            HttpURLConnection connection =(HttpURLConnection) url2.openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            if(connection.getContentType().contains("text/plain")){
            System.out.println(connection.getContentType().toString());    
        }else{
            System.out.println(connection.getContentType().toString());
        }

            
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
    
}
