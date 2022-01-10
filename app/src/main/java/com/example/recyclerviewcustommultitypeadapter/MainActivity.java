package com.example.recyclerviewcustommultitypeadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recyclerviewcustommultitypeadapter.adapter.CustomAdapter;
import com.example.recyclerviewcustommultitypeadapter.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void refreshAdapter(List<Member> members){
        CustomAdapter adapter = new CustomAdapter(context,members);
        recyclerView.setAdapter(adapter);
    }

    private List<Member> prepareMemberList(){
        List<Member> members = new ArrayList<>();
        for (int i = 1; i<20; i++) {
            if (i == 0 || i == 5) {
                members.add(new Member("Rahmatullayev" + i, "Tohir" + i, false));
            } else {
                members.add(new Member("Rahmatullayev" + i, "Tohir" + i, false));
            }
        }
        return members;
    }
}