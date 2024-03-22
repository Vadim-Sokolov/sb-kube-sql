package sb.sbkubesql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sb.sbkubesql.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
