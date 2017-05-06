import java.util.Comparator;

/**
 * Created by mollyarant on 5/6/17.
 */




public class Pet implements Comparable<Pet>, Comparator<Pet> {

    String petName;
    String petType;

    public Pet(String petName, String petType) {
        this.petName = petName;
        this.petType = petType;

    }


    public String getPetName() {
        return petName;
    }


    public void setPetName() {
        this.petName = petName;
    }


    public String getPetType() {
        return petType;
    }


    public void setPetType() {
        this.petType = petType;
    }


    public String speak() {
        String greeting = "HELLO HUMAN!";
        return greeting;
    }

    public int compareTo
            (Pet o) {
        if(this.petName.equals(o.getPetName())){
            int compareClass = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
                return compareClass;
        }
        else{
            return this.petName.compareTo(o.getPetName());


        }
    }


    public int compare(Pet pet1, Pet o2) {
        if (this.petType.equals(o2.getPetType())){
            int compareName= this.getPetName().compareTo(o2.getPetName());
            return compareName;
        }
        else{
            return this.petType.compareTo(o2.getPetType());
        }
    }
}
