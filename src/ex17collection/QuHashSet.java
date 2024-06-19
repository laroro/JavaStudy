package ex17collection;

import java.util.*;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avengers other = (Avengers) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");

		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);

		System.out.println("[최초 전체 정보출력]");
		for (Avengers av : set) {
			System.out.println(av.toString());
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세욤:");
		String inputName = scanner.nextLine();

		Iterator<Avengers> iterator = set.iterator();
		boolean found = false;
		while (iterator.hasNext()) {
			Avengers avenger = iterator.next();
			if (avenger.getName().equals(inputName)) {
				System.out.println(avenger.toString());
				System.out.println("요청하신 정보를 찾았습니다");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("해당 영웅은 없어요ㅜㅜ");
		}

		scanner.close();
	}
}
