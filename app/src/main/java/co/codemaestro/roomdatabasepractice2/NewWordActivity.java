package co.codemaestro.roomdatabasepractice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";
    // TODO: extra reply 2??
    public static final String EXTRA_REPLY2 = "com.example.android.wordListsql.REPLY";

    private EditText mEditCategoryView;
    private EditText mEditTimeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        // Initializing Views
        mEditCategoryView = findViewById(R.id.edit_category);
        mEditTimeView = findViewById(R.id.edit_time);
        final Button button = findViewById(R.id.button_save);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if(TextUtils.isEmpty(mEditCategoryView.getText()) ||
                        TextUtils.isEmpty(mEditTimeView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String category = mEditCategoryView.getText().toString();
                    String time = mEditTimeView.getText().toString();

                    replyIntent.putExtra(EXTRA_REPLY, category);
                    replyIntent.putExtra(EXTRA_REPLY2, time);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}
