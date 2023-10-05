package edu.ifam.listadetarefapdm.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.ifam.listadetarefapdm.componentes.Botao
import edu.ifam.listadetarefapdm.componentes.CaixaDeTexto
import edu.ifam.listadetarefapdm.ui.theme.Black
import edu.ifam.listadetarefapdm.ui.theme.Purple700
import edu.ifam.listadetarefapdm.ui.theme.RADIO_BUTTON_GREEN_DISABLE
import edu.ifam.listadetarefapdm.ui.theme.RADIO_BUTTON_GREEN_SELECTED
import edu.ifam.listadetarefapdm.ui.theme.RADIO_BUTTON_RED_DISABLE
import edu.ifam.listadetarefapdm.ui.theme.RADIO_BUTTON_RED_SELECTED
import edu.ifam.listadetarefapdm.ui.theme.RADIO_BUTTON_YELLOW_DISABLE
import edu.ifam.listadetarefapdm.ui.theme.RADIO_BUTTON_YELLOW_SELECTED
import edu.ifam.listadetarefapdm.ui.theme.White

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SalvarTarefa(
    navController: NavController
){
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Purple700,
                title = {
                    Text(text = "Salvar Tarefas",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = White )
                }
            )
        },
        backgroundColor = Black,
        floatingActionButton = {

        }
    ){
        var tituloTarefa by remember {
            mutableStateOf("")
        }

        var descricaoTarefa by remember {
            mutableStateOf("")
        }

        var semPrioridadeTarefa by remember {
            mutableStateOf(false)
        }

        var prioridadeBaixa by remember {
            mutableStateOf(false)
        }

        var prioridadeMedia by remember {
            mutableStateOf(false)
        }

        var prioridadeAlta by remember {
            mutableStateOf(false)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {

            CaixaDeTexto(value = tituloTarefa
                , onValueChange = {
                                  tituloTarefa = it
                }
                , modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp, 0.dp)
                , label = "Titulo Tarefa"
                , maxLines = 1
                , keyboardType = KeyboardType.Text
            )

            CaixaDeTexto(value = descricaoTarefa
                , onValueChange = {
                    descricaoTarefa = it
                }
                , modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(20.dp, 10.dp, 0.dp)
                , label = "Descrição"
                , maxLines = 5
                , keyboardType = KeyboardType.Text
            )

            Row(
                verticalAlignment =  Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Nível de prioridade")
                
                    RadioButton(
                        selected = prioridadeBaixa,
                        onClick = {
                            prioridadeBaixa = !prioridadeBaixa
                        },
                        colors = RadioButtonDefaults.colors(
                            unselectedColor = RADIO_BUTTON_GREEN_DISABLE,
                            selectedColor = RADIO_BUTTON_GREEN_SELECTED
                        )
                    )

                RadioButton(
                    selected = prioridadeMedia,
                    onClick = {
                        prioridadeMedia = !prioridadeMedia
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_YELLOW_DISABLE,
                        selectedColor = RADIO_BUTTON_YELLOW_SELECTED
                    )
                )

                RadioButton(
                    selected = prioridadeAlta,
                    onClick = {
                        prioridadeAlta = !prioridadeAlta
                    },
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = RADIO_BUTTON_RED_DISABLE,
                        selectedColor = RADIO_BUTTON_RED_SELECTED
                    )
                )
            }

            Botao(onClick = {},
                modifier = Modifier.fillMaxWidth().height(80.dp).padding(20.dp),
                texto = "Salvar"
            )
        }
    }
}