/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhathread;

/**
 *
 * @author diego
 */
public class Minhathread extends Thread{

   private String nome;
   private int tempo;

    public Minhathread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
   @Override
    public void run(){
        try {
           for(int i=0;i<6;i++){
                System.out.println(nome+" contador: " +i);  
                Thread.sleep(tempo);
            }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        
       System.out.println(nome+" termiou a execução");
       
    }
}
