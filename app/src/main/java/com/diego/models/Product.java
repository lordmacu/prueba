package com.diego.models;

/**
 * Created by camilo on 1/10/17.
 */

public class Product {

    private String mName="";
    private int mPrice=0;
    private int mSaleType=0;
    private SaleUnit mSaleUnit=null;
    private String mMeasureValue="";


    public int getmSaleType() {
        return mSaleType;
    }

    public SaleUnit getmSaleUnit() {
        return mSaleUnit;
    }

    public void setmSaleUnit(SaleUnit mSaleUnit) {
        this.mSaleUnit = mSaleUnit;
    }

    public void setmSaleType(int mSaleType) {
        this.mSaleType = mSaleType;
    }

    public String getMeasureValue() {
        return mMeasureValue;
    }

    public void setMeasureValue(String measureValue) {
        mMeasureValue = measureValue;
    }

    public Product(String mName, int mPrice, int mSaleType, String measureValue) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.setmSaleUnit(this.setSaleUnit(mSaleType));
        mMeasureValue = measureValue;
    }

    public Product(String mName, int mPrice, int mSaleType) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.setmSaleUnit(this.setSaleUnit(mSaleType));
    }

    public SaleUnit setSaleUnit(int type){
        SaleUnit SaleUnitModel= new SaleUnit();
        if(type==1){
            SaleUnitModel.setmName("Litros");
        }else if(type==2){
            SaleUnitModel.setmName("ml");
        }else if(type==3){
            SaleUnitModel.setmName("Kilo");
        }
        SaleUnitModel.setmType(type);
        this.setmSaleType(type);
        return SaleUnitModel;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "mName='" + mName + '\'' +
                ", mPrice=" + mPrice +
                ", mSaleType=" + mSaleType +
                ", mSaleUnit=" + mSaleUnit +
                ", mMeasureValue='" + mMeasureValue + '\'' +
                '}';
    }
}
