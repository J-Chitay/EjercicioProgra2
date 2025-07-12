/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto;


public class Main {

 
    public static void main(String[] args) {
        Producto p1 = new Producto(001, "Coca Cola", 16.5);
        
        System.out.println(p1.getCodigo());
        System.out.println(p1.getNombre());
        System.out.println(p1.getPrecio());
    }
    
}
