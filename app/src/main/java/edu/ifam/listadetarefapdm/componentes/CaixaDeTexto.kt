package edu.ifam.listadetarefapdm.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import edu.ifam.listadetarefapdm.ui.theme.Black
import edu.ifam.listadetarefapdm.ui.theme.LIGHT_BLUE
import edu.ifam.listadetarefapdm.ui.theme.ShapeEditText
import edu.ifam.listadetarefapdm.ui.theme.White

@Composable
fun CaixaDeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String,
    maxLines: Int = 1,
    keyboardType: KeyboardType
){
    OutlinedTextField(
        value = value,
        onValueChange,
        modifier,
        label = {
            Text(text = label)
        },
        maxLines = maxLines,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Black,
            focusedBorderColor = LIGHT_BLUE,
            focusedLabelColor = LIGHT_BLUE,
            backgroundColor = White,
            cursorColor = LIGHT_BLUE
        ),
        shape = ShapeEditText.small,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType

        )
    )
}