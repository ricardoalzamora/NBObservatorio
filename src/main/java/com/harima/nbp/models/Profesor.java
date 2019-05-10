package com.harima.nbp.models;

import com.harima.nbp.nums.EstadoProfesor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Caso> casosRegistrados;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_profesor")
    private EstadoProfesor estadoDeProfesor;

    @NotNull
    @OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY)
    private List<Asignatura> asignaturas;

    public Profesor(){
        super();
    }
}
