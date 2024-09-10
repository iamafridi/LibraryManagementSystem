public abstract class LibraryUser {
    private String name;
    private String id;
    private String userType;

    public LibraryUser(String name, String id, String userType) {
        this.name = name;
        this.id = id;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getUserType() {
        return userType;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", User Type: " + userType;
    }
}
