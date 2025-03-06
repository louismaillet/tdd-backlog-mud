class Thing {
    private String name;
    private int volume;

    public Thing(String name) {
        this.name = name;
    }

    public Thing(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public int volume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasName(String name) {
        return this.name.equals(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
