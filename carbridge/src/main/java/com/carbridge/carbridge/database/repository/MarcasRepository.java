package com.carbridge.carbridge.database.repository;

import com.carbridge.carbridge.database.domain.Marca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcasRepository extends JpaRepository<Marca,Long>{

}
