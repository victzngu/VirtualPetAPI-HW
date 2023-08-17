package org.wecancodeit.virtualpet.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;

@Entity
public class Pet {
    private String petName;
    private String petType;
    private boolean organic;
    private int petHappiness;
    private int petHealth;

@Id
@GeneratedValue
private long id;

@ManyToOne(cascade =CascadeType.ALL)
private Shelter shelter;


public Pet(String petName, String petType, boolean organic, int petHappiness, int petHealth, Shelter shelter) {
    this.petName = petName;
    this.petType = petType;
    this.organic = organic;
    this.petHappiness = petHappiness;
    this.petHealth = petHealth;
    this.shelter = shelter;
}

public String getPetName() {
    return petName;
}

public String getPetType() {
    return petType;
}

public boolean isOrganic() {
    return organic;
}

public int getPetHappiness() {
    return petHappiness;
}

public int getPetHealth() {
    return petHealth;
}

public long getId() {
    return id;
}

public Shelter getShelter() {
    return shelter;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((petName == null) ? 0 : petName.hashCode());
    result = prime * result + ((petType == null) ? 0 : petType.hashCode());
    result = prime * result + (organic ? 1231 : 1237);
    result = prime * result + petHappiness;
    result = prime * result + petHealth;
    result = prime * result + ((shelter == null) ? 0 : shelter.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Pet other = (Pet) obj;
    if (petName == null) {
        if (other.petName != null)
            return false;
    } else if (!petName.equals(other.petName))
        return false;
    if (petType == null) {
        if (other.petType != null)
            return false;
    } else if (!petType.equals(other.petType))
        return false;
    if (organic != other.organic)
        return false;
    if (petHappiness != other.petHappiness)
        return false;
    if (petHealth != other.petHealth)
        return false;
    if (shelter == null) {
        if (other.shelter != null)
            return false;
    } else if (!shelter.equals(other.shelter))
        return false;
    return true;
}

@Override
public String toString() {
    return "Pet [petName=" + petName + ", petType=" + petType + ", organic=" + organic + ", petHappiness="
            + petHappiness + ", petHealth=" + petHealth + ", id=" + id + ", shelter=" + shelter + "]";
}


}




