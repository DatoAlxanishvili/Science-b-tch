package assign2.alkhanishvili.davit.breakingbad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bluejamesbond.text.BuildConfig;
import com.bluejamesbond.text.DocumentView;

import it.sephiroth.android.library.picasso.Picasso;

public class HeroDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_description);
        Hero hero= (Hero) getIntent().getExtras().getSerializable("char");
        Picasso.with(this).load(hero.getImage()).into((ImageView) findViewById(R.id.avatar));
        ((TextView) findViewById(R.id.nick)).setText(hero.getName() + " " + hero.getSurname());
        ((DocumentView) findViewById(R.id.description)).setText(hero.getDescription());

    }
}
