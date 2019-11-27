package com.dotplays.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.dotplays.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //câu lênh mới thay thế cho setContentView
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Admin", "Admin@gmail.com");

        // truyền dữ liệu cho Data binding trên xml
        binding.setUser(user);

    }
}
