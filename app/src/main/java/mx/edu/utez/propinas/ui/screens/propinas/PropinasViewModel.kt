package mx.edu.utez.propinas.ui.screens.propinas

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PropinasViewModel: ViewModel() {

    //Variables necesarias para mi ventana
    var consumo by mutableStateOf("")
    var consumo_con_propina by mutableStateOf(0.0)

    //Funcion para el input
    fun onConsumoChanged(texto_consumo: String){
        consumo = texto_consumo
    }

    //Funciones necesarias para mis botones
    fun obtenerPropina(cantidad: Double){
        val consumo_numero = consumo.toDoubleOrNull() ?: 0.0
        consumo_con_propina = consumo_numero + (consumo_numero * cantidad)
    }


}