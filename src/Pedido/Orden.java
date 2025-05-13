/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

/**
 *
 * @author marti
 */
public class Orden {
     private int huevos; 
    private double chorizo; 

    public Orden(int Huevos, double Chorizo) {
        this.huevos = Huevos * 12;
        this.chorizo = Chorizo;
    }
    public int getHuevos() {
        return huevos;
    }
    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }
    public double getChorizo() {
        return chorizo;
    }
    public void setChorizo(double chorizo) {
        this.chorizo = chorizo;
    }
    public void addHuevos(int Huevosss){
        huevos = huevos + Huevosss;
    }
    public void addChorizo(double chorizosss){
        chorizo = chorizo + chorizosss;
    }
    public double getNumPlatos(){
        //24 platos
        int actualH = ((huevos*12)/2);
        //20 platos
        double actualC = chorizo/.2;
        double total=0;
        
        if(actualH<actualC){
            total = actualH;
        }else{
            total = actualC;
        }
        return total;
    }
    
}
