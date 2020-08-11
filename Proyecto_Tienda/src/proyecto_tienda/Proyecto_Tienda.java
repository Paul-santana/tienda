/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_tienda;

import java.util.Scanner;

/**
 *
 * @author PC-Admin
 */
public class Proyecto_Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto pro = new Producto();
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese codigo:");
        int codigo = in.nextInt();
        pro.setCodigo(codigo);
        System.out.println("Ingrese descripcion:");
        String descripcion = in.next();
        pro.setDescripcion(descripcion);
        System.out.println("Ingrese precio:");
        double precio = in.nextDouble();
        pro.setPrecio(precio);
        System.out.println("Ingrese Iva:");
        double IVA = in.nextDouble();
        pro.setIVA(IVA);
        System.out.println("Ingrese Fecha de creacion:");
        String fechacreacion = in.next();
        pro.setFechacreacion(fechacreacion);
        pro.Consultar();
    }
    
}
