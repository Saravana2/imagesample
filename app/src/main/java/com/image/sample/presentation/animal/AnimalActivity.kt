package com.image.sample.presentation.animal

import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.image.sample.databinding.ActivityAnimalBinding
import com.image.sample.presentation.BaseActivity
import com.image.sample.presentation.utils.loadImage

class AnimalActivity : BaseActivity() {

    private lateinit var binding: ActivityAnimalBinding
    private lateinit var viewModel: AnimalViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = getAppInjector().createAnimalSubComponent().getAnimalViewModelFactory()
        viewModel = ViewModelProvider(this, factory)[AnimalViewModel::class.java]

        setClickAction()
        setUpObserver()
        getRandomAnimal()
    }

    private fun setClickAction() {
        binding.reloadFab.apply {
            setOnClickListener {
                getRandomAnimal(forceReload = true)
            }
        }
    }

    private fun setUpObserver() {
        viewModel.animalResponse.observe(this) {
            binding.animalImageView.loadImage(it.message)
            changeLoadingVisibility(true)
        }
    }

    private fun getRandomAnimal(forceReload: Boolean = false) {
        changeLoadingVisibility(false)
        if (viewModel.animalResponse.value == null || forceReload)
            viewModel.getRandomAnimal()
    }

    private fun changeLoadingVisibility(visible: Boolean) {
        binding.animalImageView.isVisible = visible
        binding.progressBar.isVisible = !visible
    }

}