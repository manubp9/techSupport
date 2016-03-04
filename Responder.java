import java.util.Random;
import java.util.ArrayList;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("¿Puedes ser mas exacto?");//añado las respuestas al array
        respuestas.add("Indicame el punto donde te da el fallo");
        respuestas.add("¿Has comprobado las conexiones?");
        respuestas.add("¿Cuantas veces has tenido este problema?");
        respuestas.add("¿Alguna sugerencia para ayudarte?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroAleatorio = aleatorio.nextInt(respuestas.size());//el maximo del numero aleatorio es el tamaño de la lista de respuestas
        String respuestaAleatoria = respuestas.get(numeroAleatorio);//igualo la respuesta aleatoria a el elemento de la lista con el mismo numero.
        return respuestaAleatoria;
    }
}
