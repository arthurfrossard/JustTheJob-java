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
    private StatusServico statusServico;
    private double valor;
    private Cliente cliente;
    private List<Funcionario> faxineiros;
    private String avaliacao;

    public void agendarCotacao(Cliente cliente, LocalDate dataCotacao, String tipo) { }

    public void gerarFormularioReserva() { }

    public void agendarServico(LocalDate dataExecucao, double valor) { }

    public void alocarFaxineiros(List<Funcionario> faxineiros) { }

    public void confirmarSatisfacao(String avaliacao) { }
}
