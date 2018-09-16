package diego.rayme.martinez.listacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void llamar1(View view){
        Intent i= new Intent(this,VistaActivity.class);
        startActivity(i);
    }

    public  void llamar2(View view){
        Intent b= new Intent(this,VistaActivity2.class);
        startActivity(b);
    }

    public  void llamar3(View view){
        Intent c= new Intent(this,VistaActivity3.class);
        startActivity(c);
    }





}
