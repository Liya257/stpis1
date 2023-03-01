
package com.lab.stpis1.repository;

import com.lab.stpis1.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository extends JpaRepository<Transport,Long> {
}

