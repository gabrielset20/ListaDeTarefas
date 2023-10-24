package edu.ifam.listadetarefapdm.datasource

import com.google.firebase.firestore.FirebaseFirestore
import edu.ifam.listadetarefapdm.model.Tarefa
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DataSource {

    private val db = FirebaseFirestore.getInstance()

    private val _todastarefas = MutableStateFlow<MutableList<Tarefa>>(mutableListOf())
    private val todastarefas: StateFlow<MutableList<Tarefa>> = _todastarefas

    fun salvarTarefa(tarefa: String, descricao: String, prioridade: Int){

        val tarefaMap = hashMapOf(
            "tarefa" to tarefa,
            "descricao" to descricao,
            "prioridade" to prioridade
        )

        db.collection("tarefas").document(tarefa).set(tarefaMap).addOnCompleteListener {

        }.addOnFailureListener {

        }
    }

    fun receperarTarefas(): Flow<MutableList<Tarefa>>{

        val listaTarefas: MutableList<Tarefa> = mutableListOf()

        db.collection("tarefas").get().addOnCompleteListener { querySnapshot ->
            if(querySnapshot.isSuccessful){
                for(documento in querySnapshot.result){
                    var tarefa = documento.toObject(Tarefa::class.java)
                    listaTarefas.add(tarefa)
                    _todastarefas.value = listaTarefas
                }
            }
        }
        return todastarefas
    }
    
    fun deletarTarefa(tarefa: String){
        db.collection("tarefas").document(tarefa).delete().addOnCompleteListener {

        }.addOnFailureListener {

        }
        
    }

}