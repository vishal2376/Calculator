package com.vishal.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vishal.composecalculator.ui.theme.ComposeCalculatorTheme
import com.vishal.composecalculator.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                //getting view-model
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state

                //space between all buttons
                val buttonSpacing = 8.dp

                //Calculator UI
                Calculator(
                    state = state,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp),
                    onActions = viewModel::onAction
                )
            }
        }
    }
}