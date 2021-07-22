package aula.aulasp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "aula_sp";
    public static final String preference_nome = "pref_nome";

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor dados;

    int codigoProduto;
    String nomeProduto;
    String fornecedorProduto;
    Float precoProduto;
    boolean estoque;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: App rodando.");

        sharedPreferences = getSharedPreferences(preference_nome, Context.MODE_PRIVATE);

        Log.i(TAG, "onCreate: Pasta SharedPreferences criada.");

        dados = sharedPreferences.edit();
        codigoProduto = 123;
        nomeProduto = "Notebook Lenovo IdeaPad 128GB, 4GB RAM";
        fornecedorProduto = "Lenovo";
        precoProduto = 2399.90f;
        estoque = true;


        dados.putInt("intCodigo", codigoProduto);
        dados.putString("nomeProduto", nomeProduto);
        dados.putString("fornecedorProduto", fornecedorProduto);
        dados.putFloat("precoProduto", precoProduto);
        dados.putBoolean("estoque", estoque);

        Log.i(TAG, "onCreate: Dados para serem salvos: ");
        Log.i(TAG, "onCreate: Código do produto: "+ codigoProduto);
        Log.i(TAG, "onCreate: Nome: "+ nomeProduto);
        Log.i(TAG, "onCreate: Fornecedor: "+ fornecedorProduto);
        Log.i(TAG, "onCreate: Preço: "+ precoProduto);
        Log.i(TAG, "onCreate: O produto tem estoque? "+ estoque);

        dados.apply();
    }
}