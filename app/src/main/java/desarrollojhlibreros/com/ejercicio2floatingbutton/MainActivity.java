package desarrollojhlibreros.com.ejercicio2floatingbutton;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final TextView bienvenida=(TextView)findViewById(R.id.textBienvenida);

        fabicon = (FloatingActionButton) findViewById(R.id.fab);
        fabicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bienvenida.setText("Programacion mobile");
                Toast.makeText(MainActivity.this, "Un boton en la pantalla D: !",
                        Toast.LENGTH_LONG).show();
                fabicon.setX(50);
                fabicon.setY(300);
                fabicon.setImageResource(R.drawable.android_ico);
                fabicon.refreshDrawableState();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
