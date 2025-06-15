/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Apresentacao;


/**
 *
 * @author Gabriel e João Pedro 
 */
public class ApresentacaoRepository {
    private static ApresentacaoRepository instance;
    private List<Apresentacao> apresentacoes;

    private ApresentacaoRepository() {
        apresentacoes = new ArrayList<>();
    }

    public static ApresentacaoRepository getInstance() {
        if (instance == null) {
            instance = new ApresentacaoRepository();
        }
        return instance;
    }

    public void adicionarApresentacao(Apresentacao a) {
        apresentacoes.add(a);
    }

    public Apresentacao buscarApresentacao(int id) {
        return apresentacoes.stream()
                             .filter(a -> a.getId() == id)
                             .findFirst()
                             .orElse(null);
    }

    public List<Apresentacao> listarApresentacoes() {
        return new ArrayList<>(apresentacoes);
    }

    public List<Apresentacao> listarProjetosAprovados(){
        return apresentacoes.stream()
                             .filter(a -> a.getProjeto().getNotaFinal() >= 7.0)
                             .toList();
    }

  
    
}
