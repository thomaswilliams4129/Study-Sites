package edu.floridapoly.studysites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {



    ListAdapter listAdapter;

    String [] locationNames = {"Location 1", "Location 2", "Location 3"};

    String [] types = {"Coffee Shop", "Coffee Shop", "Coffee Shop"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        /** Search Bar **/

        final SearchView searchBar = findViewById(R.id.searchBar);


        searchBar.setOnClickListener(new View.OnClickListener() {

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "Search for Locations", duration);
                toast.show();
            }
        });


        /*** List View for saved locations ***/
        ListView savedLocationList = findViewById(R.id.savedSitesList);

        listAdapter = new ListAdapter(HomeScreen.this, locationNames, types);

        savedLocationList.setAdapter(listAdapter);

        savedLocationList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(context, "Open Location in Default Maps", duration);
                toast.show();
            }
        });


        /*** List View for suggested locations ***/
        ListView suggestedList = findViewById(R.id.suggestedList);

        listAdapter = new ListAdapter(HomeScreen.this, locationNames, types);

        suggestedList.setAdapter(listAdapter);

        suggestedList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(context, "Open Location in Default Maps", duration);
                toast.show();
            }
        });


        /*** Add Location Button ***/
        Button addLocationBtn = findViewById(R.id.addLocation);

        addLocationBtn.setOnClickListener(new View.OnClickListener() {

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "Add a Location", duration);
                toast.show();
            }
        });

    }
}
