package com.chatgpt.android.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chatgpt.android.R;
import com.chatgpt.android.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity {

    ActivityPaymentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityPaymentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}