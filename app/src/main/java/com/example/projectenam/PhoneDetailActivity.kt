package com.example.projectenam
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  kotlinx.android.synthetic.main.activity_phone_detail.*

class PhoneDetailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var partId= intentThatStartedThisActivity.getStringArrayExtra(Intent.EXTRA_TEXT)
            tv_item_id.text = partId.toString()
        }
    }
}