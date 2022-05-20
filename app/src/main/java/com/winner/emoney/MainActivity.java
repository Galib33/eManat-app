package com.winner.emoney;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.winner.emoney.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String trueemail;
    String truepassword;
    AlertDialog.Builder alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        trueemail="emanat@emanat.az";
        truepassword="password123";
        alert=new AlertDialog.Builder(this);
    }

    public void submit(View view){
        if(binding.editEmail.getText().toString().matches(trueemail) && binding.editPassword.getText().toString().matches(truepassword)){
            alert.setTitle("Uğurlu!");
            alert.setMessage("Məlumatlar doğrudur!");
        }else if(binding.editPassword.getText().toString().matches("") || binding.editEmail.getText().toString().matches("")){
            alert.setTitle("Boş xana!");
            alert.setMessage("Məlumatlar tam daxil edilməyib!");
        }else{
            alert.setTitle("Uğursuz!");
            alert.setMessage("Məlumatlar yanlışdır!");
        }
        alert.show();
    }
}