import java.util.Scanner;
public class Cantina {


 
    public static void main(String[] args) {
        Scanner xmen = new Scanner(System.in);
        int codigoP;
        System.out.println("Informe o codigo do produto");
        codigoP = xmen.nextInt();
        switch(codigoP) {
        case 1:
            System.out.println("O produto é um cachorro quente e o seu preço é 8,00R$");
            break;
        case 2:
            System.out.println("O produto é um chesseburguer e o seu preço é 12,00R$");
            break;
        case 3:
            System.out.println("O produto é x-salada e o seu preço é 15,00R$");
            break;
        case 4:
            System.out.println("O produto é misto quente e o seu preço é 11,00R$");
            break;
        case 5:
            System.out.println("O produto é pão na chapa e o seu preço é 6,00R$");
            break;
        default:
            System.out.println("o codigo do produto não identificado");}}}


