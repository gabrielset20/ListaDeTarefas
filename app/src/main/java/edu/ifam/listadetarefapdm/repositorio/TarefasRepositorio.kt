package edu.ifam.listadetarefapdm.repositorio

import edu.ifam.listadetarefapdm.datasource.DataSource

class TarefasRepositorio() {

    private val dataSource = DataSource()

    fun salvarTarefa(tarefa: String, descricao: String, prioridade: Int){
        dataSource.salvarTarefa(tarefa, descricao, prioridade)
    }
}