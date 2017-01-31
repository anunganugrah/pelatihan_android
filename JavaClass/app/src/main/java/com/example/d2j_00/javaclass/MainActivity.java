package com.example.d2j_00.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public barang[] arrbarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);

        showString =" Manipulasi Java Android";
        addSeparator();


        initbarang();
        showString += arrbarang[5].toString();
        addSeparator();
        showString += arrbarang[1].toString();
        showText.setText(showString);
    }
    public void addSeparator(){
        showString +="\n-----------------------\n";
    }

    public  void initbarang(){
        arrbarang[0] = new barang("Leptop", 1, 7000000);
        arrbarang[1] = new barang("Printer",barang.ELEKTRONIK, 2500000);
        arrbarang[2] = new barang("Monitor",barang.ELEKTRONIK, 1500000);
        arrbarang[3] = new barang("Scanner",barang.ELEKTRONIK, 1000000);
        arrbarang[4] = new barang("Meja",barang.NEW_EKTRONIK, 1500000);
        arrbarang[5] = new barang("Kursi",barang.NEW_EKTRONIK, 2500000);
        arrbarang[6] = new barang("Lemari",barang.NEW_EKTRONIK, 4500000);
        arrbarang[7] = new barang("Megaphone",barang.ELEKTRONIK, 1500000);
        arrbarang[8] = new barang("Tikar",barang.NEW_EKTRONIK, 150000);
        arrbarang[9] = new barang("Sound system",barang.ELEKTRONIK, 2200000);




    }
}
