package co.codemaestro.roomdatabasepractice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private TextView mTimeBankDetailTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mTimeBankDetailTitle = findViewById(R.id.timeBankDetailTitle);
        mTimeBankDetailTitle.setText(getIntent().getStringExtra("title"));
    }
}
