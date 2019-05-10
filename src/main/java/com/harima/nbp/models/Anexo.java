package com.harima.nbp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "anexo")
public class Anexo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String descripcion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_digitante_id", foreignKey = @ForeignKey(name = "profesor_id_fk"))
    private Profesor profesorDigitante;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "caso_id", foreignKey = @ForeignKey(name = "caso_id_fk"))
    private Caso caso;

    public Anexo(){}
}
