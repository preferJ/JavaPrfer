package day29_2_DTO2;

public class HumanMain {
	public static void main(String[] args) {
		
	
	
	HumanDTO h1 = new HumanDTO(1L,"사람1",20);
	HumanDTO h2 = new HumanDTO(2L,"사람2",20);
	HumanDTO h3 = new HumanDTO(3L,"사람3",20);
	HumanDTO h4 = new HumanDTO(3L,"사람3",20);
	
	HumanSV hs = new HumanSV();
	HumanRe hr = new HumanRe();
	
	
	
	hs.save(h1);
	hs.save(h2);
	hs.save(h3);
	hs.save(h4);
	hs.findAll();

	
	//id가 1인 하나의 사람만 조회
	long findID = 1L;
	
	System.out.println("1L 출력~~~");
	hs.findOne(findID);
	
	
	
	// id가 1인 사람 삭제
	System.out.println("한명 ID 1 삭제 후");
	hs.deleteOne(findID);
	hs.findAll();
	
	//id가 3인 사람의 이름을 자바왕 으로 바꾸자.
	hs.update(3L,"자바왕");
	
	System.out.println( " 자바왕 등장 ");
	hs.findAll();
	
	
	
}
	
}
