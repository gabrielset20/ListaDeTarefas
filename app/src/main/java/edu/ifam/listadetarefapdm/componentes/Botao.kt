package edu.ifam.listadetarefapdm.componentes

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import edu.ifam.listadetarefapdm.ui.theme.LIGHT_BLUE
import edu.ifam.listadetarefapdm.ui.theme.White

@Composable
fun Botao(
    onClick: () -> Unit,
    modifier: Modifier,
    texto: String
){

    Button(
        onClick,
        modifier,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = LIGHT_BLUE,
            contentColor = White
        )
    ){
        Text(text = texto,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp)
    }
}