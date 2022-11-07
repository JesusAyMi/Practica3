package net.iessochoa.jesusayala.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import net.iessochoa.jesusayala.practica3.databinding.ActivityMainBinding

private const val TAG = "mostrar log"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val model:MainActivityViewModel by viewModels()
    var num: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSumaUno.setOnClickListener(){
            model.sumaUno()
            model.getContador().observe(this, Observer<Int>{
                    cont-> binding.tvNumero.text=cont.toString()
            })
            model.sumarAsterisco()
            model.getAstericos().observe(this, Observer<String>{
                ast-> binding.tvAsteriscos.text = ast.toString()
            })
        }

        Log.i(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }
    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }
    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }
}