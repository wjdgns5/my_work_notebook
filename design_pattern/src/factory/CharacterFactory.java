package factory;

// 다형성

/**
 * InnerCharacterFactory
 */
interface Character {
    void attack(); // 각 캐릭터의 공격 방식을 정의하는 메서드
}

// 전사 클래스
class Warrior implements Character {

    @Override
    public void attack() {
        System.out.println("전사가 칼로 공격을 합니다.");
    }
} // end of Warrior

// 마법사 클래스
class Mage implements Character {

    @Override
    public void attack() {
        System.out.println("마법사가 화염구를 발사합니다.");
    }
} // end of Mage

// 궁수 클래스
class Archer implements Character {

    @Override
    public void attack() {
        System.out.println("궁수가 화살을 쏩니다.");
    }
} // end of Archer

// 팩토리 클래스 - 구체적인 캐릭터 클래스를 생성하는 로직을 캡슐화 한다.
public class CharacterFactory {

    public Character createCharacter(String job) {
        if (job.equalsIgnoreCase("warrior")) {
            return new Warrior();
        } else if (job.equalsIgnoreCase("mage")) {
            return new Mage();
        } else if (job.equalsIgnoreCase("archer"))
            return new Archer();
        return null;
    }
} // end of CharacterFactory
