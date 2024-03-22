package sb.sbkubesql.service;

import org.springframework.stereotype.Service;
import sb.sbkubesql.model.Order;
import sb.sbkubesql.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository orderRepository) {
        this.repository = orderRepository;
    }

    public Order addOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getOrders() {
        return repository.findAll();
    }

    public Order getOrderById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid id : " + id));
    }
}
