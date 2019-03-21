package www.gaiaservices.ga.gaia;

import android.net.Uri;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CallMeClick(View v) {
        //intenção de telefonar
        Intent numero = new Intent(Intent.ACTION_DIAL);
        //passo o número de telefone para URI (similar a URL)
        Uri uri = Uri.parse("tel://03133335678");
        //uri = numero
        numero.setData(uri);
        //abre teclado do telefone com o número do telefone
        startActivity(numero);
    }

    public void LinkSiteClick(View v) {
        Intent site = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://www.gaiaservices.ga");
        site.setData(uri);
        startActivity(site);
    }

    public void LinkShareClick(View v) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Use o Gaia Services para ter acesso aos melhor estabelecimentos de beleza. " +
                "Com mecanismos de busca, encontre o melhor horário e localização do serviço desejado. " +
                "Acesse: http://www.gaiaservices.ga");
        share.setType("text/plain");
        startActivity(share);
    }

    public void ActivitySobreClick(View v) {
        //chama tela Sobre a empresa
        Intent it = new Intent(MainActivity.this, ActivitySobre.class);
        startActivity(it);
    }

    public void ActivityCadastroSalaoClick(View v) {
        //chama tela de Cadastro de Salão
        Intent site = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("http://www.gaiaservices.ga/WebContent/telaCadSalao.html");
        site.setData(uri);
        startActivity(site);
    }
    public void ActivityLoginClick(View v) {
        //chama tela de Login
        Intent it = new Intent(MainActivity.this, ActivityLogin.class);
        startActivity(it);
    }

}


