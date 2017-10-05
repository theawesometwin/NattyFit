package nattyfit.nattyfit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage_main);
        Button nutrition_activity = (Button) findViewById(R.id.button1);
        Button activity_workout_tracking = (Button) findViewById(R.id.button2);
        Button activity_water_intake = (Button) findViewById(R.id.button3);
        Button activity_stay_connected = (Button) findViewById(R.id.button4);
        Button activity_workout_videos = (Button) findViewById(R.id.button5);
        nutrition_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NutritionActivity.class);
                startActivity(i);
            }
        });
        activity_workout_tracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WorkoutTracking.class);
                startActivity(i);
            }
        });
        activity_water_intake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WaterIntake.class);
                startActivity(i);
            }
        });
        activity_stay_connected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), StayConnected.class);
                startActivity(i);
            }
        });
        activity_workout_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WorkoutVideos.class);
                startActivity(i);
            }
        });
    }
}