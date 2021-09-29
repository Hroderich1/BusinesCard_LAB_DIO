package br.com.dio.hroderich1.businescard_lab_dio.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.dio.hroderich1.businescard_lab_dio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by Lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
