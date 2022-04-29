import java.util.Scanner;


public class App {
   
    public static void main(String[] args) throws Exception {   
     
        int opcao = 1;

        while(opcao != 0){
              opcao = Menu();
              switch(opcao){
              case 0:
                System.out.println("Tchau, até mais");
                System.out.println("=====================================");
                break;
               case 1:

               break;

               case 2:
                    
               break;

               case 3:
                    
               break;

               case 4:
                    
               break;

               case 5:
                    
               break;

               default:
            
               System.out.println("Opção Inválida");
               
                             }
                         }
                     }
    public static int Menu(){
        Scanner entrada =  new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("1 - Mostre a matriz Original");
        System.out.println("2 - Mostre a matriz transposta");
        System.out.println("3 - Mostre a soma da diaogonal principal da matriz ");
        System.out.println("4 - Mostre os números pares da matriz");
        System.out.println("5 - Mostre os números ímpares da matriz");
        System.out.println("0 - Sair do sistema");
        System.out.println("=====================================");
        System.out.print("Digite uma das opções acima: ");
        int escolha = entrada.nextInt();
        System.out.println("=====================================");
       
        if(escolha == 0){
            entrada.close();
        }
        return escolha;
        
    }
    
}


