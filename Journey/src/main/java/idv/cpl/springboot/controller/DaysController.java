package idv.cpl.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import idv.cpl.springboot.Vo.daysVo;
import idv.cpl.springboot.Vo.journeysVo;
import idv.cpl.springboot.dao.DaysRepository;
import idv.cpl.springboot.dao.JourneysRepository;
import idv.cpl.springboot.dao.TourismRepository;
import idv.cpl.springboot.service.daysService;

@RestController
public class DaysController {
	//透過 @RequestMapping 指定從/會被對應到此addMemberPage()方法
//	@Autowired
//	MemberAccount memberAccount;
//	
//	@Autowired
//	MemberService memberService;
//	
	@Autowired
	DaysRepository daysRepository;
	
	@Autowired
	daysService dayService;
	
	@Autowired
	JourneysRepository journeysRepository;
	
	@Autowired
	TourismRepository tourismRepository;
	
	@GetMapping("/findDays/{owner}")
	@CrossOrigin("http://localhost:4200")
	public List<Map> findDays(@PathVariable("owner") String owner){
		
		List<Map> days = dayService.getDays(owner);
		
		return days;
	}
	
	//增days
	@CrossOrigin("http://localhost:4200")
	@PostMapping(value="days/doInsert", produces = "application/json; charset=utf-8")
	public Map<String, String> daysInsert(@RequestBody ArrayList<daysVo> days){
		String mes = "";
		
		System.out.println("days:" + days);
		daysRepository.saveAll(days);
		
		mes = "新增了!";
		
		Map<String, String> tip = new HashMap<>();
		tip.put("mes", mes);
		
		return tip;
	}
	
	//只有增title
	@CrossOrigin("http://localhost:4200")
	@PostMapping(value="journeys/doInsert", produces= "application/json; charset=utf-8")
	public Map<String, String> journeysInsert(@RequestParam(value="journey", required=false) journeysVo journey){
		String mes = "";
		
		
		journeysRepository.save(journey);
		
		mes = "新增了!";
		
		Map<String, String> tip = new HashMap<>();
		tip.put("mes", mes);
		
		return tip;
	}
	
	//有增title也有查
	@PostMapping(value="/journeys/selectTitleId")
	@CrossOrigin("http://localhost:4200")
	public journeysVo seletTitleId(@RequestBody journeysVo journey) {
		
//		journeysVo journeys = new journeysVo();
//		journeys.setOwner(journey.getOwner());
//		journeys.setTitle(journey.getTitle());
		System.out.println("journey:" + journey);
		journeysRepository.addTitle(journey.getTitle(), journey.getOwner());
		journeysVo journeyFind = journeysRepository.findJourney(journey.getOwner(), journey.getTitle());
		return journeyFind;
	}
	
	@DeleteMapping ("days/doDelete/{titleId}")
	@CrossOrigin("http://localhost:4200")
	public Map<String, String> daysDelete(@PathVariable("titleId") Integer title_id){
		String mes = "";
		
		daysRepository.deleteDays(title_id);
		journeysRepository.deleteJourneys(title_id);
		
		Map<String, String> tip = new HashMap<>();
		
		mes = "刪除成功";
		tip.put("mes", mes);
		
		
		return tip;
	}
	
	
	
	
	
	
	
	
}
