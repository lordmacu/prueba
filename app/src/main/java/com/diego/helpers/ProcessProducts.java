package com.diego.helpers;

import android.util.Log;

import com.diego.models.Product;

/**
 * Created by camilo on 1/10/17.
 */

public class ProcessProducts {
    private Product[] mProducts= new Product[4];
    private int maxPrice=0;
    private int minPrice=0;

    public void addProducts(){
        mProducts[0]=new Product("Coca-Cola Zero",20,1,"1.5");
        mProducts[1]=new Product("Coca-Cola",18,1,"1.5");
        mProducts[2]=new Product("Shampoo Sedal",19,2,"500");
        mProducts[3]=new Product("Frutillas",64,3);
    }
    public void showProducts(){
        Log.v("mostrando","aqui");

        for (int i = 0; i <mProducts.length ; i++) {
            if(mProducts[i].getmSaleType()==1){
                System.out.println("Nombre: "+mProducts[i].getmName()+" /// "+mProducts[i].getmSaleUnit().getmName()+": "+mProducts[i].getMeasureValue()+" /// "+" Precio: $"+mProducts[i].getmPrice());
            }else if(mProducts[i].getmSaleType()==2){
                System.out.println("Nombre: "+mProducts[i].getmName()+" /// "+" Contenido: "+mProducts[i].getMeasureValue()+mProducts[i].getmSaleUnit().getmName()+" /// "+" Precio: $"+mProducts[i].getmPrice());
            }else if(mProducts[i].getmSaleType()==3){
                System.out.println("Nombre: "+mProducts[i].getmName()+" /// "+"Precio: $"+mProducts[i].getmPrice()+" /// "+"Unidad de Venta :"+mProducts[i].getmSaleUnit().getmName());
            }
        }
        System.out.println("Producto más caro "+this.moreExpendiveProduct());
        System.out.println("Producto más barato "+this.lessExpendiveProduct());


    }

    public String lessExpendiveProduct(){
        int value=0;
        String nameProduct="";

        for (int i = 0; i < mProducts.length; i++) {
            if(value==0){
                value=mProducts[i].getmPrice();
                nameProduct=mProducts[i].getmName();
            }else{
                if(mProducts[i].getmPrice()<value){
                    value=mProducts[i].getmPrice();
                    nameProduct=mProducts[i].getmName();
                }
            }
        }

        return nameProduct;
    }


    public String moreExpendiveProduct(){
        int value=0;
        String nameProduct="";
        for (int i = 0; i < mProducts.length; i++) {
            if(value==0){
                value=mProducts[i].getmPrice();
                nameProduct=mProducts[i].getmName();
            }else{
                if(mProducts[i].getmPrice()>value){
                    value=mProducts[i].getmPrice();
                    nameProduct=mProducts[i].getmName();
                }
            }
        }
        return nameProduct;
    }

}
