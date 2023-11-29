package org.justjob.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Agenda {
    private List<LocalDate> diasTrabalho;
    private List<LocalDate> diasAlocados;

    public List<LocalDate> solicitarDatasDisponiveis() {  return null;  }
}
