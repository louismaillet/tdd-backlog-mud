import java.util.ArrayList;
class Thing{
    String name;
    public Thing(String name){
        this.name = name;
    }
}
class Box{
    private ArrayList<Thing> contents = new ArrayList<Thing>();
    private boolean isOpen = false;

    public void add(Thing truc){
        this.contents.add(truc);
    }
    public boolean contains(Thing truc) {
        return contents.contains(truc);
    }
    public void remove(Thing truc) throws Exception {
        if (!contents.contains(truc)) {
            // Si l'objet n'est pas trouvé, on lance une exception
            throw new Exception("L'objet n'est pas dans la boîte.");
        }
        contents.remove(truc);
    }
    public void open() {
        isOpen = true;  
        System.out.println("La boîte est maintenant ouverte.");
    }
    public void close() {
        isOpen = false;  
        System.out.println("La boîte est maintenant fermée.");
    }
    public boolean isOpen() {
        return isOpen;
    }
}