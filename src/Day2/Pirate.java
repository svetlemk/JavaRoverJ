package Day2;

public class Pirate {
    public static void main (String[] args){

        double treasure = 1000;
        double shipOwnerShare = treasure/2;
        double captainShare = treasure/4;
        double crewShare = treasure/4;
        int creSize = 14;
        double eachCrewGets = crewShare/(creSize+1);

        System.out.println("eachCrewGets = " + eachCrewGets);
        System.out.println("captainShare = " + captainShare);
        System.out.println("shipOwnerShare = " + shipOwnerShare);

        double total = eachCrewGets*(creSize+1) + captainShare + shipOwnerShare;
        System.out.println("total = " + total);



/*Создать программу дележа добычи на пиратском корабле.
По обычаю, половина добычи идет владельцу корабля,
половина оставшегося — капитану,
 остальное делится поровну между всеми членами команды,
 включая капитана.

Размер добычи (например, в пиастрах) и
количество пиратов на корабле задать переменными.

Вывести на экран кому сколько пиастров полагается
Сколько получит капитан (Джек Воробей, естественно),
 если он утверждает, что корабль принадлежит ему?
*/

    }

}
