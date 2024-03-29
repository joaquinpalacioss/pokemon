package com.api.poke.repository.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PokemonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String name;

    private int experience;

    private int evolutionLevel;

    private boolean evolves;

    /*@Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;*/

   // private String imageBase64;
}

