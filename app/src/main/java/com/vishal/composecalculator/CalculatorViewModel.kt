package com.vishal.composecalculator

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.nio.file.Files.delete

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set //it means we can't change state outside the class but can read state var

    fun onAction(actions: CalculatorActions) {
        when (actions) {
            is CalculatorActions.Number -> enterNumber(actions.number)
            is CalculatorActions.Decimal -> enterDecimal()
            is CalculatorActions.Clear -> state = CalculatorState()
            is CalculatorActions.Delete -> performDeletion()
            is CalculatorActions.Operation -> enterOperation(actions.operation)
            is CalculatorActions.Calculate -> preformCalculation()
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {

    }

    private fun preformCalculation() {

    }

    private fun performDeletion() {

    }

    private fun enterDecimal() {

    }

    private fun enterNumber(number: Int) {
        Log.e("@@@",number.toString())
    }

}