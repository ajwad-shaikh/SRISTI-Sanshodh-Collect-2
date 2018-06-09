package org.odk.collect.sristi.activities;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

import org.odk.collect.sristi.R;
import org.odk.collect.sristi.application.Collect;

public class NotificationActivity extends CollectAbstractActivity {

    public static final String NOTIFICATION_KEY = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);

        String note = this.getIntent().getStringExtra(NOTIFICATION_KEY);
        if (note == null) {
            note = getString(R.string.notification_error);
        }

        TextView notificationText = findViewById(R.id.notification);
        notificationText.setTextSize(TypedValue.COMPLEX_UNIT_DIP, Collect.getQuestionFontsize());
        notificationText.setTypeface(null, Typeface.BOLD);
        notificationText.setPadding(0, 0, 0, 7);
        notificationText.setText(note);
    }

}
