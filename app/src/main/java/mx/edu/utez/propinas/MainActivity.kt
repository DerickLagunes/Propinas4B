package mx.edu.utez.propinas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.edu.utez.propinas.ui.screens.propinas.PropinasScreen
import mx.edu.utez.propinas.ui.screens.propinas.PropinasViewModel
import mx.edu.utez.propinas.ui.theme.PropinasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel = PropinasViewModel()
        setContent {
            PropinasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PropinasScreen(
                        modifier = Modifier.padding(innerPadding),
                        viewModel
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PropinasTheme {}
}