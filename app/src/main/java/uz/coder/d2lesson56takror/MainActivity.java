package uz.coder.d2lesson56takror;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import uz.coder.d2lesson56takror.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}