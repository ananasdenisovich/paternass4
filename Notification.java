class Notification implements Product {
    private String message;
    public Notification(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}