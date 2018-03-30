package frameschool.net.kotlinandroiddemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button


        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {

            var text = et_user_name.text.toString()
            val pwd = et_password.text.toString()

            text = if(TextUtils.isEmpty(text) ) "Error!"  else text
            text = if(TextUtils.isEmpty(pwd) ) "Error!"  else text

            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

            val numeriPari: Array<Int> = arrayOf(0, 2, 4, 6, 8, 10)

            println(" ")
            print(numeriPari[0]) // 0
            print(" ")
            print(numeriPari[3]) // 6
            println(" ")


            // Stamperà "0 2 4 6 8 10 "
            for (numero in numeriPari) {
                print(numero)
                print(" ")
            }

            println(" ")

            // Somma tutti i numeri
            var somma = 0
            for (numero in numeriPari) {
                somma = somma + numero
            }

            println(somma) // 30

            println(" ")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
