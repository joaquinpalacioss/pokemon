package com.api.poke.model;

import lombok.Data;
import lombok.Getter;
//ESTE YA ES EL TRANSFORMADO
@Data
@Getter
public class Pokemon {
    private Long id_pokemon;
    private String name;
    private int experience;
    private int evolutionLevel;
    private boolean evolves;
   // private byte[] image;
    //private String imageBase64;

    public void evolve() {

    }

    public Pokemon(Builder builder) {
        this.id_pokemon = builder.id_pokemon;
        this.name = builder.name;
        this.experience = builder.experience;
        this.evolutionLevel = builder.evolutionLevel;
        this.evolves = builder.evolves;
      //  this.image = builder.image;
       // this.imageBase64 = builder.imageBase64;
    }
    public static class Builder {
        private Long id_pokemon;
        private String name;
        private int experience;
        private int evolutionLevel;
        private boolean evolves;

        //private byte[] image;
        //private String imageBase64;

  public Builder id_pokemon(Long id_pokemon){
      this.id_pokemon = id_pokemon;
      return this;
  }

    public Builder name(String name) {
        this.name = name;
        return this;
    }

    public Builder experience(int experience) {
        this.experience = experience;
        return this;
    }

    public Builder evolutionLevel(int evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
        return this;
    }

    public Builder evolves(boolean evolves) {
        this.evolves = evolves;
        return this;
    }

    /*public Builder image(byte[] image){
        this.image = image;
        return this;
    }*/
    /*public Builder imageBase64(String imageBase64){
        this.imageBase64 = imageBase64;
        return this;
    }*/

    public Pokemon build() {
        return new Pokemon(this);
    }

}

}

