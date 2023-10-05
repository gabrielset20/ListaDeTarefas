package edu.ifam.listadetarefapdm.view


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import edu.ifam.listadetarefapdm.R
import edu.ifam.listadetarefapdm.ui.theme.Black
import edu.ifam.listadetarefapdm.ui.theme.Purple700
import edu.ifam.listadetarefapdm.ui.theme.White


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListaTarefas(
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Purple700,
                title = {
                    Text(text = "Lista de Tarefas",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = White )
                }
            )
        },
        backgroundColor = Black,
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate(route = "salvarTarefa")
            },
                backgroundColor = Purple700,
            ) {
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_add)
                    , contentDescription = "Icone de adicionar tarefa"
                )
            }
        }
    ){
    }
}