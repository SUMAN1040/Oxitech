/*
 * Name: Suman Kumar Dey
 * LinkedIn: www.linkedin.com/in/suman1040
 * Github: SUMAN1040
 */

package com.example.oxitech.ui.account

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text
}