package idv.cpl.springboot.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import idv.cpl.springboot.Vo.daysVo;
import idv.cpl.springboot.Vo.journeysVo;

//JPA用的
public interface DaysRepository extends JpaRepository<daysVo, Long> {

	@Query(value = "select * from days inner join journeys on journeys.title_id = days.title_id where journeys.owner = ?1 and (days.del is null or days.del = '')", nativeQuery = true)
	List<daysVo> selectTitle(String owner);
	
	@Modifying
	@Transactional
	@Query(value = "update days set del='*' where days.title_id = ?1 ", nativeQuery = true)
	Integer deleteDays(Integer title_id);
	
	@Query(value = "select * from days a right join (select min(id) id from days group by title_id) b on b.id=a.id where title_id = ?1 and (del is null or del = '')", nativeQuery = true)
	daysVo selectDaysMin(Integer title_id);
	
	@Query(value = "select date from days a right join (select max(id) max_id from days group by title_id) b on b.max_id=a.id where title_id = ?1 and (del is null or del = '')", nativeQuery = true)
	String selectDaysMax(Integer title_id);
	
}
