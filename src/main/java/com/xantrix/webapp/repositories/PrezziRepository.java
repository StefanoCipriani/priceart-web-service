package com.xantrix.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xantrix.webapp.entities.DettListini;

public interface PrezziRepository extends JpaRepository<DettListini, Integer> {

	public DettListini findByCodArtAndIdList(String codArt, String idList); 
	@Modifying
	@Query(value = "DELETE FROM dettlistini WHERE CodArt = :codart AND IdList = :idlist", nativeQuery = true)
	void delRowDettList(@Param("codart") String codArt, @Param("idlist") String idList);
}
