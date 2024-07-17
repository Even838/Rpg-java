package anka.exe;
import java.util.Scanner;

public class main {

  public static void main(String[] args) {
   
   System.out.println("༶•┈┈⛧┈♛♛┈⛧┈┈•༶");
   System.out.println("    O REI ");
  System.out.println("༶•┈┈⛧┈♛♛┈⛧┈┈•༶");
  
  
  System.out.println();
  
   System.out.println("Escolha uma classe:");
        Scanner scanner = new Scanner(System.in);
        String clss = scanner.nextLine();

        System.out.println("Sua classe: " + clss);
        System.out.println("Nome do inimigo: Anka");
        

        System.out.println("");

        System.out.println("Escolha um ataque:");
        System.out.println("1 - Bola de fogo");
        System.out.println("2 - Magia");
        System.out.println(" 3- recuperar vida ");
        System.out.println();

        byte vidai = 50;
        byte vida = 10;
        int xp = 100;
        
        
       
        
        while (vidai > 0) {
            int atq = scanner.nextInt();

            if (atq == 1) {
                vidai -= 12;
                vida-=2;
            } else if (atq == 2) {
                vidai -= 15;
            vida-=3;
            } else {
                System.out.println("");
            }
             
           
            if(vidai >0){
            System.out.println("Vida do inimigo: " + vidai);
            }
            System.out.println();
            System.out.println(" sua vida " +vida);
        }
    
   
        System.out.println("Inimigo derr tado! Parabéns!");
        
    System.out.println();
    
      System.out.println("--------------------");

System.out.println(" anka:eu vou voltar! ");
 System.out.println("--------------------");    
 
      
  }
  
 
  public void mapa(){
    
    String Reino = "the zone";
    
    System.out.println("reino atual"+ Reino);
    
  }
  
  public void paçoca (){
    
    System.out.println(" inimigo| paçoca");
    
    
  }
  
}

