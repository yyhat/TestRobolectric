package com.hat.test;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;


/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk=21)
public class ExampleUnitTest {

    private MainActivity activity;

    @Before
    public void setup() throws Exception
    {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void testHelloWorld() throws Exception
    {
        TextView txtView = (TextView)activity.findViewById(R.id.textview_id);
        //assertThat(txtView.getText().toString(), equalTo("Hello World!"));
        assertThat(txtView.getText().toString(), equalTo("World!"));
    }
}