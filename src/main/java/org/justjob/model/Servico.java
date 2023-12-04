package org.justjob.model;

import lombok.Data;
import org.justjob.enums.StatusServico;

import java.time.LocalDate;
import java.util.List;

@Data
public class Servico {
    private long id;
    private String tipo;
    private LocalDate dataCotacao;
    private LocalDate dataExecucao;
    private Imovel localLimpeza;
    private StatusServico statusServico;
    private double valor;
    private Cliente cliente;
    private List<Funcionario> faxineiros;
    private String avaliacao;

    public void agendarCotacao(Cliente cliente, LocalDate dataCotacao, Imovel localLimpeza, Funcionario gerente) { }

    public void gerarFormularioReserva() { }

    public void agendarServico(LocalDate dataExecucao, double valor, String tipo) { }

    public void alocarFaxineiro(Funcionario faxineiros) { }

    public void confirmarSatisfacao(String avaliacao) { }
}
