package day29_2_DTO2;

import java.util.ArrayList;
import java.util.List;

public class HumanSV {
	
	void save(HumanDTO h){
		HumanRe hr = new HumanRe();
		hr.save(h);
	}
	
	void findAll() {
		List<HumanDTO> hl = new ArrayList<>();
		HumanRe hr = new HumanRe();
		hl = hr.findAll();
		System.out.println(hl);
	}
	
	void findOne(long f) {
		HumanRe hr = new HumanRe();
		List<HumanDTO> hl = new ArrayList<>();
		hl = hr.findOne(f);
		for(HumanDTO h : hl) {
			if(h.getId() == f) {
				System.out.println(h);
			}
		}
	}
	
	void deleteOne(long f) {
		HumanRe hr = new HumanRe();
		hr.deleteOne(f);
	}
	
	

}
