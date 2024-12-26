package com.example.bakersbakery.Model;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Android {
    public static void showToast(Context context, String message){

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void passUserModelAsIntent(Intent intent, UserModel model){
        intent.putExtra("username",model.getUsername());
        intent.putExtra("phone",model.getPhone());
        intent.putExtra("userId",model.getUserId());

    }
}
