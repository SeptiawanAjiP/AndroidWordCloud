package com.dewakoding.androidwordcloud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dewakoding.androidwordcloud.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.wcMain.setWordCloud("The final Android 14 Beta 5.3 patch was released last week, and this week kicks off with the Android 14 QPR1 Beta 1, which builds on top of the Android 14 platform release and includes the latest bug fixes and improvements to stability and performance. If you take no action and remain enrolled in the Beta Program, you will automatically receive Android 14 QPR1 Beta 1 on enrolled supported Pixel devices the week of the 18th, and will not receive the final stable public Android 14 release. Head over to the link for instructions on how to receive the final stable public Android 14 release without wiping your device.")
    }
}