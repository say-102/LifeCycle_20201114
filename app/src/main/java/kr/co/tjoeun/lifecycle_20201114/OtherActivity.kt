package kr.co.tjoeun.lifecycle_20201114

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class OtherActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
        setupEvents()
        setValues()

        Log.d("다른화면", "onCreate 실행")
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

}