public class Encapsulamiento {
    int id;
    String name;
    public Encapsulamiento(){

    }
    public Encapsulamiento(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name();
    }

    publi int getId(){
        return id();
    }
}
