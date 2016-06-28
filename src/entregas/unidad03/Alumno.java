/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidad03;


import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Alumno {

    private String strNombre="";
    private float floNota1, floNota2, floNota3, floNota4, floNota5, floNotaMedia;
    private int  intEdad,intNumeroCaracteresNombre;
    private static float floCosteTitulo;
    
    
   
    //CONSTRUCTORES.
    
    //Constructor por defecto.
    public Alumno() 
    {
		
	
	
	
	
    }

    //Constructor.
    public Alumno(char ch) {
	
	pedirNombre();
	pedirEdad();
	pedirTodasNotas();
	
    }

    //Recibe nombre Alumno.
    public Alumno(String n) {
	
	
	this.strNombre=n;
	
	if (intEdad==0){
	    
	    pedirEdad();
	}
	
	if (floNota1==0)
	{
	    pedirTodasNotas();
	}
	
    }

    //Recibe edad Alumno
    public Alumno(int e) {
		
	this.intEdad=e;
	
	if (strNombre.equals("")){
	    
	    pedirNombre();
	}
	
	if (floNota1==0)
	{
	    pedirTodasNotas();
	}
	
    }

    //Recibe nota media
    public Alumno(float n) {
	
	this.floNotaMedia=n;
	
	if (strNombre.equals("")){
	    
	    pedirNombre();
	}
	
	if (floNota1==0)
	{
	    pedirTodasNotas();
	}
	if (intEdad==0){
	    
	    pedirEdad();
	    
	}
	
	
    }
    
    
    //MÉTODOS..................................................................
    
    
   //Devolver Nota Média 
   public float devtNotaMedia(){
       
       return ((floNota1+floNota2+floNota3+floNota4+floNota5)/5);
   } 
    
   
   //Devolver Número de Carácteres del Nombre
   public int devNumCaracterNombre(){
       
       return strNombre.length();
	       
   }
    
   
   // Get valor Edad.
   
   public int getEdad(){
       
       return intEdad;
       
   }
   
   public void  setEdad(int intEdad){
       
       this.intEdad=intEdad;
       
       
   }
   
   // Valor strNombre.
   
   public String getNombre(){
       
       return this.strNombre;
       
   } 
   
   public void setNombre(String strNombre){
       
       this.strNombre=strNombre;
       
   }
   
   
   // Set Valor floNota.
   
   public void setNota1(float floNota1){
       
       this.floNota1=floNota1;
   }
   public void setNota2(float floNota2){
       
       this.floNota2=floNota2;
   }
   public void setNota3(float floNota3){
       
       this.floNota3=floNota3;
   }
   public void setNota4(float floNota4){
       
       this.floNota4=floNota4;
   }
   public void setNota5(float floNota5){
       
       this.floNota5=floNota5;
   }
   
    //Inicializar Coste Título
   public static void inicializarCosteTitulo(float coste){
       
       floCosteTitulo=coste;
       
   }
    
   
   //Inicial del Nombre
   
   public char inicialNombre(String strInicial){
       
       char Inicial=strInicial.charAt(0);
       
       return Inicial;
       
   }
    
   
   //Pedir Cadena
   
   public void pedirCadena(){
       
       
   }
   
   
   //Pedir Coste Título
   
   public static void pedirCosteTitulo(){
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduzca el coste del título: ");
       floCosteTitulo=teclado.nextFloat();
                    
   }
   
   //Pedir Edad
   
   public void pedirEdad(){
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduzca edad del alumno: ");
       intEdad=teclado.nextInt();
                    
   }
   
   //Pedir Nombre
   
   public void pedirNombre(){
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduzca nobre del Alumno: ");
       strNombre=teclado.next();
                    
   }
   
   //Pedir Nota
   
   public void pedirNota(){
       
       float nota;
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduzca módulo a modificar (1 a 5): ");
       int i=teclado.nextInt();
       System.out.println("Introduzca puntuación de la nota.");
       nota=teclado.nextFloat();
       
       
       switch(i){
	   
	   case 1: floNota1=nota;
	   break;
		
	   case 2: floNota2=nota;
	   break;
	   
	   case 3: floNota3=nota;
	   break;
	   
	   case 4: floNota4=nota;
	   break;
	   
	   case 5: floNota5=nota;
	   break;
	   
	   default: System.out.println("Error al introducia módulo.");
		   
	      
       }
       
       System.out.println("La nota introducida para el módulo " + i + " es: " + nota +".");
                    
   }
   
   //Pedir todas las Notas
   
   public void pedirTodasNotas() {
       
       Scanner teclado=new Scanner(System.in);
       
       System.out.println("Introduzca la nota 1: ");
       floNota1=teclado.nextFloat();
       
       
       System.out.println("Introduzca la nota 2: ");
       floNota2=teclado.nextFloat();
       
      
       System.out.println("Introduzca la nota 3: ");
       floNota3=teclado.nextFloat();
       
 
       System.out.println("Introduzca la nota 4: ");
       floNota4=teclado.nextFloat();
       
      
       System.out.println("Introduzca la nota 5: ");
       floNota5=teclado.nextFloat();
            
       
       
   }
   
   
   //Seber notas.
   
   public float getNota1()
   {	
	return floNota1;
   }
   
 public float getNota2(){
	
	return floNota2;
   }
 public float getNota3(){
	
	return floNota3;
   }
 public float getNota4(){
	
	return floNota4;
   }
 public float getNota5(){
	
	return floNota5;
   }
   
   
   
   //Pedir todos los Datos
   
   public void pedirTodosDatos() {
       
       pedirNombre();
       pedirEdad();
       pedirTodasNotas();
            
       
   }
   


// Visual Coste Título.
   
   public void visualCosteTitulo(){
       
       System.out.println("El coste del título para: " + strNombre + " es de: " + floCosteTitulo + "\n");
       
   }
      
// Visual Edad.

   public void visualEdad()
   {
       
        System.out.println("La edad para: " + strNombre + " es de: " + intEdad);
       
   }
   
// Visual Nombre.
   
   public void visualNombre(){
       
        System.out.println("Nombre Alumno: " + strNombre);
       
       }
   
// Visual Notas.
   
   public void visualNotas(){
       
       System.out.println("Las notas del alumno " + strNombre + " son:\n" + 
	       "Nota 1= " + floNota1 + "\n" + 
	       "Nota 2= " + floNota2 + "\n" +
	       "Nota 3= " + floNota3 + "\n" +
	       "Nota 4= " + floNota4 + "\n" +
	       "Nota 5= " + floNota5 + "\n");
       
   }
   
// Visual Todos Los Datos.   

   public void visualTodosDatos(){
       
       visualNombre();
       visualEdad();
       visualNotas();
       visualCosteTitulo();
       
   }


    public void pedirNotaGemelos(Alumno hermano2){
       //USAS H1
       float nota;
       
       Scanner teclado=new Scanner(System.in);
       System.out.println("Introduzca módulo a modificar (1 a 5): ");
       int i=teclado.nextInt();
       System.out.println("Introduzca puntuación de la nota para gemelo uno.");
       nota=teclado.nextFloat();
       
       System.out.println("Introduzca puntuación de la nota para gemelo dos.");
       float  nota2=teclado.nextFloat();
       
       
       switch(i){
	   
	   case 1:floNota1= nota;
	   hermano2.setNota1(nota2);
	   break;
		
	   case 2: floNota2=nota;
	    hermano2.setNota2(nota2);
	   break;
	   
	   case 3: floNota3=nota;
	    hermano2.setNota3(nota2);
	   break;
	   
	   case 4: floNota4=nota;
	    hermano2.setNota4(nota2);
	   break;
	   
	   case 5: floNota5=nota;
	    hermano2.setNota5(nota2);
	   break;
	   
	   default: System.out.println("Error al introducia módulo.");
		   
	      
       }
       
       System.out.println("La nota introducida para el módulo " + i + " es: " + nota +".");
                    
   }
    
    
    
    public static void main(String[] args){
	
    
	Alumno alumno01 = new Alumno();

	//Pedir Coste Título
	System.out.println("PEDIR COSTE DEL TÍTULO");
	Alumno.pedirCosteTitulo();

	//Pedir Datos de alumno01
	System.out.println("INTRODUZCA DATOS PRIMER ALUMNO");
	alumno01.pedirTodosDatos();

	//Pedir Datos de dos Alumonos Gemelos	
	Alumno alumno02 = new Alumno();
	Alumno alumno03 = new Alumno();

	System.out.println("INTRODUZCA DATOS PRIMER GEMELO");
	alumno02.pedirTodosDatos();

	System.out.println("INTRODUZCA DATOS SEGUNDO GEMELO");
	alumno03.pedirNombre();
	alumno03.setEdad(alumno02.getEdad());
	alumno03.pedirTodasNotas();

	
	System.out.println("COPIAMOS ALUMNO01 a ALUMNO04");
	//Hacemos copia primer alumno.
	Alumno alumno04 = new Alumno();
	
	alumno04.setNombre(alumno01.getNombre());
	alumno04.setEdad(alumno01.getEdad());
	alumno04.setNota1(alumno01.getNota1());
	alumno04.setNota2(alumno01.getNota2());
	alumno04.setNota3(alumno01.getNota3());
	alumno04.setNota4(alumno01.getNota4());
	alumno04.setNota5(alumno01.getNota5());

	//Visualizar los datos de los cuatro alumnos.	
	System.out.println("\n DATOS ALUMNOS \n");
	alumno01.visualTodosDatos();
	alumno02.visualTodosDatos();
	alumno03.visualTodosDatos();
	alumno04.visualTodosDatos();

	//Modificar coste título.
	System.out.println("INTRODUZCA NUEVO COSTE TÍTULO");
	Alumno.pedirCosteTitulo();

	//Ver datos alumnos.
	System.out.println("\n NUEVOS DATOS ALUMNOS");
	alumno01.visualTodosDatos();
	alumno02.visualTodosDatos();
	alumno03.visualTodosDatos();
	alumno04.visualTodosDatos();

	//Visualizar letra inicial del primer alumno.
	System.out.println("LETRA DEL NOMBRE DEL PRIMER ALUMNO");
	System.out.println(alumno01.inicialNombre(alumno01.getNombre()));

	//Pedir notas del primer alumno.
	System.out.println("NUEVAS NOTAS ALUMNO 1");
	alumno01.pedirTodasNotas();

	//Modificar una nota del segundo alumno.
	System.out.println("MODIFICAR NOTA SEGUNDO ALUMNO");
	alumno02.pedirNota();

	//Ver datos alumnos.
	System.out.println("\n NUEVOS DATOS ALUMNOS");
	alumno01.visualTodosDatos();
	alumno02.visualTodosDatos();
	alumno03.visualTodosDatos();
	alumno04.visualTodosDatos();

	//Modificar nota del módulo tres, del primer alumno.
	System.out.println("MODIFICAR NOTA PRIMER ALUMNO DEL MÓDULO TRES");
	System.out.println("Introduzca nota: ");
	Scanner teclado = new Scanner(System.in);
	alumno01.setNota3(teclado.nextInt());

	//Modificar nota de los hermanos gemelos.
	System.out.println("MODIFICAR NOTA DE LOS HERMANOS GEMELOS");
	alumno02.pedirNotaGemelos(alumno03);
	
	
	//Ver datos alumnos.
	System.out.println("\n NUEVOS DATOS ALUMNOS");
	alumno01.visualTodosDatos();
	alumno02.visualTodosDatos();
	alumno03.visualTodosDatos();
	alumno04.visualTodosDatos();

	//Visualizar media obtenida de los tres primeros alumnos.
	System.out.println("MEDIA TOTAL DE LOS TRES PRIMEROS ALUMNOS.");
	System.out.println((alumno01.devtNotaMedia() + alumno02.devtNotaMedia() + alumno03.devtNotaMedia()) / 3);

	//Carácteres de los dos hermanos
	System.out.println("NÚMERO DE CARACTERES");
	System.out.println("Primer hermano tiene " + alumno02.devNumCaracterNombre()+ " carácteres.");
	System.out.println("Segundo hermano tiene " + alumno03.devNumCaracterNombre()+ " carácteres.");
    }
	
	
	
    }
    
		
       
    
    
    
    


