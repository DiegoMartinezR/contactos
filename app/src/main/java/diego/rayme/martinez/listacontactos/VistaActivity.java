package diego.rayme.martinez.listacontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.luseen.autolinklibrary.AutoLinkMode;
import com.luseen.autolinklibrary.AutoLinkOnClickListener;
import com.luseen.autolinklibrary.AutoLinkTextView;

public class VistaActivity extends AppCompatActivity {


    AutoLinkTextView autoLinkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);

        autoLinkTextView = (AutoLinkTextView)findViewById(R.id.text2);
        autoLinkTextView = (AutoLinkTextView)findViewById(R.id.text4);
        autoLinkTextView = (AutoLinkTextView)findViewById(R.id.text6);
        autoLinkTextView.addAutoLinkMode(AutoLinkMode.MODE_PHONE,
                                         AutoLinkMode.MODE_EMAIL,
                                         AutoLinkMode.MODE_URL);




    }
}
