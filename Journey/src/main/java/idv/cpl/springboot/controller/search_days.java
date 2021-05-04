package idv.cpl.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import idv.cpl.springboot.Vo.daysVo;
import idv.cpl.springboot.Vo.journeysVo;
import idv.cpl.springboot.Vo.tourismVo;


//mybatis用的
//@RestController
public class search_days {
	
//	@Autowired
//	idv.cpl.springboot.dao.daysMapper daysMapper;
//	
//	
//	@Autowired
//	idv.cpl.springboot.dao.journeysMapper journeysMapper;
//	
//	
//	@Autowired
//	idv.cpl.springboot.dao.tourismMapper tourismMapper;
//	
//
//	
//	@GetMapping(value = "/json/days/{owner}", produces = "application/json; charset=utf-8")
//	public List<daysVo> selectDays(@PathVariable("owner") String owner) {
//		
//		System.out.println("selectDays:" + daysMapper.selectDays(owner));
//
//		return daysMapper.selectDays(owner);
//	}
//	
//	@GetMapping(value = "days/doDelete/{titleId}", produces = "application/json; charset=utf-8")
//	public Map<String,String> Delete(@PathVariable( value="titleId") int titleId) {
//		String mes = "";
//		daysMapper.deleteDays(titleId);
//		
//		Map<String,String> a = new HashMap<>();
//		mes = "刪除了titleId:" + titleId;
//		a.put("mes",mes);
//		return a;
//	}
//	
//	@PostMapping(value="days/doInsert", produces = "application/json; charset=utf-8")
//	public Map<String,String> Insert(@RequestParam( value="date", required=false) String date,
//			@RequestParam(value="day",required=false) String day,
//			@RequestParam(value="week", required=false) String week,
//			@RequestParam(value="title", required=false) String title,
//			@RequestParam(value="owner") String owner){
//		String mes = "";
//		
//		journeysVo journey = new journeysVo();
//		journey.setOwner(owner);
//		journey.setTitle(title);
//		
//		journeysMapper.insertJourneys(journey);
//		Integer titleId = journeysMapper.selectTitle(title);
//		
//		
//		daysVo days = new daysVo();
//		days.setDate(date);
//		days.setDay(day);
//		days.setWeek(week);
//		days.setTitleId(titleId);
//		
//		daysMapper.insertDays(days);
//		
//		Map<String,String> a = new HashMap<>();
//		mes = "新增了days ~~~";
//		a.put("mes", mes);
//		return a;
//	}
//	
//	@GetMapping(value="updateAll")
//	public Map<String, String> doUpdate(daysVo day, journeysVo journey, tourismVo tourism){
//		String mes = "";
//		
//		daysVo dvo = new daysVo();
//		dvo.setDate(day.getDate());
//		dvo.setDay(day.getDay());
//		dvo.setTitleId(day.getTitleId());
//		dvo.setWeek(day.getWeek());
//		
//		daysMapper.updateDays(dvo);
//		
//		journeysVo jvo = new journeysVo();
//		jvo.setOwner(journey.getOwner());
//		jvo.setTitle(journey.getTitle());
//		
//		journeysMapper.updateJourneys(jvo);
//		
//		tourismVo tvo = new tourismVo();
//		tvo.setAddress(tourism.getAddress());
//		tvo.setDaysId(tourism.getDaysId());
//		tvo.setEndTime(tourism.getEndTime());
//		tvo.setPlace(tourism.getPlace());
//		tvo.setStartTime(tourism.getStartTime());
//		tvo.setStayTime(tourism.getStayTime());
//		
//		tourismMapper.updateTourism(tvo);
//		
//		Map<String, String> tip = new HashMap<>();
//		tip.put("更新全部資料!!", mes);
//		return tip;
//	}
}
