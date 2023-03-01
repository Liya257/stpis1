/*
package com.lab.stpis1.repository;

import com.lab.stpis1.entity.FashUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<FashUser,Long> {

        // @Query("select u from Users u where u.username=?1")
     //   Optional<FashUser> getByUsername(String username);

        FashUser findByUsername(String username);
        //Optional<FashUser> findUserByUsername(String username);
    }


*/
