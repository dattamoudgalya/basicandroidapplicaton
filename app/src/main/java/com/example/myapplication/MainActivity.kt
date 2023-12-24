package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.R.color.notification_icon_bg_color
import com.example.myapplication.R.id.Linear
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.lang.reflect.Array.set
import java.net.URL
import java.net.URLConnection

class MainActivity : ComponentActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_main)

//        val buttonHot=findViewById<Button>(R.id.button)
        val buttonCool=findViewById<Button>(R.id.button1)
        val linearLayout=findViewById<LinearLayout>(Linear)
//        buttonHot.setOnClickListener{
//            linearLayout.setBackgroundColor(R.color.light_blue_600)
//        }
        buttonCool.setOnClickListener{

            linearLayout.setBackgroundColor(R.color.purple_200)


        }
       
//        setContent {
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("guvvgjvjhj")
//                }
//            }
//        }
//    }
//}

//        @Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
    }
}