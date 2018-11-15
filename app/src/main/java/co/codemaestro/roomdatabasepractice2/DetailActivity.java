package co.codemaestro.roomdatabasepractice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private TextView mTimeBankDetailTitle;
    private Button updateTime;
    private EditText timeToAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mTimeBankDetailTitle = findViewById(R.id.timeBankDetailTitle);
        mTimeBankDetailTitle.setText(getIntent().getStringExtra("title"));

        timeToAdd = findViewById(R.id.time_to_add);
        updateTime = findViewById(R.id.updateTimeButton);

        updateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = mTimeBankDetailTitle.getText().toString();
                String time = timeToAdd.getText().toString();

                Word word = new Word();
                word.setTimeBankTitle(id);
                word.setTimeBankValue(time);

//                WordRoomDatabase.wordDao().updateTimeValue(word);
            }
        });
    }

}
