package mx.edu.utez.propinas.ui.screens.propinas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PropinasScreen(
    modifier: Modifier = Modifier,
    viewModel: PropinasViewModel = viewModel()
) {
    Column(){
        OutlinedTextField(
            viewModel.consumo,
            { viewModel.onConsumoChanged(it) },
            label = {Text("Pon tu consumo total aqui:")},
            keyboardOptions = KeyboardOptions(keyboardType= KeyboardType.Number),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Row(){
            Button({ viewModel.obtenerPropina(0.1) }){Text("10%")}
            Button({ viewModel.obtenerPropina(0.15) }){Text("15%")}
            Button({ viewModel.obtenerPropina(0.20) }){Text("20%")}
        }
        Text("El total con propina es: $${viewModel.consumo_con_propina}")
    }
}

