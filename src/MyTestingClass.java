class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Custom hashCode implementation
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
    }

    // Equals method should also be overridden for correct functioning of the hash table

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyTestingClass other = (MyTestingClass) obj;
        return id == other.id && name.equals(other.name);
    }
}