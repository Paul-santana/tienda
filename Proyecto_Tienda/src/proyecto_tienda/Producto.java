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
public class Producto {
    protected int codigo;
    protected String descripcion;
    protected double precio;
    protected double IVA;
    protected String fechacreacion;
    protected double precioventa;
    Producto (){}
    Producto(int codigo,String descripcion,double precio,double IVA,String fechacreacion,double precioventa){
        this.setCodigo(codigo);
        this.setDescripcion(descripcion);
        this.setPrecio(precio);
        this.setIVA(IVA);
        this.setFechacreacion(fechacreacion);
        this.setPrecioventa(precioventa);
  
    }
    
    public void Consultar(){
        System.out.println("El código es:" +this.getCodigo());
        System.out.println("El producto es:" +this.getDescripcion());
        System.out.println("La Fecha de Creacion es:" +this.getFechacreacion());
        System.out.println("El precio sin iva es:" +this.getPrecio());
        System.out.println("El IVA es:" +this.getIVA());
        System.out.println("El precio de venta es:" +this.VENTA(precio, IVA));
    }
    public void Modificar(){
        Scanner mod = new Scanner(System.in);
        System.out.println("Ingrese descripcion:");
        descripcion = mod.nextLine();
        this.setDescripcion(descripcion);
        System.out.println("Ingrese precio:");
        precio = mod.nextDouble();
        this.setDescripcion(descripcion);
        System.out.println("Ingrese IVA:");
        IVA = mod.nextDouble();
        this.setDescripcion(descripcion);
        System.out.println("Ingrese Fecha de Creacion:");
        fechacreacion = mod.nextLine();
        this.setFechacreacion(fechacreacion);
        
    }
    
    public double VENTA (double precio, double IVA){
        precioventa= precio + (precio*IVA/100);
        this.setPrecioventa(precioventa);
        return this.getPrecioventa();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }
    


}

