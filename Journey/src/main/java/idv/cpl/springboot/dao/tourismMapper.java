package idv.cpl.springboot.dao;

import java.util.List;
import java.util.Map;

import idv.cpl.springboot.Vo.tourismVo;

//mybatis用的
public interface tourismMapper {
	public tourismVo selectTourism(tourismVo vo);
	
	public void insertTourism(tourismVo vo);
	
	public void updateTourism(tourismVo vo);
	
	public void deleteTourism(tourismVo vo);
	
	public List<Map> queryTorism(Map parm);
}
