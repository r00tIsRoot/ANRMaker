package com.isRoot.anrmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.isRoot.anrmaker.databinding.ActivityMainBinding;

import android.os.Bundle;

import com.isRoot.anrmaker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mViewModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpMVVM();
    }

    private void setUpMVVM() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mViewModel = obtainViewModel();
        binding.setLifecycleOwner(this);
        binding.setViewModel(mViewModel);
    }

    private MainViewModel obtainViewModel() {
        ViewModelProvider.AndroidViewModelFactory viewModelFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication());
        return new ViewModelProvider(this, viewModelFactory).get(MainViewModel.class);
    }
}