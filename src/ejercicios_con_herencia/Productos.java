/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_herencia;

/**
 *
 * @author psulfo
 */
public class Productos
{

    String strFechaCaducidad;
    int intNumeroLote;

    @Override
    public String toString()
    {
	return "Productos{" + "strFechaCaducidad=" + strFechaCaducidad 
		+ ", intNumeroLote=" + intNumeroLote + '}';
    }

    public Productos(String strFechaCaducidad, int intNumeroLote)
    {
	this.strFechaCaducidad = strFechaCaducidad;
	this.intNumeroLote = intNumeroLote;
    }

    public String getStrFechaCaducidad()
    {
	return strFechaCaducidad;
    }

    public void setStrFechaCaducidad(String strFechaCaducidad)
    {
	this.strFechaCaducidad = strFechaCaducidad;
    }

    public int getIntNumeroLote()
    {
	return intNumeroLote;
    }

    public void setIntNumeroLote(int intNumeroLote)
    {
	this.intNumeroLote = intNumeroLote;
    }

}

//Realizamos una clasa con abstracción para poder meter algunos campos comunes a los productos finales.
class DatosProductos extends Productos
{

    @Override
    public String toString()
    {
	return "DatosProductos{" + "InfoExpecifica=" + InfoExpecifica + ", "
		+ "FechaEmbasado=" + FechaEmbasado + ", PaisOrigen="
		+ PaisOrigen + '}' + super.toString();
    }

    public DatosProductos(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    String InfoExpecifica;
    String FechaEmbasado;
    String PaisOrigen;

    public String getInfoExpecifica()
    {
	return InfoExpecifica;
    }

    public void setInfoExpecifica(String InfoExpecifica)
    {
	this.InfoExpecifica = InfoExpecifica;
    }

    public String getFechaEmbasado()
    {
	return FechaEmbasado;
    }

    public void setFechaEmbasado(String FechaEmbasado)
    {
	this.FechaEmbasado = FechaEmbasado;
    }

    public String getPaisOrigen()
    {
	return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen)
    {
	this.PaisOrigen = PaisOrigen;
    }

}

class DatosProductosTemperaturas extends DatosProductos
{

    @Override
    public String toString()
    {
	return "DatosProductosTemperaturas{" + "intTemperaturaMantenimiento=" +
		intTemperaturaMantenimiento + '}' + super.toString();
    }

    public DatosProductosTemperaturas(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    int intTemperaturaMantenimiento;

    public int getIntTemperaturaMantenimiento()
    {
	return intTemperaturaMantenimiento;
    }

    public void setIntTemperaturaMantenimiento(int intTemperaturaMantenimiento)
    {
	this.intTemperaturaMantenimiento = intTemperaturaMantenimiento;
    }

}

class ProductoFresco extends DatosProductos
{

    public ProductoFresco(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    @Override
    public String toString()
    {
	return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

class ProductoRefrigerado extends DatosProductosTemperaturas
{

    public ProductoRefrigerado(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    String strCodOrganismoSupervision;

    @Override
    public String toString()
    {
	return "ProductoRefrigerado{" + "strCodOrganismoSupervision="
		+ strCodOrganismoSupervision + '}' + super.toString();
    }

    public String getstrCodOrganismoSupervision()
    {
	return strCodOrganismoSupervision;
    }

    public void setstrCodOrganismoSupervision(String strCodOrganismoSupervision)
    {
	this.strCodOrganismoSupervision = strCodOrganismoSupervision;
    }

}

class ProducCongeladoAire extends DatosProductosTemperaturas
{

    public ProducCongeladoAire(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    @Override
    public String toString()
    {
	return "ProducCongeladoAire{" + "intPorcientoNitrogeno=" +
		intPorcientoNitrogeno + ", intPorcientoOxigeno=" +
		intPorcientoOxigeno + ", intPorcientoDioxicoCarbono="
		+ intPorcientoDioxicoCarbono + ", intPorcientoVaporAgua="
		+ intPorcientoVaporAgua + '}' + super.toString();
    }

    int intPorcientoNitrogeno, intPorcientoOxigeno, intPorcientoDioxicoCarbono,
	    intPorcientoVaporAgua;

    public int getIntPorcientoNitrogeno()
    {
	return intPorcientoNitrogeno;
    }

    public void setIntPorcientoNitrogeno(int intPorcientoNitrogeno)
    {
	this.intPorcientoNitrogeno = intPorcientoNitrogeno;
    }

    public int getIntPorcientoOxigeno()
    {
	return intPorcientoOxigeno;
    }

    public void setIntPorcientoOxigeno(int intPorcientoOxigeno)
    {
	this.intPorcientoOxigeno = intPorcientoOxigeno;
    }

    public int getIntPorcientoDioxicoCarbono()
    {
	return intPorcientoDioxicoCarbono;
    }

    public void setIntPorcientoDioxicoCarbono(int intPorcientoDioxicoCarbono)
    {
	this.intPorcientoDioxicoCarbono = intPorcientoDioxicoCarbono;
    }

    public int getIntPorcientoVaporAgua()
    {
	return intPorcientoVaporAgua;
    }

    public void setIntPorcientoVaporAgua(int intPorcientoVaporAgua)
    {
	this.intPorcientoVaporAgua = intPorcientoVaporAgua;
    }

}

class ProductoCongeladoAgua extends DatosProductosTemperaturas
{

    @Override
    public String toString()
    {
	return "ProductoCongeladoAgua{" + "Salinidad=" + Salinidad + '}' + 
		super.toString();
    }

    public ProductoCongeladoAgua(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    int Salinidad; //Gramos por litro.

    public int getSalinidad()
    {
	return Salinidad;
    }

    public void setSalinidad(int Salinidad)
    {
	this.Salinidad = Salinidad;
    }

}

class ProductosCongeladoNitrogeno extends DatosProductosTemperaturas
{

    public ProductosCongeladoNitrogeno(String strFechaCaducidad, int intNumeroLote)
    {
	super(strFechaCaducidad, intNumeroLote);
    }

    @Override
    public String toString()
    {
	return "ProductosCongeladoNitrogeno{" + "strMetodoCongelacion=" + 
		strMetodoCongelacion + ", intTiempoSegundos="
		+ intTiempoSegundos + '}' + super.toString();
    }

    String strMetodoCongelacion;
    int intTiempoSegundos;

    public String getStrMetodoCongelacion()
    {
	return strMetodoCongelacion;
    }

    public void setStrMetodoCongelacion(String strMetodoCongelacion)
    {
	this.strMetodoCongelacion = strMetodoCongelacion;
    }

    public int getIntTiempoSegundos()
    {
	return intTiempoSegundos;
    }

    public void setIntTiempoSegundos(int intTiempoSegundos)
    {
	this.intTiempoSegundos = intTiempoSegundos;
    }

}
