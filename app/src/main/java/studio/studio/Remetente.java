package studio.studio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Remetente extends ActionBarActivity {

    private EditText remetente;

    public static final String PESSOA = "pessoa";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remetente);

        remetente = (EditText)findViewById(R.id.remetente);
    }

    public void enviar(View v){

        String nome = remetente.getText().toString();
        int idade = 15;

        /*OBJETO PESSOA SERIALIZÁVEL*/
        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setIdade(idade);

        Intent i = new Intent(this,Destinatario.class);
        i.putExtra("pessoa",p);

        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_remetente, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
