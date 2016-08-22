package com.example.ubun17.schedule;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Before JobInfo", "in onCreate");


        JobInfo job = new JobInfo.Builder(12321,
                new ComponentName(getPackageName(),
                        MyJobService.class.getName()))
                .setPeriodic(3_000) //This ensures our job runs every 5 seconds.
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
                .build();

        JobScheduler jobScheduler =
                (JobScheduler) getSystemService(JOB_SCHEDULER_SERVICE);

        jobScheduler.schedule(job);

        JobInfo jobTwo = new JobInfo.Builder(2323,
                new ComponentName(getPackageName(),
                        MyJobServiceTwo.class.getName()))
                .setPeriodic(4000)
                .setRequiresCharging(true)
                .build();

        jobScheduler.schedule(jobTwo);

    }
}
