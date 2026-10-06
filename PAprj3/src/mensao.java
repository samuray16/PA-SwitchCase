import java.util.Scanner; 
public class mensao {


	
	
	
	public static void main(String[] args) { 

	Scanner ler = new Scanner (System.in); 

	String mensao; 

	System.out.println("escreva a mensao"); 

	mensao = ler.next(); 

	switch(mensao) { 

	case "Mb": 

	case "mB": 

	case "mb": 

	case "MB": 

	System.out.println("muito bom"); 

	break;
	case "B": 

	case "b": 

	System.out.println("bom desempenho"); 

	break; 

	case "R": 

	case "r": 

	System.out.println("regular" ); 

	break; 

	case "I": 

	case "i": 

	System.out.println("insatisfatorio"); 

	break; 

	default: 

	System.out.println("mensao invalida"); 

	} 

	 

	} 

	} 
