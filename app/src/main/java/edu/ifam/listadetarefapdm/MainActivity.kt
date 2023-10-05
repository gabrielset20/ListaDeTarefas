package edu.ifam.listadetarefapdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ifam.listadetarefapdm.ui.theme.ListaDeTarefaPDMTheme
import edu.ifam.listadetarefapdm.view.ListaTarefas
import edu.ifam.listadetarefapdm.view.SalvarTarefa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeTarefaPDMTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "listaTarefas") {
                    composable(
                        route = "ListaTarefas"
                    ) {
                        ListaTarefas(navController)
                    }

                    composable(
                        route = "salvarTarefa"
                    ) {
                        SalvarTarefa(navController)
                    }
                }

            }
        }
    }
}