package org.justjob.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Cliente extends Pessoa{
    private List<Servico> historicoDeServicos;
    private List<Imovel> imoveis;

    public Servico visualizarHistoricoServicos() { return null; }

    public List<Imovel> visualizarImoveis() { return null; }

    public Cliente visualizarDadosCliente(String cpf) { return null; }
}
