package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by david_000 on 29.05.2016.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
