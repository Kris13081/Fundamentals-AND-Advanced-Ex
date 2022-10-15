package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    public List<Pet> pets;
    public int capacity;


    public GroomingSalon(int capacity){
        this.capacity = capacity;
        this.pets = new ArrayList<>();
    }

    public void add(Pet pet){
        if(this.pets.size() < this.capacity){
            pets.add(pet);
        }


    }
    public boolean remove(String name) {
        for (Pet pet : this.pets){
            if (pet.getName().equals(name)){
                pets.remove(name);
                return true;
            }
        }
        return false;
    }
    public Pet getPet(String name, String owner){
        for (Pet pet : pets) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }
    public int getCount(){
        return pets.size();
    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The grooming salon has the following clients:\n");
        for (Pet pet : pets) {
            sb.append(pet.toString()).append(System.lineSeparator());
        }
        return String.valueOf(sb);
    }
}
