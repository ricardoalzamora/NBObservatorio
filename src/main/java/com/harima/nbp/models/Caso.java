package com.harima.nbp.models;

import com.harima.nbp.nums.EstadoCaso;
import com.harima.nbp.nums.TipoCaso;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "caso")
public class Caso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String titulo;

    @NotNull
    private String descripcion;

    @ManyToMany(mappedBy = "casosInvolucrado", fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;

    @ManyToMany(mappedBy = "casosRegistrados", fetch = FetchType.LAZY)
    private List<Profesor> profesores;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "psicologo_encargado_id", foreignKey = @ForeignKey(name = "psicologo_encargado_id_fk"))
    private Psicologo psicologoEncargado;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private TipoCaso tipoDeCaso;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_caso")
    private EstadoCaso estadoDeCaso;

    @OneToMany(mappedBy = "caso", fetch = FetchType.LAZY)
    private List<Anexo> anexos;

    public Caso(){}
}
