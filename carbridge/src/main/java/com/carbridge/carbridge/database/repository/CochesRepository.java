package com.carbridge.carbridge.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.carbridge.carbridge.database.domain.Coche;

@Repository
public interface CochesRepository extends JpaRepository<Coche,Long> {

//    @Query("select u from CochesEntity u where u.cochesEntity_id = ?1")
//    public List<Coche> getCocheById(Long id);
//    
//    @Query("SELECT C, M, P FROM CochesEntity C, MarcasEntity M, PreciosEntity P where C.cochesEntity_id = M.cochesId AND C.cochesEntity_id = P.cochesId AND (TO_DATE(:fecha,'yyyymmdd') BETWEEN P.fecha_inicio AND P.fecha_fin) AND P.cochesId = :id")  
//    public List<Coche> getCocheByIdAndBrand(Long id, String fecha);
//    
//    @Query("SELECT C, M, P FROM CochesEntity C, MarcasEntity M, PreciosEntity P where C.cochesEntity_id = M.cochesId AND C.cochesEntity_id = P.cochesId AND P.cochesId = :filter")
//    public List<Coche> getConstructedClause(String filter);

}
