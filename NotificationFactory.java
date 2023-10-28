class NotificationFactory implements Factory {
    @Override
    public Product createProduct(String message) {
        return new Notification(message);
    }
}
