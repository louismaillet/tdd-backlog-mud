import java.util.ArrayList;
class Box {
    private ArrayList<Thing> contents = new ArrayList<>();
    private boolean isOpen = false;
    private int capacity;

    public Box(boolean isOpen, int capacity) {
        this.isOpen = isOpen;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int capacity() {
        return capacity;
    }

    public void add(Thing truc){
        if (hasRoomFor(truc)) {
            this.contents.add(truc);
        } else {
            System.out.println("La boîte est pleine.");
        }
    }  

    public boolean contains(Thing truc) {
        return contents.contains(truc);
    }

    public void remove(Thing truc) {
        contents.remove(truc);
    }            
    
    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
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
            phrase += truc.getName() + ", ";
        }
        return phrase;
    }

    public String actionLookV2() {
        if (!isOpen) {
            return "La boîte est fermée.";
        }
        ArrayList<String> names = new ArrayList<>();
        for (Thing truc : contents) {
            names.add(truc.getName());
        }
        return "La boîte contient : " + String.join(", ", names);
    }
    
    public boolean hasRoomFor(Thing t) {
        if ( this.capacity == -1){
            return true;
        }
        int totalVolume = 0;
        for (Thing truc : contents) {
            totalVolume += truc.volume();
        }
        return (totalVolume + t.volume()) <= this.capacity;
    }

    public boolean actionAdd(Thing t) {
        if (this.isOpen()) {
            if (hasRoomFor(t)) {
                add(t);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public Thing find(String name) {
        if (!isOpen) {
            return null;
        }
        for (Thing truc : contents) {
            if (truc.hasName(name)) {
                return truc;
            }
        }
        return null;
    }
}
