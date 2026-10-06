import java.util.Scanner; 
public class Signo {



		public static void main(String[] args) { 
		Scanner ler = new Scanner (System.in); 
		int mes, dia; 
		
		System.out.println("Informe seu mes de nascimento"); 
		
		mes = ler.nextInt(); 
		
		System.out.println("informe seu dia de nascimento"); 
		
		dia = ler.nextInt(); 
		
		switch (mes) { 
		
		case 4:  
		
		if(dia<=20) { 
		
		System.out.println("aries"); 
		
		} 
		
		else { 
		
		System.out.println("touro"); 
		
		} 
		
		break; 
		
		case 5:  
		
		if(dia<=20) { 
		
		System.out.println("touro"); 
		
		} 
		
		else { 
		
		System.out.println("gemeos"); 
		
		} 
		
		break; 
		
		case 6:  
		
		if(dia<=20) { 
		
		System.out.println("gemeos"); 
		
		} 
		
		else { 
		
		System.out.println("cancer"); 
		
		} 
		
		break; 
		
		case 7:  
		
		if(dia<=20) { 
		
		System.out.println("cancer"); 
		
		} 
		
		else { 
		
		System.out.println("leao"); 
		
		} 
		
		break; 
		
		case 8:  
		
		if(dia<=20) { 
		
		System.out.println("leao"); 
		
		} 
		
		else { 
		
		System.out.println("virgem"); 
		
		} 
		
		break; 
		
		case 9:  
		
		if(dia<=20) { 
		
		System.out.println("virgem"); 
		
		} 
		
		else { 
		
		System.out.println("libra"); 
		
		} 
		
		break; 
		
		case 10:  
		
		if(dia<=20) { 
		
		System.out.println("libra"); 
		
		} 
		
		else { 
		
		System.out.println("escorpiao"); 
		
		} 
		
		break; 
		
		case 11:  
		
		if(dia<=20) { 
		
		System.out.println("escorpiao"); 
		
		} 
		
		else { 
		
		System.out.println("sagitario"); 
		
		} 
		
		break; 
		
		case 12:  
		
		if(dia<=20) { 
		
		System.out.println("sagitario"); 
		
		} 
		
		else { 
		
		System.out.println("capricornio"); 
		
		} 
		
		break; 
		
		case 1:  
		
		if(dia<=20) { 
		
		System.out.println("capricornio"); 
		
		} 
		
		else { 
		
		System.out.println("aquario"); 
		
		} 
		
		break; 
		
		case 2:  
		
		if(dia<=20) { 
		
		System.out.println("aquario"); 
		
		} 
		else { 
		System.out.println("peixes"); 
		} 
		break; 
		
		case 3:  
		if(dia<=20) { 
		System.out.println("peixes"); 
		} 
		else { 
		System.out.println("aries"); 
		} 
		break; 
		default:  
		System.out.println("so existem 12 meses e signos"); 
		
		 
} 

 

} 

 

} 
