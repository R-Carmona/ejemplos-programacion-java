/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion02;

/**
 *
 * @author ruben
 */
public class ExplotacionAgricola
{
    

    
    
    
    
    
    
    

}

class Cultivo
{

    public static Cultivo[] arrayCultivos = new Cultivo[20];

    enum TIPOS_REGADIOS
    {
	SECANO, INUNDACION, GOTERO, ASPERSION
    };

    String strNombreCultivo;
    String strFechaPlantacion;

    double dblExtension;

    int intContadorArrayCultivo;

    Cultivo()
    {
	arrayCultivos[intContadorArrayCultivo] = this;
	intContadorArrayCultivo++;
    }

    public Cultivo(String strNombreCultivo, String strFechaPlantacion, double dblExtension)
    {
	this.strNombreCultivo = strNombreCultivo;
	this.strFechaPlantacion = strFechaPlantacion;
	this.dblExtension = dblExtension;
	
	arrayCultivos[intContadorArrayCultivo] = this;
	intContadorArrayCultivo++;
    }

    @Override
    public String toString()
    {
	return "Cultivo=" + strNombreCultivo + ", Fecha Plantación="
		+ strFechaPlantacion + ", Extension=" + dblExtension + " Fanegas";
    }
    
        void listaCultivos(Cultivo [] cultivos){
	
	for (int i = 0; i <cultivos.length ; i++)
	{
	    cultivos[i].toString();
	}


    }
    
    void totalRecolecciones(Cultivo [] cultivos){
	
	double dblPrecioTotal;
	
    }
    
    
    
    public static void main(String[] args)
    {
	
	Cultivo miCultivo=new Cultivo("Berenjenas", "15/04/2016", 50000);
	System.out.println(arrayCultivos[0]);
	
	
	
    }

    
    

}

class Plantacion extends Cultivo{
    
    String strFechaRecolecion;
    
    double dblKilosObtenidos,
	    dblPrecioVenta;

    public Plantacion(String strFechaRecolecion, double dblKilosObtenidos, double dblPrecioVenta, String strNombreCultivo, String strFechaPlantacion, double dblExtension)
    {
	super(strNombreCultivo, strFechaPlantacion, dblExtension);
	this.strFechaRecolecion = strFechaRecolecion;
	this.dblKilosObtenidos = dblKilosObtenidos;
	this.dblPrecioVenta = dblPrecioVenta;
    }

   

    @Override
    public String toString()
    {
	return super.toString() + " ,Fecha Recolecion=" 
		+ strFechaRecolecion + ", Kilos Obtenidos=" + dblKilosObtenidos
		+ ", Precio Venta=" + dblPrecioVenta + '€';
    }
    
    
    
    public static void main(String[] args)
    {
	
	
	Plantacion miPlantacion = new Plantacion("30/04/2016", 3000, 5, "Pimientos", "01/01/2016", 5000);
	
	System.out.println(arrayCultivos[0]);
	
	
	
    }
    
    
    
      
    
}

class Arbolado extends Cultivo {
    
    double dblNumArboles,
	    dblAnioDeVida;

    public Arbolado(double dblNumArboles, double dblAnioDeVida, String strNombreCultivo, String strFechaPlantacion, double dblExtension)
    {
	super(strNombreCultivo, strFechaPlantacion, dblExtension);
	this.dblNumArboles = dblNumArboles;
	this.dblAnioDeVida = dblAnioDeVida;
    }
    
    
    
    public static void main(String[] args)
    {
	
	Arbolado miArbolado=new Arbolado(250, 3, "Cipreses", "11/02/2016", 3500);
	
	System.out.println(arrayCultivos[0]);
    }

    @Override
    public String toString()
    {
	return super.toString() + " Arbolado" + " Numero de Arboles="
		+ dblNumArboles + ", Años de vida=" + dblAnioDeVida + ' ';
    }
    
    
	  
    
       
}

////////////////////////////////////////////////////////////////

class Cosechas{
    
    String strFechaReolecion;
    double dblKilos;
    double dblPrecio;
    
    
}




class Frutales extends Arbolado{
        
    
    String strNombre;
    String strVariedad;

    public Frutales(double dblNumArboles, double dblAnioDeVida, String strNombreCultivo, String strFechaPlantacion, double dblExtension)
    {
	super(dblNumArboles, dblAnioDeVida, strNombreCultivo, strFechaPlantacion, dblExtension);
    }
    
    
    
    
    
    
    
    
}

class Citricos extends Arbolado{

    public Citricos(double dblNumArboles, double dblAnioDeVida, String strNombreCultivo, String strFechaPlantacion, double dblExtension)
    {
	super(dblNumArboles, dblAnioDeVida, strNombreCultivo, strFechaPlantacion, dblExtension);
    }
    
    
     enum TIPOS_CITRICOS
    {
	POMELO,NARANJA,LIMON,MANDARINA
    };
    
    
    
}











