package com.example.recyclerview_demo_day2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

public class ProductDetailsactivity extends AppCompatActivity {
ImageView imgView;
TextView txtTitle1,txtPrice1;
int pId,pImage;
String pTitle,pPrice;
Product product;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details_activity);

    }

    private void initViews(){
    imgView=findViewById(R.id.imgView);
    txtTitle1=findViewById(R.id.txtTitle1);
    txtPrice1=findViewById(R.id.txtPrice1);
    }

    private void extractDataAndBindingWithViews(){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        // way1
        pId = intent.getIntExtra("productId",10);
        pImage = intent.getIntExtra("productImage",-1);
        pPrice=intent.getStringExtra("productPrice");
        pTitle=intent.getStringExtra("productTitle");
        imgView.setImageResource(pImage);
        txtTitle1.setText(pTitle);
        txtPrice1.setText(pPrice);

        //way2 - sending and receiving the product object

//        product=(Product) intent.getSerializableExtra("product");
//        imgView.setImageResource(product.productImage);
//        txtTitle1.setText(product.productTitle);
//        txtTitle1.setText(product.productPrice);
}
}
