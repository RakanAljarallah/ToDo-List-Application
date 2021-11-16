package com.example.todo_list_application.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todo_list_application.data.DataValues
import com.example.todo_list_application.data.myList
import com.example.todo_list_application.databinding.FragmentFirstPageBinding

class ListViewModel: ViewModel()  {
private var binding: FragmentFirstPageBinding? = null
// DEFINING LISTS QUANTITY
   private val _quantityOfList = MutableLiveData <Int>()
    val quantityOfList = _quantityOfList
    // the title inserted by the user
   private val _textInserted = MutableLiveData <String>()
    val textInserted: LiveData<String> = _textInserted
    // date_to be made
   private val _dateAssigned = MutableLiveData <String>()
    val dateAssigned = _dateAssigned
    private val _isImportant = MutableLiveData<Boolean>()
    val isImportant = _isImportant
    private val _isFinished = MutableLiveData<Boolean>()
    val isFinished = _isFinished

    fun setQuantity(){

    }

    fun setQuantityofList(){
// used in the first page for the first init
    }

    fun setText(userInput : String) {
        _textInserted.value = userInput
        var clicks = 0
        myList.set(clicks, DataValues(title = _textInserted.value!!))
        ++clicks
    }

    fun setDate(currentDate: String) {
        _dateAssigned.value = currentDate
        var clicks = 0
        myList.set(clicks, DataValues(date = _dateAssigned.value!!) )
        ++clicks
    }

    fun setSsImportant(isColored: Boolean){
        _isImportant.value = isColored == true
        var clicks = 0
        myList.set(clicks, DataValues(urgency = _isImportant.value!!))
        ++clicks
    }

    fun setIsFinished(isChecked:Boolean){
      _isFinished.value = isChecked == true
      var clicks = 0
      myList.set(clicks, DataValues(finishing = _isFinished.value!!))
      ++clicks
    }

}