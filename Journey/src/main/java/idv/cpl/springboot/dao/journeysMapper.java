package idv.cpl.springboot.dao;

import java.util.List;
import java.util.Map;

import idv.cpl.springboot.Vo.journeysVo;

//mybatis用的
public interface journeysMapper {
	public journeysVo selectJourneys(Integer id);
	
	public Integer selectTitle(String title);
	
	public void insertJourneys(journeysVo vo);
	
	public void updateJourneys(journeysVo vo);
	
	public void deleteJourneys(journeysVo vo);
	
	public List<Map> queryJourneys(Map parm);
}
