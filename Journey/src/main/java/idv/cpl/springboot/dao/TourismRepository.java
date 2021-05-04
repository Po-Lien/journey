package idv.cpl.springboot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import idv.cpl.springboot.Vo.tourismVo;

//JPA用的
public interface TourismRepository extends JpaRepository<tourismVo, Long> {
	
	@Query( value = "update tourism set del='*' where tourism.daysId = ?1", nativeQuery = true)
	Map<String, String> deleteDayTourism(Integer daysId);
	
	@Query( value ="update tourism set del='*' where tourism.Id = ?1", nativeQuery = true)
	Map<String, String> deleteTourism(Integer Id);
}
