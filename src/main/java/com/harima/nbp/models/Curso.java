package com.harima.nbp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "curso")
public class Curso {

    @Id
    private Long id;

    @NotNull
    @Column(name = "nombre_curso")
    private String nombreDeCurso;

    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;

    @OneToMany(mappedBy = "curso", fetch = FetchType.LAZY)
    private List<Asignatura> asignaturas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grado_id", foreignKey = @ForeignKey(name = "grado_id_fk"))
    private Grado grado;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "director_curso_id")
    private Profesor directorCurso;

    public Curso(){}
}
