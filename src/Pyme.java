/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 *
 * @author ruben
 */
public class Pyme
{

    public static void main(String[] args)
    {

    }

}

// Los métodos son públicos y abstractos, las variables son constantes.
interface IVA
{

    float TIPO[] =
    {
	4.0f, 10.0f, 21.0f
    };
    int SUPERREDUCIDO = 0,
	    REDUCIDO = 1,
	    NORMAL = 2;

}

class Producto implements IVA
{

    private int intCodigo;
    private String strDescripcion;
    private String strUnidadMedida;
    public static Producto[] ListaProducto = new Producto[2];
    private float IVA;
    private static int intContadorArray;
    
    
    public double getDblPrecio(){
	return 0;
    };

    public float getIVA()
    {
	return IVA;
    }

    public void setIVA(int IVA)
    {
	this.IVA = TIPO[IVA];
    }

    public int getIntCodigo()
    {
	return intCodigo;
    }

    public void setIntCodigo(int intCodigo)
    {
	this.intCodigo = intCodigo;
    }

    public String getStrDescripcion()
    {
	return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion)
    {
	this.strDescripcion = strDescripcion;
    }

    public String getStrUnidadMedida()
    {
	return strUnidadMedida;
    }

    public void setIntUnidadMedida(String strUnidadMedida)
    {
	this.strUnidadMedida = strUnidadMedida;
    }

    public static Producto[] getListaProducto()
    {
	return ListaProducto;
    }

    public static void setListaProducto(Producto[] ListaProducto)
    {
	Producto.ListaProducto = ListaProducto;
    }

    public Producto()
    {
	ListaProducto[intContadorArray] = this;
	intContadorArray++;
    }

    public Producto(int intCodigo, String strDescripcion, String strUnidadMedida, int IVA)
    {

	this.strDescripcion = strDescripcion;
	this.strUnidadMedida = strUnidadMedida;
	this.intCodigo = intCodigo;
	this.IVA = TIPO[IVA];
	ListaProducto[intContadorArray] = this;
	intContadorArray++;

    }

    @Override
    public String toString()
    {
	return "PRODUCTO: " + " Código=" + intCodigo + ", Descripcion=" + strDescripcion
		+ ", Unidad de Medida=" + strUnidadMedida + ", IVA=" + IVA + "%";
    }

    public static void main(String[] args)
    {

	Producto miProducto = new Producto(2255, "Acelgas", "Kg", REDUCIDO);
	Producto miProducto2 = new Producto(1111, "Bajocas", "Kg", SUPERREDUCIDO);

	//System.out.println(miProducto.toString());
	System.out.println(ListaProducto[0]);
	System.out.println(ListaProducto[1]);

    }

}

class Articulo extends Producto
{

    private double dblPrecio;

    public Articulo()
    {
    }

    public Articulo(int intCodigo, String strDescripcion, String strUnidadMedida, int IVA, double dblPrecio)
    {
	super(intCodigo, strDescripcion, strUnidadMedida, IVA);
	this.dblPrecio = dblPrecio;
    }

    public double getDblPrecio()
    {
	return dblPrecio;
    }

    public void setDblPrecio(double dblPrecio)
    {
	this.dblPrecio = dblPrecio;
    }

    @Override
    public String toString()
    {
	return super.toString() + " Precio=" + dblPrecio + "€" + getStrUnidadMedida();
    }

    public static void main(String[] args)
    {

	Articulo miArticulo = new Articulo(6633, "Alcachofas", " Kg", 1, 23.11);
	Articulo miArticulo2 = new Articulo(9933, "Tomate en Conserva", " Und", 1, 85.11);

	System.out.println(miArticulo);
	System.out.println(miArticulo2);
	System.out.println();

	System.out.println(ListaProducto[0]);
	System.out.println(ListaProducto[1]);

    }

}

class Cliente
{

    private int intNumCliente;
    private int intDNI;
    private String strNombre,
	    strDireccion;
    private float flDescuento;
    static int intContadorClientes;

    static Cliente[] ListaClientes = new Cliente[10];

    public Cliente()
    {
	ListaClientes[intContadorClientes] = this;
	intContadorClientes++;

    }

    public Cliente(int intNumCliente, int intDNI, String strNombre, String strDireccion, float flDescuento)
    {
	this.intNumCliente = intNumCliente;
	this.intDNI = intDNI;
	this.strNombre = strNombre;
	this.strDireccion = strDireccion;
	this.flDescuento = flDescuento;

	ListaClientes[intContadorClientes] = this;

	intContadorClientes++;
    }

    public int getIntNumCliente()
    {
	return intNumCliente;
    }

    public void setIntNumCliente(int intNumCliente)
    {
	this.intNumCliente = intNumCliente;
    }

    public int getIntDNI()
    {
	return intDNI;
    }

    public void setIntDNI(int intDNI)
    {
	this.intDNI = intDNI;
    }

    public String getStrNombre()
    {
	return strNombre;
    }

    public void setStrNombre(String strNombre)
    {
	this.strNombre = strNombre;
    }

    public String getStrDireccion()
    {
	return strDireccion;
    }

    public void setStrDireccion(String strDireccion)
    {
	this.strDireccion = strDireccion;
    }

    public float getFlDescuento()
    {
	return flDescuento;
    }

    public void setFlDescuento(float flDescuento)
    {
	this.flDescuento = flDescuento;
    }

    public static int getIntContadorClientes()
    {
	return intContadorClientes;
    }

    public static void setIntContadorClientes(int intContadorClientes)
    {
	Cliente.intContadorClientes = intContadorClientes;
    }

    public static Cliente[] getListaClientes()
    {
	return ListaClientes;
    }

    public static void setListaClientes(Cliente[] ListaClientes)
    {
	Cliente.ListaClientes = ListaClientes;
    }

    @Override
    public String toString()
    {
	return "Cliente: " + "Número=" + intNumCliente + ", DNI=" + intDNI + ", Nombre=" + strNombre + ", Direccion=" + strDireccion + ", Descuento=" + flDescuento + "%";
    }

    public static void main(String[] args)
    {

	Cliente miCliente = new Cliente(222, 45888777, "Rubén", "San José 18", 19);
	Cliente miCliente2 = new Cliente(222, 34555777, "Cristina", "San José 18", 75);

	System.out.println(ListaClientes[0]);
	System.out.println(ListaClientes[1]);

    }

}

class SuperLineaFacturaTique
{
    
    protected int intNumArticulo,
	    intCantidad;

    protected double dblPrecio;

    public SuperLineaFacturaTique()
    {
    }

    public SuperLineaFacturaTique(int intNumArticulo, int intCantidad, double dblPrecio)
    {
	this.intNumArticulo = intNumArticulo;
	this.intCantidad = intCantidad;
	this.dblPrecio = dblPrecio;
    }

    public int getIntNumArticulo()
    {
	return intNumArticulo;
    }

    public void setIntNumArticulo(int intNumArticulo)
    {
	this.intNumArticulo = intNumArticulo;
    }

    public int getIntCantidad()
    {
	return intCantidad;
    }

    public void setIntCantidad(int intCantidad)
    {
	this.intCantidad = intCantidad;
    }

    public double getDblPrecio()
    {
	
		
	for (int i = 0; i < Producto.ListaProducto.length; i++)
	{
	    
	    if (intNumArticulo==Articulo.ListaProducto[i].getIntCodigo())
	    {
		
		dblPrecio=Articulo.ListaProducto[i].getDblPrecio();
		
		
	    }
	}
	
	
	
	
	return dblPrecio;
    }

    public void setDblPrecio(double dblPrecio)
    {
	this.dblPrecio = dblPrecio;
    }

    @Override
    public String toString()
    {
	return "Número Articulo=" + intNumArticulo + ", Cantidad=" + intCantidad + ", Precio=" + dblPrecio + "€";
    }

}

class LineaFactura extends SuperLineaFacturaTique
{

   
    double importe()
    {

	return super.getDblPrecio()*intCantidad;

    }

    @Override
    public String toString()
    {
	return super.toString() + " Importe: " + importe();
    }

    public LineaFactura()
    {
    }

    public LineaFactura(int intNumArticulo, int intCantidad, double dblPrecio)
    {
	super(intNumArticulo, intCantidad, dblPrecio);
    }
    
      
    

    public static void main(String[] args)
    {
	Articulo miArticulo = new Articulo(222, "Alcachofas", " Kg", Producto.NORMAL, 23.11);
	Articulo miArticulo2 = new Articulo(111, "Tomate en Conserva", " Und", Producto.SUPERREDUCIDO, 85.11);

	System.out.println(miArticulo);
	System.out.println(miArticulo2);
	System.out.println();

	System.out.println(Producto.ListaProducto[0]);
	System.out.println(Producto.ListaProducto[1]);
	
	
	
	LineaFactura miVenta = new LineaFactura(222, 10, 23.11);
	System.out.println(miVenta);
	
	

    }
    
    

}

class LineaTique extends SuperLineaFacturaTique
{
    
    float getIVA()
    {
	
	float floIVA=0;
	
	for (int i = 0; i < Producto.ListaProducto.length; i++)
	{
	    
	    if (intNumArticulo==Articulo.ListaProducto[i].getIntCodigo())
	    {
		
		floIVA=Articulo.ListaProducto[i].getIVA();
		
		
	    }
	}
	
	return floIVA;
	
	
    }

        double importe()
    {

	return (getDblPrecio()*intCantidad)*getIVA();

    }

    @Override
    public String toString()
    {
	return super.toString() + " Importe: " + importe() + " IVA:" + getIVA() + "%";
    }

    public LineaTique()
    {
    }

    public LineaTique(int intNumArticulo, int intCantidad, double dblPrecio)
    {
	super(intNumArticulo, intCantidad, dblPrecio);
    }
    
    public static void main(String[] args)
    {
	
	Articulo miArticulo = new Articulo(222, "Alcachofas", " Kg", Producto.NORMAL, 23.11);
	Articulo miArticulo2 = new Articulo(111, "Tomate en Conserva", " Und", Producto.SUPERREDUCIDO, 85.11);

	System.out.println(miArticulo);
	System.out.println(miArticulo2);
	System.out.println();

	System.out.println(Producto.ListaProducto[0]);
	System.out.println(Producto.ListaProducto[1]);
	
	
	
	LineaTique miVenta = new LineaTique(111, 10, 85.11);
	System.out.println(miVenta);
	
	
	
    }
	  

}

class SuperFacturaTique
{

    protected Calendar FechaHora = new GregorianCalendar();

    private int intAnio = FechaHora.get(Calendar.YEAR),
	    intMes = FechaHora.get(Calendar.MONTH),
	    intDia = FechaHora.get(Calendar.DAY_OF_MONTH),
	    intEjercicio = intAnio,
	    intNumFactura,
	    intContadorArray;
    

    private String strEjercicio = intAnio + "",
	    strFecha = intDia + "/" + intMes + "/" + intAnio;

    void Total()
    {

    }

    @Override
    public String toString()
    {
	return "SuperFacturaTique{" + "FechaHora=" + FechaHora + ", intAnio=" + intAnio + ", intMes=" + intMes + ", intDia=" + intDia + ", intEjercicio=" + intEjercicio + ", intNumFactura=" + intNumFactura + ", intContadorArray=" + intContadorArray + ", strEjercicio=" + strEjercicio + ", strFecha=" + strFecha + '}';
    }
    
    

    static SuperFacturaTique[] LineaslVentas = new SuperFacturaTique[10];

    public SuperFacturaTique()
    {
	LineaslVentas[intContadorArray] = this;
	intContadorArray++;

    }
    
    

}

class Factura extends SuperFacturaTique
{

    private int intNumFactura,
	    intNumCliente,
	    intDNICliente;

    private String strFecha,
	    strNomCliente,
	    strDireCliente;

    private float flDescuCliente;
    
    private int inrContadorArrayDos;
    private SuperLineaFacturaTique [] articulos=new SuperLineaFacturaTique[10];

    public Factura()
    {	
	
    }

    public Factura(int intNumFactura, int intNumCliente, 
	    int intDNICliente, String strFecha, String strNomCliente,
	    String strDireCliente, float flDescuCliente)
    {
	this.intNumFactura = intNumFactura;
	this.intNumCliente = intNumCliente;
	this.intDNICliente = intDNICliente;
	this.strFecha = strFecha;
	this.strNomCliente = strNomCliente;
	this.strDireCliente = strDireCliente;
	this.flDescuCliente = flDescuCliente;
    }

    @Override
    public String toString()
    {
	return "Factura" + " número=" + intNumFactura + ", Número Cliente=" 
		+ intNumCliente + ", DNI Cliente=" + intDNICliente + 
		", Fecha=" + strFecha + ", Nombre =" + strNomCliente 
		+ ", Direción=" + strDireCliente 
		+ ", Descuento=" + flDescuCliente + ' ';
    }
    
    
    
    public static void main(String[] args)
    {
	Factura miFactura=
		new Factura(555,111,33222555,"12/04/2016","Rubén","San José",5);
	
	System.out.println(miFactura);
	System.out.println(SuperFacturaTique.LineaslVentas[0]);
	
    }
    
    
    
    
    
    
    
    
    

}

class Tique extends SuperFacturaTique
{
    
    private int inrContadorArrayTre;
    private SuperLineaFacturaTique [] lineaVentas=new SuperLineaFacturaTique[10];

    int intHora = FechaHora.get(Calendar.HOUR_OF_DAY),
	    intMinuto = FechaHora.get(Calendar.MINUTE),
	    intSegundo = FechaHora.get(Calendar.SECOND);

    String strHora = intHora + ":" + intMinuto + ":" + intSegundo;

}
