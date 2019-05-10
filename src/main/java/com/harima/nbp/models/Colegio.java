package com.harima.nbp.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "colegio")
public class Colegio {

    @Id
    private Long id;

    @NotNull
    @Column(name = "codigo_colegio")
    private String codigoDeColegio;

    @NotNull
    @Column(name = "nombre_colegio")
    private String nombreDeColegio;

    @NotNull
    @Column(name = "direccion_colegio")
    private String direccionDeColegio;

    @NotNull
    @Column(name = "departamento_colegio")
    private String departamentoDeColegio;

    @NotNull
    @Column(name = "ciudad_colegio")
    private String ciudadDeColegio;

    @OneToMany(mappedBy = "colegio", fetch = FetchType.LAZY)
    private List<Grado> grados;

    public Colegio(){}
}
