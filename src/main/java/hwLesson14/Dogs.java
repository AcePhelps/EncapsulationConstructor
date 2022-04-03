package hwLesson14;

public class Dogs {
    private String name;

    private String dogsBreed;
    public Breed breed;

    public Dogs(String name, String dogsBreed, Breed breed) {
        this.name = name;
        this.dogsBreed = dogsBreed;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDogsBreed() {
        return dogsBreed;
    }

    public void setDogsBreed(String dogsBreed) {
        this.dogsBreed = dogsBreed;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}




