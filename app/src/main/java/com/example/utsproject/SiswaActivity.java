package com.example.utsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SiswaActivity extends AppCompatActivity {

    private Button btOk;

    private EditText nisInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText hpInput;
    private EditText keteranganInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        btOk = (Button) findViewById(R.id.btnOk);
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });

        nisInput = findViewById(R.id.input_nis);
        namaInput = findViewById(R.id.input_name);
        alamatInput = findViewById(R.id.input_alamat);
        hpInput = findViewById(R.id.input_hp);
        keteranganInput = findViewById(R.id.input_keterangan);
    }

    private void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Data Siswa");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Nis : " + nisInput.getText().toString() + "\n"
                            + "Nama : " + namaInput.getText().toString() + "\n"
                            + "Alamat : " + alamatInput.getText().toString() + "\n"
                            + "Handphone : " + hpInput.getText().toString() + "\n"
                            + "Keterangan : " + keteranganInput.getText().toString() + "\n")
                .setCancelable(false)
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // do something
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
