package h_interfaceSegregation.b_services;

public class OnlineStoreOrder {

    private NotificationService[] notifications;

    public OnlineStoreOrder(NotificationService... services) {
        this.notifications = services;
    }

    public void process() {
        for (NotificationService notification : notifications) {
            if (notification.isActive()) {
                notification.sendNotification();
            }
        }
    }
}
