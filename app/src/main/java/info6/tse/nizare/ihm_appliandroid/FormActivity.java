package info6.tse.nizare.ihm_appliandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    private Button buttonSave;
    private EditText editTextName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editTextName = findViewById(R.id.activity_main_editText_name);
        buttonSave = findViewById(R.id.activity_form_button_save);

        ((View) buttonSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }

    private void save(){
        String name = editTextName.getText().toString();
        editTextName.setText("");
        if(!name.isEmpty()){
            DataManager.getInstance().addName(name);
        }

        finish();
    }


}



/*
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

     */
