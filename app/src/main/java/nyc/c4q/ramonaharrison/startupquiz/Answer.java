package nyc.c4q.ramonaharrison.startupquiz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Answer extends ActionBarActivity {

    int answerTally;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Intent intent = getIntent();
        answerTally= intent.getIntExtra("third", 0);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(yourStartUp());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_answer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public String yourStartUp() {
        String yourStartUp = getResources().getString(R.string.answer_time);

        if (answerTally < 4) {
            yourStartUp += getResources().getString(R.string.answer_one);
        } else if (answerTally < 7) {
            yourStartUp += getResources().getString(R.string.answer_two);
        } else {
            yourStartUp += getResources().getString(R.string.answer_three);
        }

        return yourStartUp;
    }
}
