package com.harima.nbp.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "psicologo")
public class Psicologo {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "psicologoEncargado", fetch = FetchType.LAZY)
    private List<Caso> casosAsignados;

    public Psicologo(){}

}
