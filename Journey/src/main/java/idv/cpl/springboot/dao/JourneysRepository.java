package idv.cpl.springboot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import idv.cpl.springboot.Vo.journeysVo;

//JPA用的
public interface JourneysRepository extends JpaRepository<journeysVo, Long> {
	
	
	@Query( value = "select title_id from journeys where title = ?1", nativeQuery = true)
	Integer selectTitleId(String title);
	
	@Query( value = "select * from journeys where owner = ?1 and title = ?2 order by title_id desc limit 1", nativeQuery = true)
	journeysVo findJourney(String owner, String title);
	
	@Query( value = "select * from journeys where owner = ?1 and (journeys.del is null or journeys.del = '')", nativeQuery = true)
	List<journeysVo> selectTitle(String owner);
	
	@Modifying
	@Transactional
	@Query(value = "update journeys set del='*' where journeys.title_id = ?1 ", nativeQuery = true)
	Integer deleteJourneys(Integer title_id);
	
	@Modifying
	@Transactional
	@Query( value= "insert into journeys(title, owner) value (?1, ?2)", nativeQuery = true)
	Integer addTitle(String title, String owner);
	
}
