/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.epsevg.prop.lab.c4;

/**
 *
 * @author icorn1
 */
public class Prova {
    public static void main(String[] args) {
        Tauler t = new Tauler(8);
        t.afegeix(1, -1);
        t.afegeix(7, +1);
        t.afegeix(1, -1);
        t.pintaTaulerALaConsola();
 
        
    }
}
/*
Fila
7  ->  0 0 0 0 0 0 0 0
6  ->  0 2 0 0 7 0 0 0
5  ->  0 0 0 0 0 0 0 0
4  ->  0 0 0-1 0 0 0 0
3  ->  0 0 0-1 0 0 0 01
2  ->  0 1 0-1 0 0 0 1
1  ->  0-1 0 1 0 0 0 0
0  -> -1-1 0 1 0 1 1 1

       0 1 2 3 4 5 6 7   Columna

*/
