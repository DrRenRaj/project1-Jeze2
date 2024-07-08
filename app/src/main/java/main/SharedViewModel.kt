package main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    // MutableLiveData to hold the message
    private val _message = MutableLiveData<String>()

    // LiveData to be observed by the fragments
    val message: LiveData<String> get() = _message

    // Method to update the message
    fun setMessage(newMessage: String) {
        _message.value = newMessage
    }
}
