import com.company.Hero;

public class magicDoor {
    Hero hero1 = new Hero(300, 60,"begat1");
    Hero hero2 = new Hero(350,70,"begat2");
    Hero hero3 = new Hero(400,80,"begat3");
    Hero hero4 = new Hero(450,90,"begat4");
    protected Hero [] getHero() {
        Hero[] heroes = {hero1,hero2,hero3,hero4};
        return heroes;


    }


}
