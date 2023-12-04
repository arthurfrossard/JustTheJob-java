package org.justjob.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Fatura {
    private List<Servico> servicos;
    private LocalDate dataEmissao;
    private LocalDate dataVencimento;
    private double valorPago;
    private double valorDevido;

    public void atualizarPagamentoParcial() {  }

    public void atualizarPagamentoTotal() {  }

    public void gerarFatura(){  }

    public void gerarRecibo() {  }
}
