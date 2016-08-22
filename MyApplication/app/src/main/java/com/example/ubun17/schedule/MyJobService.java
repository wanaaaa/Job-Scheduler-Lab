package com.example.ubun17.schedule;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by ubun17 on 8/13/16.
 */
public class MyJobService extends JobService {


    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("This is", "onStratJob//////////////////");
        //Toast.makeText(MainActivity.get, "asfasdfasdf", Toast.LENGTH_LONG).show();
        Toast.makeText( getApplicationContext(),
                "JobService task running", Toast.LENGTH_SHORT )
                .show();
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
