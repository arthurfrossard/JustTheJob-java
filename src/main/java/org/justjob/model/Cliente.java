package org.justjob.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Cliente extends Pessoa{
    private List<Servico> historicoDeServicos;
    private List<Imovel> imoveis;
}
