package com.example.todo_listo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()

    }

    private fun variablesYConstantes(){
        var myVariable = "Hello world"
        println(myVariable);
    }
}