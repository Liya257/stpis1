
package com.lab.stpis1.repository;

import com.lab.stpis1.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Sales,Long> {
}

