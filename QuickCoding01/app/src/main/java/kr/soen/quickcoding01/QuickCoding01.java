package kr.soen.quickcoding01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuickCoding01 extends AppCompatActivity {

    int[] num = {200, 4, 6, 7, 4, 32, 23, 12};
    Min m = new Min(num);
    Avg a = new Avg(num);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_coding01);



        Button avg = (Button) findViewById(R.id.avg);
        Button min = (Button) findViewById(R.id.min);


        avg.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                TextView re = (TextView)findViewById(R.id.result);
                re.setText("평균 = "+a.getRsult(a.AvgResult(num)));
                String s = Integer.toString(a.getRsult(a.AvgResult(num)));
                Toast.makeText(QuickCoding01.this, s, Toast.LENGTH_SHORT).show();
            }
        });
        min.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                TextView re = (TextView)findViewById(R.id.result);
                re.setText("평균 = "+a.getRsult(m.MinResult(num)));
                String s1 = Integer.toString(a.getRsult(m.MinResult(num)));
                Toast.makeText(QuickCoding01.this, s1, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

