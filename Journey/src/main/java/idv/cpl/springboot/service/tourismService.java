package idv.cpl.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.cpl.springboot.dao.TourismRepository;

@Service
public class tourismService {
	@Autowired
	TourismRepository tourismRepository;
}
