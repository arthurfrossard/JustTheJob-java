package org.justjob.model;

import lombok.Data;

@Data
public class Imovel {
    private String lagradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

}
