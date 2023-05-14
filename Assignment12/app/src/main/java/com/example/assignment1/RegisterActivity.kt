package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.assignment1.databinding.ActivityRegisterBinding
import com.jakewharton.rxbinding2.widget.RxTextView
import android.view.View
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

//@SuppressLint("CheckResult")
class RegisterActivity : AppCompatActivity(){

    private lateinit var binding: ActivityRegisterBinding
    private lateinit var appDb : AppDatabase

    private lateinit var etRoll : EditText
    private lateinit var etUsername : EditText
    private lateinit var etEmail : EditText
    private lateinit var etPassword : EditText
    private lateinit var etConfirmPassword : EditText
    private lateinit var btnRegistration : Button

    private lateinit var btnClear : Button
    private lateinit var btnRead : Button





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appDb = AppDatabase.getDatabase(this)


        etRoll = findViewById(R.id.et_roll_no)
        etUsername = findViewById(R.id.et_username)
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)
        etConfirmPassword = findViewById(R.id.et_confirm_password)



        btnRead = findViewById(R.id.btnRead)
        //btnRead.setOnClickListener(this);
        btnClear = findViewById((R.id.btnClear))
        //btnClear.setOnClickListener(this);

        //appDb = AppDatabase.getDatabase(this)


        btnRegistration = findViewById(R.id.btn_register)
        btnRegistration.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()

            if (username.isEmpty()) {
                etUsername.error = "Username Required"
                return@setOnClickListener
            } else if (email.isEmpty()) {
                etEmail.error = "Email Required"
                return@setOnClickListener
            } else if (password.isEmpty()) {
                etPassword.error = "Password Required"
                return@setOnClickListener
            } else if (confirmPassword != password || confirmPassword.isEmpty()) {
                etConfirmPassword.error = "Passwords don't confirm"
                return@setOnClickListener
            } else {
                Toast.makeText(this, "Registration Completed", Toast.LENGTH_SHORT).show()
                //startActivity(Intent(this, LoginActivity::class.java))
            }

            writeData()


        }




        binding.tvHaveAccount.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }



        binding.btnRead.setOnClickListener{
            //readData()
        }



    }



    private fun writeData(){


        val username = binding.etUsername.text.toString()
        val password = binding.etPassword.text.toString()
        val rollNo = binding.etRollNo.text.toString()

        if(username.isNotEmpty() && password.isNotEmpty() && rollNo.isNotEmpty()){

            val user = User (
                null, username, password, rollNo.toInt()
            )

            GlobalScope.launch(Dispatchers.IO){
                appDb.userDao().insert(user)
            }

            binding.etUsername.text?.clear()
            binding.etPassword.text?.clear()
            binding.etRollNo.text?.clear()

            Toast.makeText(this@RegisterActivity, "Successfully written", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@RegisterActivity, "Please Enter Data", Toast.LENGTH_SHORT).show()
        }

    }


    /*
    private suspend fun displayData(user: User){
        withContext(Dispatchers.Main){
            binding.tvUsername.text = user.userName
            binding.tvPassword.text = user.passwordName
            binding.tvRollNo.text = user.rollNo.toString()
        }
    }







    private fun readData(){

        val rollNo = binding.etRollNoRead.text.toString()

        if(rollNo.isNotEmpty()){
            lateinit var user: User
            GlobalScope.launch {
                user = appDb.userDao().findByRoll(rollNo.toInt())
               displayData(user)
            }
        }

    }


     */





}