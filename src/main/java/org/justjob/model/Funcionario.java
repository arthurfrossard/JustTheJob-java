package org.justjob.model;

import lombok.Data;
import org.justjob.enums.NivelDeAcesso;

@Data
public class Funcionario extends Pessoa{
    private NivelDeAcesso nivelDeAcesso;
    private Agenda agenda;

    public void gerarProgramacaoSemanal() { }

    public void gerarRelatorioSemanalHorasTrabalhadas() { }
}
