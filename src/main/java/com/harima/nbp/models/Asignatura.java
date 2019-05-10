package com.harima.nbp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    private Long id;

    @NotNull
    @Column(name = "codigo_asignatura")
    private String codigoDeAsignatura;

    @NotNull
    @Column(name = "nombre_asignatura")
    private String nombreDeAsignatura;

    @NotNull
    @Column(name = "numero_horas")
    private int numeroDeHoras;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id", foreignKey = @ForeignKey(name = "profesor2_id_fk"))
    private Profesor profesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", foreignKey = @ForeignKey(name = "curso2_id_fk"))
    private Curso curso;

    public Asignatura(){}
}
