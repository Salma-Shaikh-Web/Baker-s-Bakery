package com.example.bakersbakery.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

import com.example.bakersbakery.R;
import com.example.bakersbakery.databinding.FragmentHomeBinding;


public class Home_Fragment extends Fragment {



//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

    private FragmentHomeBinding binding;
//    private String mParam1;
//    private String mParam2;

    public Home_Fragment() {

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout using view binding
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        ArrayList<SlideModel> imageList = new ArrayList<>();


        imageList.add(new SlideModel(R.drawable.b1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.b2, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.b3, ScaleTypes.FIT));

        // Find the ImageSlider view and set the image list
        binding.imageSlider.setImageList(imageList);
        ImageSlider imageSlider=binding.imageSlider;
        imageSlider.setImageList(imageList,ScaleTypes.FIT);
        //imageSlider.setItemClickListener(object :ItemClickListener{


       // });

        // Return the root view
        return binding.getRoot();
    }


//    public static Home_Fragment newInstance(String param1, String param2) {
//        Home_Fragment fragment = new Home_Fragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);

//            ArrayList<SlideModel> imageList = new ArrayList<>();
//
//            // Add images to the list
//            imageList.add(new SlideModel(R.drawable.b1, ScaleTypes.FIT));
//            imageList.add(new SlideModel(R.drawable.b2, ScaleTypes.FIT));
//            imageList.add(new SlideModel(R.drawable.b3, ScaleTypes.FIT));
//
//            // Find the ImageSlider view and set the image list
//            binding.imageSlider.setImageList(imageList);
//            imageSlider.setImageList(imageList);
//            imageSlider.setImageList(imageList,ScaleTypes.FIT);

        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}