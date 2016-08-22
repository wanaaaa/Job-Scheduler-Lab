package com.example.ubun17.schedule;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by ubun17 on 8/22/16.
 */
public class MyJobServiceTwo extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("This is", "Service Two???????????????????");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
