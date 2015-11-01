package assign2.alkhanishvili.davit.breakingbad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Hero> heroes = new ArrayList<>();
        for(int i = 0; i < Intel.names.length; i++){
            Hero newHero = new Hero(Intel.names[i], Intel.surnames[i], Intel.images[i],Intel.description[i]);
            heroes.add(newHero);
        }
        ListView listview = (ListView) findViewById(R.id.listView);
        BBAdapter adapter = new BBAdapter(this,heroes);
        listview.setAdapter(adapter);



    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent nextActivity=new Intent(MainActivity.this,HeroDescriptionActivity.class);
            Hero hero=(Hero) parent.getAdapter().getItem(position);
            nextActivity.putExtra("char",hero);
            startActivity(nextActivity);
        }
    });
    }






}
