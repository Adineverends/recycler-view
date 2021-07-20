package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view= findViewById(R.id.recyclerview);
       view.setLayoutManager(new LinearLayoutManager(this));
       String [] name={"adi","shyam","ram","shivam","shiv","shankar","hanuman","lala","shubham","oshu","vishnnu","bholu","prashant","arvind","sweety"};
       view.setAdapter(new adapter(name));
    }
}