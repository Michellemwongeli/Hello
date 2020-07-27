package com.gamecodeschool.hello

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_Registration.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.tvHello

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvHello.SetOnClickListener{
            val intent=intent(RegistrationActivity;class.java)
            startActivity(Intent)

        }


    }
    btnLogin.setOnClickListener{
        var firstName=edtfirstname.text.toString()
        var lastName=edtlastname.text.toString()
        var password=edtPassword.text.toString()
        var email=edtemail.text.toString()
        var phoneNumber=edtPhoneNumber.text.toString()
        var confirmPassword=edtConfirmPasswor.text.toString()

        Toast.makeText(baseContext,edtfirstname, Toast.LENGTH_LONG).show()
    }


}
