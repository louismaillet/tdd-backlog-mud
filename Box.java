import java.util.ArrayList;

class Thing {
    String name;
    int volume;

    public Thing(String name) {
        this.name = name;
    }

    public Thing(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasName(String name) {
        return this.name.equals(name);
    }


}

class Box {
    private ArrayList<Thing> contents = new ArrayList<>();
    private boolean isOpen = false;
    private int capacity = -1;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int capacity() {
        return capacity;
    }

    public void add(Thing truc){
        
        this.contents.add(truc);
        }
    

    public boolean contains(Thing truc) {
        return contents.contains(truc);
    }

    public void remove(Thing truc)   {
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

    public String actionLook() {
        if (!isOpen) {
            return "La boîte est fermée.";
        }
        String phrase = "La boîte contient : ";
        for (Thing truc : contents) {
            phrase += truc.name + ", ";
        }
        return phrase;
    }

}
