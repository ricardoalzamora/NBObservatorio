package com.harima.nbp.models;

import com.harima.nbp.nums.EstadoEstudiante;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "curso_id", foreignKey = @ForeignKey(name = "curso_id_fk"))
    private Curso curso;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_estudiante")
    private EstadoEstudiante estadoEstudiante;

    @OneToOne(mappedBy = "estudiante", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Acudiente acudiente;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Caso> casosInvolucrado;

    public Estudiante(){}
}
