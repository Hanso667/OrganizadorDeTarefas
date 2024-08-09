package br.ulbra.organizador;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Tarefa {

    private ArrayList<String> tarefa = new ArrayList<String>();

    public void addTarefa(String tarefa) {
        this.tarefa.add(tarefa);
    }

    public void removeTarefa(int indice) {
        this.tarefa.remove(indice);
    }

    public void editTarefa(int indice, String tarefaNova) {
        this.tarefa.set(indice, tarefaNova);
    }

    public String getTarefas() {
        String lista = "Lista de tarefas:\n";
        for (int i = 0; i < this.tarefa.size(); i++) {
            lista += i+"-"+this.tarefa.get(i) + "\n";
        }
        return lista;
    }

    public boolean ListaVazia() {
        return tarefa.isEmpty();
    }

    public int getQuantidadeTarefas() {
        return tarefa.size();
    }

    public void sortTarefas() {
        Collections.sort(tarefa);
    }

    public void removeAllTarefas() {
        tarefa.removeAll(tarefa);
        }
}
