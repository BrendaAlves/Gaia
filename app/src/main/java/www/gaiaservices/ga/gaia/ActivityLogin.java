package www.gaiaservices.ga.gaia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LinkSiteClick(View v) {
        Intent site = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://www.gaiaservices.ga");
        site.setData(uri);
        startActivity(site);
    }

    public void MainActivity(View v) {
        //retorna para tela incial
        Intent it = new Intent(ActivityLogin.this, MainActivity.class);
        startActivity(it);
    }
}
