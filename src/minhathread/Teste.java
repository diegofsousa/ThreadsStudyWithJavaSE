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
public class Teste {
    public static void main(String[] args) {
        Minhathread thread = new Minhathread("Thread #1", 600);
        Minhathread thread2 = new Minhathread("Thread #2", 900);
        Minhathread thread3 = new Minhathread("Thread #3", 500);
    }
}
