/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion02;

import static examenes.evaluacion02.IVA.NORMAL;
import static examenes.evaluacion02.IVA.REDUCIDO;
import static examenes.evaluacion02.IVA.SUPERREDUCIDO;
import static examenes.evaluacion02.UNIDADES.KILOS;
import static examenes.evaluacion02.UNIDADES.UNIDADES;
import java.util.ArrayList;


public class Pyme {
    
    public static void totalVentas(DocumentoVenta[] d){
        
    }
    
    public static void listadoVentas(DocumentoVenta[] d){
        
    }

    public static void main(String[] args) {
        
       
        
        Producto p1=new Producto(1,"Alcachofas", REDUCIDO, KILOS,12);
        Producto p2=new Producto(2,"Leche", NORMAL, UNIDADES, 3);
        Producto p3=new Producto(3,"Agua", SUPERREDUCIDO, UNIDADES, 4);
        Producto p4=new Producto(4,"Coliflor", NORMAL, KILOS, 1.4);
        Producto p5=new Producto(5,"Arroz", NORMAL, KILOS, 1.7); 
        
        Cliente c1=new Cliente("Rubén", "San José", 44222333, 20);
        Cliente c2=new Cliente("Cristina", "San Pedro", 33444111, 15);
        
        
        
        
        

    }

}

// Los métodos son públicos y abstractos, las variables son constantes.
interface IVA {

    float TIPO[]
            = {
                4.0f, 10.0f, 21.0f
            };
    int SUPERREDUCIDO = 0,
            REDUCIDO = 1,
            NORMAL = 2;

}

interface UNIDADES{
    
    String ARRAY_UNIDADES[]={"Unidades", "Kilos"};
    int UNIDADES=0,
            KILOS=1;
    
    
}

class Producto implements IVA, UNIDADES{
    
    private int intCodigo;
    private String strDescripcion;
    private float TIPO_IVA;

    public double getDblPrecio() {
        return dblPrecio;
    }
    
    private String TIPO_UNIDAD;
    private double dblPrecio;
    

    public Producto(int intCodigo, String strDescripcion,int TIPO_IVA, int TIPO_UNIDAD, double precio) {
        
        this.dblPrecio=precio;
        this.TIPO_UNIDAD=ARRAY_UNIDADES[TIPO_UNIDAD];
        this.TIPO_IVA = TIPO[TIPO_IVA];
        this.intCodigo = intCodigo;
        this.strDescripcion = strDescripcion;
    }

    public float getTIPO_IVA() {
        return TIPO_IVA;
    }
    
    

    @Override
    public String toString() {
        return "Producto{" + "intCodigo=" + intCodigo + ", strDescripcion=" +
                strDescripcion + ", TIPO_IVA=" + TIPO_IVA + ", TIPO_UNIDAD="
                + TIPO_UNIDAD + ", Precio=" + dblPrecio + "€" +'}';
    }
    
    
    
    public static void main(String[] args) {
        
        Producto p1=new Producto(1,"Alcachofas", REDUCIDO, KILOS,12);
        Producto p2=new Producto(2,"Leche", NORMAL, UNIDADES, 3);
        Producto p3=new Producto(3,"Agua", SUPERREDUCIDO, UNIDADES, 4);
        Producto p4=new Producto(4,"Coliflor", NORMAL, KILOS, 1.4);
        Producto p5=new Producto(5,"Arroz", NORMAL, KILOS, 1.7);       
        Producto p6=new Producto(6,"Jabón", SUPERREDUCIDO, UNIDADES, 2);
               
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
                
    } 
    
    
    
}



class Cliente{
    
    private String strNombre,
            strDireccion;
    
    private double dblDni,
            dblDescuento;

    public Cliente(String strNombre, String strDireccion, double dblDni, double dblDescuento) {

        this.strNombre = strNombre;
        this.strDireccion = strDireccion;
        this.dblDni = dblDni;
        this.dblDescuento = dblDescuento/100;
    }

    @Override
    public String toString() {
        return "Cliente{" + "strNombre=" + strNombre + ", strDireccion=" + strDireccion + ", dblDni=" + dblDni + ", dblDescuento=" + dblDescuento + "%" + '}';
    }
    
    
    
    public static void main(String[] args) {
        
        Cliente c1=new Cliente("Rubén", "San José", 44222333, 20);
        Cliente c2=new Cliente("Cristina", "San Pedro", 33444111, 15);
        Cliente c3=new Cliente("Fran","El Esparragal", 77888999, 29);
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}

class DocumentoVenta{
    
   
    ArrayList<DocumentoVenta> ArrayDocumentoVenta = new ArrayList<DocumentoVenta>();
            
    
    private String strFecha,
            strEjercicio;

    public DocumentoVenta(String strFecha, String strEjercicio) {
        
        this.strFecha = strFecha;
        this.strEjercicio = strEjercicio;
        ArrayDocumentoVenta.add(this);
              
    }   
    
    public void Total(){              
    }
    
    
}

abstract class LineaVenta{
    
    protected Producto articulo;
    protected int intCantidad;
    protected double dblPrecio=articulo.getDblPrecio();
    ArrayList<LineaVenta> ArrayLineaVenta = new ArrayList<LineaVenta>();
    
    abstract double importe();
    
}

class LineaFactura extends LineaVenta{
    
    @Override
    double importe(){
        return intCantidad*dblPrecio*(1+articulo.getTIPO_IVA());  
    }
    
    
}

class LineaTique extends LineaVenta{
    
    @Override
    double importe(){
       return intCantidad*dblPrecio; 
    }
    
}

class Factura extends DocumentoVenta{
    
    private int numFactura;
    private int numCliente;

    public Factura(String strFecha, String strEjercicio) {
        super(strFecha, strEjercicio);
    }
    
       
}

class Tique{
    
    private String strHora;
    
            }
    
