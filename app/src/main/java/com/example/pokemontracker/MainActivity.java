package com.example.pokemontracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    TextView appName, regisCatch, nationalNumber, name, species, gender, height, weight,
            level, hp, attack, defence;

    EditText et_nationalNumber, et_name, et_species, et_height, et_weight,
            et_hp, et_attack, et_defence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); appName = requireViewById(R.id.AppName);
        regisCatch = requireViewById(R.id.newCatch);

        // editText headers
        nationalNumber = requireViewById(R.id.natNumber);
        name = requireViewById(R.id.pokeName);
        species = requireViewById(R.id.speciesCat);
        gender = requireViewById(R.id.pokeGender);
        height = requireViewById(R.id.pokeHeight);
        weight = requireViewById(R.id.pokeWeight);
        level = requireViewById(R.id.pokeLevel);
        hp = requireViewById(R.id.pokeHP);
        attack = requireViewById(R.id.pokeAttack);
        defence = requireViewById(R.id.pokeDefence);

        //editText IDs
        et_nationalNumber = requireViewById(R.id.et_natNumber);
        et_name = requireViewById(R.id.et_pokeName);
        et_species = requireViewById(R.id.et_speciesCat);
        et_height = requireViewById(R.id.et_pokeHeight);
        et_weight = requireViewById(R.id.et_pokeWeight);
        et_hp = requireViewById(R.id.et_pokeHP);
        et_attack = requireViewById(R.id.et_pokeAttack);
        et_defence = requireViewById(R.id.et_pokeDefence);


        //Radio and Click-able Buttons
    }
}