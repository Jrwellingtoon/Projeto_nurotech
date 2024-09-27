package com.unit.Neurotech.modelos;


import jakarta.persistence.*;
import lombok.*;

@Table(name="tb_Funcionario")
@Entity(name = "Functionary")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Functionary {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String contato;

    private String endereco;

   private String competencias_tecnicas;

   private String certificacoes;

   private int tempo_experiencia;

   private String linkedin ;
}
