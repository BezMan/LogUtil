package bez.dev.logexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import bez.dev.calcutils.Calc;
import bez.dev.logutils.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        L.v("Calc mult fun: " + Calc.mult(3, 7));
    }

}
