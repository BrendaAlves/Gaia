package www.gaiaservices.ga.gaia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivitySobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }
    public void LinkSiteClick(View v) {
        Intent site = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://www.gaiaservices.ga");
        site.setData(uri);
        startActivity(site);
    }
    public void ActivitySobreClick(View v) {
        //retorna para tela incial
        Intent it = new Intent(ActivitySobre.this, MainActivity.class);
        startActivity(it);
    }
}