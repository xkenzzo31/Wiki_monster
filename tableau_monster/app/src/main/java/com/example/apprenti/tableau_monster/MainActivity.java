package com.example.apprenti.tableau_monster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static void Monster(String[] args) {
        Monster FireLion = new Monster("FireLion",R.drawable.fire_lion_0,R.drawable.fire_lion_all, new Stats_monster(2480,100,875,100));
        Monster Rockilla = new Monster("Rockilla", R.drawable.rockilla_0,R.drawable.rockilla_all, new Stats_monster(3521,875,875,100));
        Monster Turtle = new Monster("Turtle", R.drawable.turtle_0, R.drawable.turtle_all, new Stats_monster(2777,1000,1000,100));
        Monster Panda = new Monster("Panda", R.drawable.panda_0,R.drawable.panda_all, new Stats_monster(2777,950,1000,100));
        Monster ThunderEagle = new Monster("Thunder Eagle", R.drawable.thunder_eagle_0,R.drawable.thunder_eagle_all, new Stats_monster(2480,875,1250,100));
        Monster LightSpirit = new Monster("Light Spirit", R.drawable.light_spirit_0,R.drawable.light_spirit_all, new Stats_monster(3521,875,875,100));
        Monster Tyrannoking = new Monster("Tyrannoking", R.drawable.tyrannoking_0,R.drawable.tyrannoking_all, new Stats_monster(2480,1175,875,100));
        Monster Genie = new Monster("Genie", R.drawable.genie_0,R.drawable.genie_all, new Stats_monster(2480,950,1250,100));
        Monster Firesaur = new Monster("Firesaur", R.drawable.firesaur_0,R.drawable.firesaur_all, new Stats_monster(2480,1375,875,100));
        Monster Mersnake = new Monster("Mersnake", R.drawable.mersnake_0,R.drawable.mersnake_all, new Stats_monster(2777,1125,1000,100));
        Monster Treezard = new Monster("Treezard", R.drawable.treezard_0,R.drawable.treezard_all, new Stats_monster(2777,1125,1000,100));
        Monster Metalsaur = new Monster("Metalsaur", R.drawable.metalsaur_0,R.drawable.metalsaur_all, new Stats_monster(2976,1120,1000,120));
    }
}
