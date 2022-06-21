package com.example.gallerycameraactivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gallerycameraactivity.databinding.ActivityGalleryImageBinding;

public class GalleryImageActivity extends AppCompatActivity {

    ActivityGalleryImageBinding binding;

    int CAMERA_PICTURE = 102;
    int GALLERY_CAPTURE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityGalleryImageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivityForResult(i, CAMERA_PICTURE);


            }
        });
    }
}