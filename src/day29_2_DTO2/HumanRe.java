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

	void deleteOne(long id) {
		for (int i = 0; i < humanList.size(); i++) {
			if(humanList.get(i).getId() == id) {
				humanList.remove(i);
			}
		}
	}

	void update(long id, String cn) {
		for (int i = 0; i < humanList.size(); i++) {
			if(humanList.get(i).getId() == id) {
				humanList.get(i).setName(cn);
			}
		}

	}

}// 클래스 끝
