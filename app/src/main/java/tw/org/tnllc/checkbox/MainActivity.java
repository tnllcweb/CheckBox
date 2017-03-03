package tw.org.tnllc.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox eatBox, sleepBox, drinkBoxk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatBox = (CheckBox) findViewById(R.id.eatId);
        sleepBox = (CheckBox) findViewById(R.id.sleepId);
        drinkBoxk = (CheckBox) findViewById(R.id.drinkId);

        CheckBoxListener listener = new CheckBoxListener();
        eatBox.setOnCheckedChangeListener(listener);

//        OnBoxClickListener listener = new OnBoxClickListener();
//        eatBox.setOnClickListener(listener);
//        sleepBox.setOnClickListener(listener);
//        drinkBoxk.setOnClickListener(listener);

    }

    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (buttonView.getId() == R.id.eatId) {
                Log.i("eat status is ", String.valueOf(isChecked));
            }
        }
    }

//    class OnBoxClickListener implements View.OnClickListener {
//        @Override
//        public void onClick(View v) {
//            CheckBox box = (CheckBox) v;
//            if (v.getId() == R.id.eatId) {
//                if (box.isChecked()) {
//                    Log.i("eat", "is clicked");
//                } else Log.i("eat", "is not clicked");
//            }
//        }
//    }
}
