package ru.suai;

import ru.suai.model.Animal;

/**
 * @author rost.
 */
public class AnimalsFacrory {
    protected  Animal animal;
    public AnimalsFacrory(Animal animal){
        this.animal = animal;
    }

    @Override
    public String toString() {
        return String.format("%s says %s", animal.name(), animal.say());
    }
}
