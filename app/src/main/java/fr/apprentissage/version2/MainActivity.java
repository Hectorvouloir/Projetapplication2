package fr.apprentissage.version2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import fr.apprentissage.version2.R;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        happy.toString();


        List<String> lst1 = new ArrayList<>();
        lst1.add("Hello");
        lst1.add("World");
        List<String> lst2 = new ArrayList<>();
        List<String> lst3 = new ArrayList<>();

        Map<List<String>, String> testMap4 = new HashMap<List<String>, String>();
        testMap4.put(lst1, "Def1");
        testMap4.put(lst2, "Def2");
        testMap4.put(lst3, "Def5");

        List<String> lst4 = new ArrayList<>();
        lst4.add("bonjour");
        lst4.add("toi");
        testMap4.replace(lst4, "Def1");

        TextView textView;
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(testMap4.toString());

        EditText editTextName;
        Button btnClickHere;
        TextView textName;

        editTextName = (EditText) findViewById(R.id.editTextName);
        btnClickHere = (Button) findViewById(R.id.btnClickHere);
        textName = (TextView) findViewById(R.id.itexti);

        btnClickHere.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                textName.setText(name);
            }
        });

        //TextView textView2;
        //textView2=(TextView)findViewById(R.id.textView2);
        //textView2.setText(textName.toString());

        /*public Set keySet():retourne un ensemble de clés
         * dans cette map. Cet ensemble est retourné par le map
         * donc, un chagement dans le map est reflété dans l'ensemble
         * et vice-vers-ça
         *
         */
        Set keys = testMap4.keySet();

        //obtenir un iterator des clés
        Iterator<List<String>> itr = keys.iterator();

        List<String> key;
        //affichage des pairs clé-valeur


        while (itr.hasNext()) {
            // obtenir la clé
            key = itr.next();
            if (key.contains(textName.toString())) {
                Toast.makeText(getApplicationContext(), "Key: " + key + " & Value: " + testMap4.get(key), Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(getApplicationContext(), "pas trouvé", Toast.LENGTH_SHORT).show();
            }

        }
        Button Testons;
        Testons = (Button) findViewById(R.id.Testons);
        Testons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Set keys = testMap4.keySet();
                Iterator<List<String>> itr = keys.iterator();
                List<String> key;

                while (itr.hasNext()) {

                    Toast.makeText(getApplicationContext(), textName.toString(), Toast.LENGTH_SHORT).show();
                    key = itr.next();
                    if (key.contains(textName.toString())) {
                        Toast.makeText(getApplicationContext(), "Key: " + key + " & Value: " + testMap4.get(key), Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "pas trouvé", Toast.LENGTH_SHORT).show();
                    }

                }

                }
            });
        //SUITE
    }
}


