package edu.ifam.listadetarefapdm.repositorio

import edu.ifam.listadetarefapdm.datasource.DataSource
import edu.ifam.listadetarefapdm.model.Tarefa
import kotlinx.coroutines.flow.Flow


class TarefasRepositorio() {

    private val dataSource = DataSource()

    fun salvarTarefa(tarefa: String, descricao: String, prioridade: Int){
        dataSource.salvarTarefa(tarefa, descricao, prioridade)
    }

    fun recuperarTarefas():Flow<MutableList<Tarefa>> {
        return dataSource.receperarTarefas()

    }

    fun deletarTarefa(tarefa: String){
        dataSource.deletarTarefa(tarefa)
    }
}