/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import Pedido.Orden;

/**
 *
 * @author marti
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               Orden lizbethOrden = new Orden(2,2);
       lizbethOrden.addHuevos(2);
       System.out.println(lizbethOrden.getHuevos());
       
       lizbethOrden.addChorizo(2);
       System.out.println(lizbethOrden.getChorizo());
    }
    
}
