package com.harima.nbp.models;

import com.harima.nbp.nums.TipoUsuario;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @NotNull
    private String codigo;

    @NotNull
    private String documento;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario")
    private TipoUsuario tipoDeUsuario;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String contrasenia;

    public Usuario(){}
}
