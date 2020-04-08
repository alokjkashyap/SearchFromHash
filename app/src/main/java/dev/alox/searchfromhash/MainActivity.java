package dev.alox.searchfromhash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dev.alox.searchforfirebase.SearchFirestore;

public class MainActivity extends AppCompatActivity {

    private EditText Field;
    private Button SearchBtn;
    private Adapter mAdapter;
    private RecyclerView mRecyclerView;

    private HashMap<String,String> search;
    List<String> filtered;
    public static List<String> queryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Field = findViewById(R.id.editText);
        SearchBtn = findViewById(R.id.button);
        mRecyclerView = findViewById(R.id.RecyclerView);

        search = new HashMap<>();
        filtered = new ArrayList<>();
        queryList = new ArrayList<>();


        search.put("Engineering Physics", "EP");
        search.put("Engineering Mechanics", "EM");
        search.put("Fundamentals of Civil", "FCE");
        search.put("Fundamentals of Mech", "FME");

        SearchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String query = Field.getText().toString().toUpperCase();
                filtered.clear();
                filtered = SearchFirestore.getField(search,query);

                mAdapter = new Adapter(filtered);
                mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                mRecyclerView.setAdapter(mAdapter);





            }
        });


    }


}
