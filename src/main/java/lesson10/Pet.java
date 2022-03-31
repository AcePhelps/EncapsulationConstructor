package lesson10;

public class Pet {
    protected String Name;
    protected String Gender;
    protected String Breed;
    protected int year;

    public Pet(String name, String gender, String breed, int year) {
        Name = name;
        Gender = gender;
        Breed = breed;
        this.year = year;
        if(year>10||year<0){
            throw new RuntimeException("Pet is not in a valid range ");
        }
    }
    public void getInfo(){
        System.out.println("Pets Name is "+getName()+" And gender is "+getGender()+" .its a nice "+getBreed()+" breed,"+getName()+" "+getYear()+" years old " );
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
