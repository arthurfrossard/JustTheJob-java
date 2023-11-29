package org.justjob.model;

import lombok.Data;

@Data
public abstract class Pessoa{
    private long id;
    private String pessoa;
    private String cpf;
    private String telefone;
    private String email;
    private Imovel endereco;
}
