package com.asta.counter

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainScreenViewModel : ViewModel() {

    private val _count = mutableIntStateOf(0)
    val count: State<Int> get() = _count

    private val _isDark = mutableStateOf(false)
    val isDark: State<Boolean> get() = _isDark

    fun increment(){ _count.intValue++ }

    fun reset(){ _count.intValue = 0 }

    fun switchTheme(){ _isDark.value = !_isDark.value}

}