package academy.learnprogramming.playing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.note_layout) //tells app which layout to use when it runs
        //will change (R.layout.activity_main) to (R.layout.note_layout) because we are starting
        //with a different xml file
    }
}