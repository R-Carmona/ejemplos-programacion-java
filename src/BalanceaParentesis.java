
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class BalanceaParentesis
{
    public static void main(String[] args)
    {
	
	Scanner teclado=new Scanner (System.in);
	
	String expresion=teclado.nextLine();
	
	Stack<Character> st = new Stack<Character>();
	
	
	
	
	for (int i = 0; i < expresion.length(); i++)
	{
	    
	    if (expresion.charAt(i)==')')
	    {
		st.push(new Character('('));
	    }
	    
	    if (expresion.charAt(i)=='(');
	    {
		
		
	    }
 
	   
		    
	    
	    
	}
	
	
	
    }
}
