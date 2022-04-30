import java.util.Scanner;


public class App {
   
    public static void main(String[] args) throws Exception {   
     int[][] matriz = {{9,7,4,2,},{10,13,18,21},{33,5,7,90},{23,31,51,60}};
        int opcao = 1;


        // Scanner leia = new Scanner(System.in);
        // int[][] matriz = new int [4][4];
        // for (int i = 0; i < 4; i++){
        //     for (int j = 0; j< 4; j++){
        //         matriz[i][j] = leia.nextInt();
        //     }
        // }
        // leia.close();

        while(opcao != 0){
              opcao = Menu();
              switch(opcao){
              case 0:
                System.out.println("Tchau, até mais");
                System.out.println("=====================================");
                break;
               case 1:
                System.out.println("Matriz:");
                MostrarMatriz(matriz);
               break;

               case 2:
                System.out.println("Matriz Transposta:");
                MostrarMatriz(MatrizTransposta(matriz));
                    
               break;

               case 3:
                System.out.print("Soma da diaogonal principal: ");
                System.out.println(SomaDaDiagonalPrincipal(matriz));
                    
               break;

               case 4:
                System.out.print("Números pares da matriz: ");
                MostrarValoresParesDaMatriz(matriz);
                    
               break;

               case 5:
                System.out.println("Números ímpares da matriz");
                MostrarValoresImparesDaMatriz(matriz);
                    
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
    
    public static void MostrarMatriz(int [][] matriz){
       
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j]+"\t");

            }
            System.out.print("\n");
        }
      
    }

    public static int[][] MatrizTransposta (int [][] matriz) {
        int [][] matrizTransposta = new int[matriz[0].length] [matriz.length];
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
              matrizTransposta [i][j]= matriz[j][i];
            }

        }
        return matrizTransposta;
        
    }

    public static int SomaDaDiagonalPrincipal(int [][] matriz) {
        int somaDaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(i == j){
                    somaDaDiagonalPrincipal = somaDaDiagonalPrincipal + matriz[i][j] ;
                }
                
            }
        }
        return somaDaDiagonalPrincipal;
        
    }

    public static void MostrarValoresParesDaMatriz(int [][] matriz) {
       int listPares[] = new int [6] ;
       int index = 0;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
               if(matriz[i][j]%2 ==0){
                listPares[index] = matriz[i][j]; 
                index = index + 1;
               }

            }
         
        }
        
       for (int i = 0; i < listPares.length; i++) {
        System.out.print(listPares[i]+" ");
       }
       System.out.println("");
      
    }
    public static void MostrarValoresImparesDaMatriz(int [][] matriz) {
        int listImpares[] = new int [10] ;
        int index = 0;
         for (int i = 0; i < matriz.length; i++){
             for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j]%2 !=0 ){
                 listImpares[index] = matriz[i][j]; 
                 index = index + 1;
                }
 
             }
          
         }
         
        for (int i = 0; i < listImpares.length; i++) {
            System.out.print(listImpares[i]+" ");
        }
        System.out.println("");
     }
}