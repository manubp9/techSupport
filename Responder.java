import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;//atributo aleatorio
    ArrayList <String> respuestas;//array list de tipo string
    HashMap<String , String> respuestasCohincide;//hasMap de respuestas segun haya escrito la persona
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestasCohincide = new HashMap<>();
        respuestas.add("¿Puedes ser mas exacto?");//añado las respuestas al array
        respuestas.add("Indicame el punto donde te da el fallo");
        respuestas.add("¿Has comprobado las conexiones?");
        respuestas.add("¿Su ordenador es portatil o de sobremesa?");
        respuestas.add("¿Que version utiliza, 1.1 o 1.2?");
        
        respuestasCohincide.put("portatil" , "Has comprobado que esta version es para portatil?");
        respuestasCohincide.put("sobremesa","Todas las versiones son compatibles con sobremesa");
        respuestasCohincide.put("1.1","Actualice a la version mas reciente su sw");
        respuestasCohincide.put("1.2","Espere a actualizaciones futuras");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String userInput)
    {
        String respuesta = null;
        respuesta = respuestasCohincide.get(userInput);//la variable local equivale a lo que le metas por pantalla,si existe dentro del hasMap
                                                       //Si existe devolvera la respuesta , si no sera null y pasara al if
        if(respuesta == null)
        {
            return respuestas.get(aleatorio.nextInt(respuestas.size()));
        }
        return respuesta;
       
    }
}
