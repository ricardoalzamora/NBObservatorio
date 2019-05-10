package com.harima.nbp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "grado")
public class Grado {

    @Id
    private Long id;

    @NotNull
    @Column(name = "nombre_grado")
    private String nombreDeGrado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "colegio_id", foreignKey = @ForeignKey(name = "colegio_id_fk"))
    private Colegio colegio;

    @OneToMany(mappedBy = "grado", fetch = FetchType.LAZY)
    private List<Curso> cursos;

    public Grado(){}
}
