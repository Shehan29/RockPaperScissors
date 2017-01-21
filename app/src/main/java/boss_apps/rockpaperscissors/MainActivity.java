package boss_apps.rockpaperscissors;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.Math;



public class MainActivity extends AppCompatActivity {
    TextView cpuChoice;
    TextView outcomeText;
    int humanWeapon;
    int cpuWeapon;
    int outcome;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




            cpuChoice = (TextView) findViewById(R.id.cpuChoice);
            outcomeText = (TextView) findViewById(R.id.outcomeText);


            Button rockBtn = (Button) findViewById(R.id.rockBtn);
            rockBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view) {
                    humanWeapon = 1;
                    cpuWeapon = 1 + (int) (Math.random() * 3);
                    if (cpuWeapon == 1)
                    {
                        cpuChoice.setText("ROCK");
                    }
                    if (cpuWeapon == 2)
                    {
                        cpuChoice.setText("PAPER");
                    }
                    if (cpuWeapon == 3)
                    {
                        cpuChoice.setText("SCISSORS");
                    }

                    if (humanWeapon == 1)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = 1;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = -1;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = 0;
                        }
                    }
                    if (humanWeapon == 2)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = -1;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = 0;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = 1;
                        }
                    }
                    if (humanWeapon == 3)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = 0;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = 1;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = -1;
                        }
                    }
                    if (outcome == -1)
                    {
                        outcomeText.setText("YOU LOSE");
                    }
                    if (outcome == 0)
                    {
                        outcomeText.setText("TIE");
                    }
                    if (outcome == 1)
                    {
                        outcomeText.setText("YOU WIN");
                    }
                }

            });
            Button paperBtn = (Button) findViewById(R.id.paperBtn);
            paperBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    humanWeapon = 2;
                    cpuWeapon = 1 + (int) (Math.random() * 3);
                    if (cpuWeapon == 1)
                    {
                        cpuChoice.setText("ROCK");
                    }
                    if (cpuWeapon == 2)
                    {
                        cpuChoice.setText("PAPER");
                    }
                    if (cpuWeapon == 3)
                    {
                        cpuChoice.setText("SCISSORS");
                    }

                    if (humanWeapon == 1)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = 1;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = -1;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = 0;
                        }
                    }
                    if (humanWeapon == 2)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = -1;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = 0;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = 1;
                        }
                    }
                    if (humanWeapon == 3)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = 0;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = 1;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = -1;
                        }
                    }
                    if (outcome == -1)
                    {
                        outcomeText.setText("YOU LOSE");
                    }
                    if (outcome == 0)
                    {
                        outcomeText.setText("TIE");
                    }
                    if (outcome == 1)
                    {
                        outcomeText.setText("YOU WIN");
                    }
                }

            });
            Button scissorBtn = (Button) findViewById(R.id.scissorBtn);
            scissorBtn.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    humanWeapon = 3;
                    cpuWeapon = 1 + (int) (Math.random() * 3);
                    if (cpuWeapon == 1)
                    {
                        cpuChoice.setText("ROCK");
                    }
                    if (cpuWeapon == 2)
                    {
                        cpuChoice.setText("PAPER");
                    }
                    if (cpuWeapon == 3)
                    {
                        cpuChoice.setText("SCISSORS");
                    }

                    if (humanWeapon == 1)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = 1;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = -1;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = 0;
                        }
                    }
                    if (humanWeapon == 2)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = -1;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = 0;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = 1;
                        }
                    }
                    if (humanWeapon == 3)
                    {
                        if (cpuWeapon == 3)
                        {
                            outcome = 0;
                        }
                        if (cpuWeapon == 2)
                        {
                            outcome = 1;
                        }
                        if (cpuWeapon == 1)
                        {
                            outcome = -1;
                        }
                    }
                    if (outcome == -1)
                    {
                        outcomeText.setText("YOU LOSE");
                    }
                    if (outcome == 0)
                    {
                        outcomeText.setText("TIE");
                    }
                    if (outcome == 1)
                    {
                        outcomeText.setText("YOU WIN");
                    }
                }

            });



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://boss_apps.rockpaperscissors/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://boss_apps.rockpaperscissors/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

