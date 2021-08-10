package com.example.galleryapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.galleryapp.activities.ImageViewActivity;
import com.example.galleryapp.adapters.ImagesRvAdapter;
import com.example.galleryapp.databinding.FragmentHomeBinding;
import com.example.galleryapp.models.ModelImage;

import java.util.ArrayList;


public class HomeFragment extends Fragment {



    private FragmentHomeBinding binding;
    private ImagesRvAdapter adapter;
    private static Context context;

    private static ArrayList<ModelImage> data;

    public HomeFragment ()
    {

    }

    public HomeFragment (Context context)
    {
        this.context = context;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // trial images
        //all the frontend as well as the adapters done
        //TODO: data from drive needed to be replaced here
        data = new ArrayList<>();
        data.add(new ModelImage("https://picsum.photos/id/0/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/1/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/2/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/3/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/4/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/5/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/6/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/7/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/8/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/9/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/10/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/11/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/12/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/13/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/14/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/15/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/16/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/17/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/18/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/19/200/200"));
        data.add(new ModelImage("https://picsum.photos/id/20/800/1200"));

//        Randomize obj = new Randomize();
//        ArrayList<ModelImage> randomData = obj.getRandomized(data);

        adapter = new ImagesRvAdapter(context,data);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater,container,false);
        binding.imageRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.imageRecycler.setAdapter(adapter);
        return binding.getRoot();
    }

    public static void singleView(int i) {
        Intent intent = new Intent(context, ImageViewActivity.class);
        intent.putExtra("position",i);
        context.startActivity(intent);
    }

}