package my_shopping_system.buildName.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
