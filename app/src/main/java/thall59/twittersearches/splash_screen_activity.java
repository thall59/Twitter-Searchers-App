package thall59.twittersearches;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Tifa- on 11/9/2016.
 */
public class splash_screen_activity extends Activity{

    // Dictates how long the splash screen appears for
    protected static final long timeout = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);

        Thread timer = new Thread() {

            public void run() {

                try {

                    sleep(timeout);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                } finally {

                    Intent openNextActivity = new Intent(".TwitterSearches");
                    startActivity(openNextActivity);
                }
            } // End run method
        }; // End Thread definition

        timer.start();
    } // End onCreate method

    @Override
    protected void onPause() {

        super.onPause();

        finish();
    } // End onPause method
}
