package com.example.activity_class2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

private String salary;
private String time;
    private EditText edittext;
    private EditText edittext2;
    private Button button1;
    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        ArrayAdapter<employee> listAdapter = new ArrayAdapter<employee>(this, android.R.layout.simple_list_item_1, employee.class.getEnumConstants());
        listView.setAdapter(listAdapter);

        add();
    }
    private void add(){
        edittext=findViewById(R.id.name);
        edittext=findViewById(R.id.salary);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name=edittext.getText().toString();
               String salary=edittext2.getText().toString();
               String time= aSwitch.getText().toString();
               




            }
        });
    }
}