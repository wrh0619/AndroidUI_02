package com.example.androidui_02;
import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.content.DialogInterface;
 import android.os.Bundle;
 import android.support.v7.app.AlertDialog;
 import android.support.v7.app.AppCompatActivity;
 import android.support.v7.widget.Toolbar;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.TableLayout;
 import android.widget.Toast;
 public class MainActivity extends AppCompatActivity {


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
         TableLayout tableLayout = (TableLayout) getLayoutInflater().inflate(R.layout.activity_main,null);
         new AlertDialog.Builder(this).setView(tableLayout).create().show();




     }
 }
