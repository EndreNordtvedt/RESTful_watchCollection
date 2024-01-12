package com.watch.watchcollection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.watch.watchcollection.Entity.watches;

public interface watchesRepository extends JpaRepository<watches, Integer> {

}
