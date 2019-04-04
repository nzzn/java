package java14;

import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {

		HashMap mem = new HashMap();

		mem.put("100번", "김데이");
		mem.put("200번", "김사전");
		mem.put("300번", "김구조");
		mem.put("400번", "김자료");

		mem.remove("200번");
		mem.replace("300번", "김충성");

		System.out.println(mem);

	}
}