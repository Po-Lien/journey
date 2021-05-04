package idv.cpl.springboot.dao;

import java.util.List;
import java.util.Map;

import idv.cpl.springboot.Vo.daysVo;
import idv.cpl.springboot.Vo.journeysVo;

//mybatis用的
public interface daysMapper {
	public List<daysVo> selectDays(String owner);
	
	public void insertDays(daysVo vo);
	
	public void updateDays(daysVo vo);
	
	public void deleteDays(int id);
	
	public List<Map> queryDays(Map parm);
}
