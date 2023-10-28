class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a notification: " + message);
    }

    @Override
    public String toString() {
        return name;
    }
}