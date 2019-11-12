package bez.dev.logexample

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import bez.dev.calcutils.Calc
import bez.dev.calcutils.KCalc
import bez.dev.logutils.KL
import bez.dev.logutils.L

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        L.v("Java mult fun: " + Calc.mult(3f, 7f))
        KL.v("Kotlin mult fun: " + KCalc.mult(3f, 7f))
    }

}
