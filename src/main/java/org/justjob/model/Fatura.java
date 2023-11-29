package org.justjob.model;

import lombok.Data;

@Data
public class Fatura {
    private Servico servico;

    public void gerarFatura(){  }

    public void gerarRecibo() {  }
}
