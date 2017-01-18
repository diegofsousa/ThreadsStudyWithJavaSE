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
public class TesteRunnableJoin {
    public static void main(String[] args) {
        RunnableJoin thread1 = new RunnableJoin("#1", 500);
        RunnableJoin thread2 = new RunnableJoin("#2", 200);
        RunnableJoin thread3 = new RunnableJoin("#3", 700);
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);
        
        t1.start();
        t2.start();
        t3.start();
        
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
        }
        
        System.out.println("Programa finalizado");
    }
}
