package idv.cpl.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.cpl.springboot.Vo.daysVo;
import idv.cpl.springboot.Vo.journeysVo;
import idv.cpl.springboot.dao.DaysRepository;
import idv.cpl.springboot.dao.JourneysRepository;

@Service
public class daysService {
	@Autowired
	DaysRepository daysRepository;
	
	@Autowired
	JourneysRepository journeysRepository;
	
	public List<Map>getDays(String owner){
		List<Map> daysAll = new ArrayList<Map>();
		List<journeysVo> journey = journeysRepository.selectTitle(owner);
		List<daysVo> dayList = daysRepository.selectTitle(owner);
		for(int i = 0; i < journey.size(); i++) {
			Map<String, String> days = new HashMap<>();
			days.put("title", journey.get(i).getTitle());
			Integer titleId = journey.get(i).getTitleId();
			days.put("titleId", titleId.toString());
			daysVo daysMin = daysRepository.selectDaysMin(titleId);
			days.put("daysId", daysMin.getId().toString());
			days.put("fromDate", daysMin.getDate());
			days.put("week",daysMin.getWeek());
			days.put("day",daysMin.getDay());
			String endDate = daysRepository.selectDaysMax(titleId);
			days.put("endDate", endDate);
			daysAll.add(days);
		}
		
		
		
		return daysAll;
	}
}
