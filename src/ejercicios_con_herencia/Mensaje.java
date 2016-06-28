/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_herencia;

/**
 *
 * @author ruben
 */
class Mensaje
{

    int intNumRemitente;
    int intNumDestinatario;

    String strNombreRemitente;
    String strNombreDestinatario;
    String strMensaje;

    //No sobrecargamos el método de la clase padre.
    Mensaje(String strNombreRemitente, int intNumRemitente, String strNombreDestinatario, int intNumDestinatario, String strMensaje)
    {

	this.strNombreRemitente = strNombreRemitente;
	this.intNumRemitente = intNumRemitente;
	this.strNombreDestinatario = strNombreDestinatario;
	this.intNumDestinatario = intNumDestinatario;
	this.strMensaje = strMensaje;
    }

    //No entiendo mucho como hacer para implementar el método enviarMensaje, debería hacer otra clase?
    void enviar()
    {
    }

    void visualizar()
    {
    }

    

}

class MensajeSMS extends Mensaje
{

    MensajeSMS(int intNumRemitente, int intNumDestinatario, String strTexto)
    {

	super("null", intNumRemitente, "null", intNumDestinatario, strTexto);

    }

    MensajeSMS(String strNombreRemitente, int intNumRemitente, String strNombreDestinatario, int intNumDestinatario, String strMensaje)
    {

	super(strNombreRemitente, intNumRemitente, strNombreDestinatario, intNumDestinatario, strMensaje);

    }
    
    void enviar(){
	
	System.out.println("SEND........");
	
	
    }

    @Override
    void visualizar()
    {
	System.out.println("Mensaje enviado por: " + intNumRemitente + " al " + intNumDestinatario);

	if (strNombreDestinatario != strNombreRemitente)
	{
	    System.out.println("El nombre del remitente es: " + strNombreRemitente);
	    System.out.println("El nombre del destinatario es: " + strNombreDestinatario);
	}

	System.out.println(strMensaje);
    }
}

class MensajeMMS extends Mensaje
{

    MensajeMMS(int intNumRemitente, int intNumDestinatario, String strCodImagen)
    {

	super("null", intNumRemitente, "null", intNumDestinatario, strCodImagen);
    }

    MensajeMMS(String strNombreRemitente, int intNumRemitente, String strNombreDestinatario, int intNumDestinatario, String strCodImagen)
    {

	super(strNombreRemitente, intNumRemitente, strNombreDestinatario, intNumDestinatario, strCodImagen);

    }
    
    @Override
    void enviar(){
	
	System.out.println("SEND........");
	
	
    }

    @Override
    void visualizar()
    {
	System.out.println("Mensaje enviado por: " + intNumRemitente + " al " + intNumDestinatario);

	if (strNombreDestinatario != strNombreRemitente)
	{
	    System.out.println("El nombre del remitente es: " + strNombreRemitente);
	    System.out.println("El nombre del destinatario es: " + strNombreDestinatario);
	}

	System.out.println(strMensaje);
    }
    
     public static void main(String[] args)
    {

	MensajeSMS mensajeSMS = new MensajeSMS(666555888, 999666555, "Hola es mi primer mensaje");
	MensajeMMS mensajeMMS = new MensajeMMS("Rubén", 658965478, "Pedro", 111444777, "imagen.jpg");
	mensajeSMS.enviar();
	System.out.println("--------------------------");
	mensajeSMS.visualizar();
		System.out.println("--------------------------");
		
		mensajeMMS.enviar();
		

			System.out.println("--------------------------");

			mensajeMMS.visualizar();
    }

   
    
    
    
}
