import java.util.Random;


interface Monster{
    float attack();
}

class Zombie implements Monster{
    @Override
    public float attack(){
        return 5;
    }
}

class Vampire implements Monster{
    @Override
    public float attack(){
        return 10;
    }
}

class Dragon implements Monster {
    @Override
    public float attack(){
        return 20;
    }
}

class MonsterFactory {
    public static Monster createMonster(Random randint){
        int monster = randint.nextInt(3);
        switch (monster){
            case 0:
                return new Zombie();
            case 1:
                return new Vampire();
            case 2:
                return new Dragon();
            default:
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Monster mon_array[] = new Monster[5];
        float maxAtt = 0;
        for (int i = 0; i < mon_array.length;i++){
            mon_array[i] = MonsterFactory.createMonster(rand);
            maxAtt += mon_array[i].attack();
        }

        if (maxAtt > 50) {
            System.out.printf("Героят е победен! Обща атака на чудовищата : %.1f", maxAtt);
        } else {
            System.out.printf("Героят победи! Обща атака на чудовищата: %.1f", maxAtt);
        }

    }
}