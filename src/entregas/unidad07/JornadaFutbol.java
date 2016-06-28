/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidad07;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ruben
 */
public class JornadaFutbol{
    
    public static ArrayList<JornadaFutbol> listaJornadas =
            new ArrayList<JornadaFutbol>();
    
    private int intNumJornada;
    private Partido objPartido;

    public JornadaFutbol(int intNumJornada, Partido objPartido) {
        this.intNumJornada = intNumJornada;
        this.objPartido = objPartido;
        listaJornadas.add(this);
    }
    
    public Estadio getEstadio(){
        return objPartido.getEstadio();        
    }
    
    public void obtenerDatos(Estadio estadio){
        
        for (JornadaFutbol jornadaFutbol : listaJornadas) {
            
            if (estadio.equals(jornadaFutbol.getEstadio())) {
                System.out.println(jornadaFutbol.objPartido);
            }
        }
        
        
    }

    @Override
    public String toString() {
        return "Jornada Número=" + intNumJornada +  objPartido + " " ;
    }
    
    
    
    
    
    
    

   

   
    
    public static void main(String[] args) {
        
       Equipo e01=new Equipo("Real Madrid");
       Equipo e02=new Equipo("Real Murcia");
       Equipo e03=new Equipo("Barcelona");
       Equipo e04=new Equipo("Atlético Madrid");
       Equipo e05=new Equipo("Valencia");
       Equipo e06=new Equipo("Osasuna");
       
       Arbitro a01=new Arbitro("José Mora");
       Arbitro a02=new Arbitro("Felix Adrián");
       Arbitro a03=new Arbitro("Julio Iglésias");
       
       Estadio es01=new Estadio("Camp Nou");
       Estadio es02=new Estadio("Nueva Condomina");
       Estadio es03=new Estadio("Alquerias");
       Estadio es04=new Estadio("El Esparragal");
       
       Partido p01=new Partido("22/06/2016", "16:00", 2, 0, 450002, e01, e02, es01, a03);
       Partido p02=new Partido("10/06/2016", "20:00", 1, 5, 45477, e02, e03, es02, a02);
       Partido p03=new Partido("26/08/2016", "22:00", 0, 1, 15868, e03, e04, es03, a01);
       Partido p04=new Partido("2/07/2016", "23:00", 0, 3, 458947, e04, e01, es04, a03);
       
      JornadaFutbol partido_jugado_01=new JornadaFutbol(1, p04);
      JornadaFutbol partido_jugado_02=new JornadaFutbol(1, p02);
      JornadaFutbol partido_jugado_03=new JornadaFutbol(1, p03);
      JornadaFutbol partido_jugado_04=new JornadaFutbol(1, p04);
      JornadaFutbol partido_jugado_05=new JornadaFutbol(1, p04);
      JornadaFutbol partido_jugado_06=new JornadaFutbol(1, p01);
      
      JornadaFutbol partido_jugado_07=new JornadaFutbol(1, p04);
      JornadaFutbol partido_jugado_08=new JornadaFutbol(1, p02);
      JornadaFutbol partido_jugado_09=new JornadaFutbol(1, p03);
      JornadaFutbol partido_jugado_10=new JornadaFutbol(1, p04);
      JornadaFutbol partido_jugado_11=new JornadaFutbol(1, p04);
      JornadaFutbol partido_jugado_12=new JornadaFutbol(1, p01);

      //Desde cualquier objeto de JornadaFutbol se puede tener 
      // acceso a la lista de los partido jugados en el estadio.      
      partido_jugado_01.obtenerDatos(es04);
      
      partido_jugado_01.obtenerDatos(es01);
        
        
    }
    
    

    
  

    
    
    
    

}

class Estadio {

    private String strEstadio;

    Estadio(String estadio) {
        this.strEstadio = estadio;
    }

    @Override
    public String toString() {
        return " *Estadio: " + strEstadio + "*";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.strEstadio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estadio other = (Estadio) obj;
        if (!Objects.equals(this.strEstadio, other.strEstadio)) {
            return false;
        }
        return true;
    }
    
    

    

}

class Partido {
    
    private String strFecha;
    private String strHora;
    
    private int intResultadoLocal;    
    private int intResultVisitante;
    private int intEspectadores;
    
    private Equipo objEquiLocal;
    private Equipo objEquiVisitante;
    private Estadio objEstadio;
    private Arbitro objArbitro;

    public Partido(String strFecha, String strHora, int intResultadoLocal, int intResultVisitante, int intEspectadores, Equipo objEquiLocal, Equipo objEquiVisitante, Estadio objEstadio, Arbitro objArbitro) {
        this.strFecha = strFecha;
        this.strHora = strHora;
        this.intResultadoLocal = intResultadoLocal;
        this.intResultVisitante = intResultVisitante;
        this.intEspectadores = intEspectadores;
        this.objEquiLocal = objEquiLocal;
        this.objEquiVisitante = objEquiVisitante;
        this.objEstadio = objEstadio;
        this.objArbitro = objArbitro;
    }

    @Override
    public String toString() {
        return  objEstadio + " Partido{" + "Fecha=" + strFecha + ", Hora=" + strHora                
                + intResultVisitante + ", Espectadores=" + intEspectadores 
                +", Equipo Local=" + objEquiLocal + ", Equipo Visitante=" + objEquiVisitante
                +", Resultado Local=" + intResultadoLocal + ", Resultado Visitante=" + intResultVisitante
                + ", Arbitro="+ objArbitro + '}';
    }
    
    Estadio getEstadio(){
        return objEstadio;
    }
  
    

  

   
    
    
    
    
    
    
    

}

class Arbitro {

    private String strArbrito;

    public Arbitro(String strArbrito) {
        this.strArbrito = strArbrito;
    }

    @Override
    public String toString() {
        return "Arbitro{" + strArbrito + '}';
    }
}

class Equipo {

        private String Equipo;

        public Equipo(String Equipo) {
            this.Equipo = Equipo;
        }

        @Override
        public String toString() {
            return "{" + Equipo + '}';
        }
    }
