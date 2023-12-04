package org.justjob.model;

import lombok.Data;

import java.util.List;

@Data
public class Imovel {
    private String lagradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private List<Servico> historicoDeServicos;

    public Imovel visualizarDadosDoImovel() { return null; }

    public Cliente visualizarDadosDoProprietario() { return null; }

    public Servico visualizarHistoricoServicos() { return null; }

}
