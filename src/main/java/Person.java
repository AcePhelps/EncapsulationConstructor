public class Person {
    private String name;
    private String lastName;
    private int year;


    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public Person() {
    }

    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return this.name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){

        return this.getLastName();
    }
    public void setYear(int year){
        if(year>2021 || year<1900 ){
            throw new IllegalArgumentException("Wrong year of birth");
        }
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public void printInfo(){
        System.out.println("Name: "+name+"\nlastname: " +lastName+ "\nyear: "+year);
    }
}
