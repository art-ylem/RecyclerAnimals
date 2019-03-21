package com.example.recycleranimals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "";
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<GeneralAnimals> generalAnimals = new ArrayList<>();

        generalAnimals.add(new Tiger());
        generalAnimals.add(new Elephant());
        generalAnimals.add(new Butterfly());
        generalAnimals.add(new Butterfly());
        generalAnimals.add(new Butterfly());
        generalAnimals.add(new Wolf());
        generalAnimals.add(new Elephant());
        generalAnimals.add(new Wolf());
        generalAnimals.add(new Butterfly());
        generalAnimals.add(new Wolf());
        generalAnimals.add(new Wolf());
        generalAnimals.add(new Tiger());
        generalAnimals.add(new Wolf());

        recyclerView = findViewById(R.id.main_recycler);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(generalAnimals, this);
        recyclerView.setAdapter(recyclerViewAdapter);


//        Tiger tiger = new Tiger();
//        Tiger tiger2 = new Tiger();
//        Tiger tiger3 = tiger;
//        String str = "myString";
//        int i = 6;
//        method1(tiger, str, i);
//        Log.e(TAG, tiger.name());
//        Log.e(TAG, str);
//        Log.e(TAG, String.valueOf(i));
//
//        if(tiger == tiger2){
//
//        }

//        == ссылка
//        equals значение


//        HashMap<String, String> stringStringHashMap = new HashMap<>();
//        stringStringHashMap.put("1", "one");
//        stringStringHashMap.put("Animal", "tiger");
//        String animal = stringStringHashMap.get("Animal");
//
//        HashSet<String> strings = new HashSet<>();
//        strings.add("first");
//        strings.add("second");
//        strings.add("first");
//
//        Runable[] runables = {new Tiger(), new Wolf()};
//
//        for (int j = 0; j < runables.length; j++){
//            Runable runable = runables[j];
//            runable.run();
//        }
//
//
//
//
//
//
    }
//
//    public void method1(Tiger tiger, String string, int integ){
//        tiger.setName("wolf");
//        integ = 1;
//        string = "noString";
//        Log.e(TAG, tiger.name());
//        Log.e(TAG, string);
//        Log.e(TAG, String.valueOf(integ));
//    }
}
