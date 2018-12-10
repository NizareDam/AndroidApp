package com.example.nizare.groupea;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextName;
    private Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        buttonNext = findViewById(R.id.activity_main_button_next);
        editTextName = findViewById(R.id.activity_form_editTextName);


    }
    private void next(){

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK && data.getExtras()!=null){
                Log.d("","");
            }
        }
        else {

        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.form_activity_back:
                Intent intent=new Intent(this,MainActivity.class);
                intent.putExtra("USERNAME",editTextName.toString());
                break;

        }
    }
}
