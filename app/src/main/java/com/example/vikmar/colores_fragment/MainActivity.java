package com.example.vikmar.colores_fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements FragmentNegro.OnFragmentInteractionListener,
        FragmentVerde.OnFragmentInteractionListener, FragmentVinotinto.OnFragmentInteractionListener, FragmentNaranja.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();


        switch (item.getItemId()) {
            case R.id.naranja:
                Fragment currentFragment = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentNaranja fragment = new FragmentNaranja();
                if(currentFragment == null) {
                    transaction.add(R.id.activity_main, fragment);
                }else{
                    transaction.replace(R.id.activity_main, fragment);}
                transaction.commit();
                return true;
            case R.id.negro:
                Fragment currentFragment1 = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentNegro fragment1 = new FragmentNegro();
                if(currentFragment1 == null) {
                    transaction.add(R.id.activity_main, fragment1);
                }else{
                    transaction.replace(R.id.activity_main, fragment1);}
                transaction.commit();
                return true;
            case R.id.vinotinto:
                Fragment currentFragment2 = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentVinotinto fragment2 = new FragmentVinotinto();
                if(currentFragment2 == null) {
                    transaction.add(R.id.activity_main, fragment2);
                }else{
                    transaction.replace(R.id.activity_main, fragment2);}
                transaction.commit();
                return true;

            case R.id.verde:
                Fragment currentFragment3 = getFragmentManager().findFragmentById(R.id.activity_main);
                FragmentVerde fragment3 = new FragmentVerde();
                if(currentFragment3 == null) {
                    transaction.add(R.id.activity_main, fragment3);
                }else{
                    transaction.replace(R.id.activity_main, fragment3);}
                transaction.commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void onFragmentInteraction(Uri uri) {

    }
}
