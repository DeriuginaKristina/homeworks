package de.ait.homework35;

import java.util.ArrayList;
import java.util.List;

public class SuperheroManager {
    public List<Superhero> superHeroes;

    public SuperheroManager() {
            superHeroes = new ArrayList<>();
        }
        public void addSuperhero(Superhero superhero) {
        if (superHeroes.contains(superhero)) {
                System.out.println("Error: The superhero with the same name already exists.");
        } else {
            superHeroes.add(superhero);
            }
        }

        public Superhero removeSuperhero(String name) {
            Superhero removedSuperhero = null;

            for (Superhero superhero : superHeroes) {
                if (superhero.getName().equals(name)) {
                    removedSuperhero = superhero;
                    superHeroes.remove(superhero);
                    break;
                }
            }
            return removedSuperhero;
        }

        public String getSuperheroName(String name) {
            for (Superhero superhero : superHeroes) {
                if (superhero.getName().equals(name)) {
                    return superhero.getName();
                }
            }
            return null;
        }

        public List<String> getAllSuperheroNames() {
            List<String> superheroNames = new ArrayList<>();
            for (Superhero superhero : superHeroes) {
                superheroNames.add(superhero.getName());
            }
            return superheroNames;
        }
    }
