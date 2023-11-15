package ru.myitschool.lab22toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import ru.myitschool.lab22toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        count = savedInstanceState?.getInt("count") ?: 0
        Toast.makeText(this, R.string.ncreate, Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, R.string.nstart, Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, R.string.nresume, Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        if (count % 2 == 0) Toast.makeText(this, R.string.ndestroy, Toast.LENGTH_LONG).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        count++
        outState.putInt("count", count)
    }
}