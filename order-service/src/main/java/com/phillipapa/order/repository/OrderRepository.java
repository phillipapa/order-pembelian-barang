package com.phillipapa.order.repository;

import com.phillipapa.order.model.Order;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query(value = """
        SELECT
            o.*
        FROM
            orders o
        WHERE
            o.customer_id = :customerId
        ORDER BY
            o.id DESC
        """, nativeQuery = true)
    List<Order> findCustomers(@Param("customerId") Long customerId);
}
