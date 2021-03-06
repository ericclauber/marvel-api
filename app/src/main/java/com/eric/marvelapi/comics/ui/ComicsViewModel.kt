package com.eric.marvelapi.comics.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.eric.marvelapi.comics.data.ComicRepository
import com.eric.marvelapi.comics.model.ComicModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(private val repository: ComicRepository) : ViewModel() {

    fun getComics(): Flow<PagingData<ComicModel>> {
        return repository.getComics()
    }
}