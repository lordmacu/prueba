package com.diego;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.diego.helpers.ProcessProducts;
import com.diego.models.Product;

public class MainActivity extends AppCompatActivity {
    private ProcessProducts mProcessProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProcessProducts=new ProcessProducts();
        mProcessProducts.addProducts();
        mProcessProducts.showProducts();
    }


}
