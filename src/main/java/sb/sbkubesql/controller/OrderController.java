package sb.sbkubesql.controller;

import org.springframework.web.bind.annotation.*;
import sb.sbkubesql.model.Order;
import sb.sbkubesql.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService orderService) {
        this.service = orderService;
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return service.addOrder(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return service.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        return service.getOrderById(id);
    }
}
