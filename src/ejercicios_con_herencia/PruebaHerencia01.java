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
public class PruebaHerencia01 {
    
    public static void main(String[] args) {
        
        //FRESCOS
        
        ProductoFresco fresas=new ProductoFresco("2016/05/01", 32546321);
        ProductoFresco naranjas=new ProductoFresco("2016/04/03", 4221365);
        
        fresas.setFechaEmbasado("2016/01/01");
        fresas.setPaisOrigen("España");
        fresas.setInfoExpecifica("Fresas de nuestra tierra.");
        System.out.println(fresas);
        
        naranjas.setFechaEmbasado("2015/12/12");
        naranjas.setPaisOrigen("España");
        naranjas.setInfoExpecifica("Cien por cien España");
        System.out.println(naranjas);
        
        
        //REFRIGERADOS
        
        ProductoRefrigerado natillas=new ProductoRefrigerado("2016/12/05",333666);
        ProductoRefrigerado levadura=new ProductoRefrigerado("2016/06/21",334766);
        ProductoRefrigerado leche=new ProductoRefrigerado("2016/11/31",777666);
        
        natillas.setstrCodOrganismoSupervision("Organismo Altadis");
        natillas.setFechaEmbasado("2016/01/01");
        natillas.setInfoExpecifica("Producto de España");
        natillas.setPaisOrigen("España");
        natillas.setIntTemperaturaMantenimiento(5);
        System.out.println(natillas);
        
        levadura.setstrCodOrganismoSupervision("Organismo Altadis");
        levadura.setFechaEmbasado("2016/03/11");
        levadura.setInfoExpecifica("Producto de España");
        levadura.setPaisOrigen("España");
        levadura.setIntTemperaturaMantenimiento(8);
        System.out.println(levadura);
        
        
        
        leche.setstrCodOrganismoSupervision("Organismo Altadis");
        leche.setFechaEmbasado("2016/08/15");
        leche.setInfoExpecifica("Producto de España - Galicia");
        leche.setPaisOrigen("España");
        leche.setIntTemperaturaMantenimiento(8);
        System.out.println(leche);
        
        
        
        //CONGELADOS AIRE
        
        ProducCongeladoAire caracoles = new ProducCongeladoAire("2016/12/12", 4446652);
        ProducCongeladoAire ostras= new ProducCongeladoAire("2016/12/10", 44123651);
        
        caracoles.setFechaEmbasado("2015/10/02");
        caracoles.setInfoExpecifica("Caracoles del huerto de murcia");
        caracoles.setIntPorcientoDioxicoCarbono(25);
        caracoles.setIntPorcientoNitrogeno(44);
        caracoles.setIntPorcientoOxigeno(6);
        caracoles.setIntPorcientoVaporAgua(25);
        caracoles.setPaisOrigen("España");
        caracoles.setIntTemperaturaMantenimiento(-18);
        System.out.println(caracoles);
        
        
        
        ostras.setFechaEmbasado("2015/12/02");
        ostras.setInfoExpecifica("Ostras del mar menor");
        ostras.setIntPorcientoDioxicoCarbono(10);
        ostras.setIntPorcientoNitrogeno(25);
        ostras.setIntPorcientoOxigeno(25);
        ostras.setIntPorcientoVaporAgua(25);
        ostras.setPaisOrigen("España");
        ostras.setIntTemperaturaMantenimiento(-15);
        System.out.println(ostras);
        
        //CONGELADOS NITRÓGENO
        
        ProductosCongeladoNitrogeno lenguado=new ProductosCongeladoNitrogeno("2016/12/12", 522365);
        ProductosCongeladoNitrogeno pescadilla=new ProductosCongeladoNitrogeno("2016/11/11", 369587);
        
        lenguado.setFechaEmbasado("2016/01/25");
        lenguado.setInfoExpecifica("Pescado de Guardamar");
        lenguado.setIntTemperaturaMantenimiento(-22);
        lenguado.setIntTiempoSegundos(3256);
        lenguado.setStrMetodoCongelacion("ULTRA");
        lenguado.setPaisOrigen("España");
        System.out.println(lenguado);       
        
        //CONGELADOS AGUA
        
        ProductoCongeladoAgua calamares=new ProductoCongeladoAgua("2016/03/25", 4758963);
        ProductoCongeladoAgua pulpo=new ProductoCongeladoAgua("2016/11/21", 369854);
        
        calamares.setFechaEmbasado("2015/11/11");
        calamares.setInfoExpecifica("Calamares de Murcia - La Manga");
        calamares.setIntTemperaturaMantenimiento(-18);
        calamares.setPaisOrigen("España");
        calamares.setSalinidad(25);//Gramos por litro de agua.
        System.out.println(calamares);
        
        pulpo.setFechaEmbasado("2015/11/11");
        pulpo.setInfoExpecifica("Calamares de Murcia - La Manga");
        pulpo.setIntTemperaturaMantenimiento(-18);
        pulpo.setPaisOrigen("España");
        pulpo.setSalinidad(25);//Gramos por litro de agua.
        System.out.println(pulpo);
        
        
        
        
    }
    
}
