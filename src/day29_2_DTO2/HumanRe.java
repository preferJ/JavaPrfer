package day29_2_DTO2;

import java.util.ArrayList;
import java.util.List;

import day29_1_DTO.PhoneDTO;

public class HumanRe {

	static List<HumanDTO> humanList = new ArrayList<>();

	void save(HumanDTO h) {
		humanList.add(h);
	}

	public List<HumanDTO> findAll() {
		return humanList;
	}

	public List<HumanDTO> findOne(long f) {
		return humanList;
	}

	void deleteOne(long f) {
		int del = 0;
		for (HumanDTO h : humanList) {
			if(h.getId() == f) {
				humanList.remove(del);
				del++;
			}
		}


	}
	
	


}
