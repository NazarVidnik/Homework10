package part1;
public class Assignment10Part1Main {
void main() {

    Books Name_of_the_wind = new Books("Name of the wind", 800,"heroic/epic fantasy",800);
    Books Half_a_King = new Books("Half a King", 296 ,"adventure fantasy with a Scandinavian flavor", 216);
    ComputerGames CupHead = new ComputerGames(279, 13, "Cuphead ",true, "Run and gun, platformer, boss rush");

    CupHead.setHoursSpend(18);
    Half_a_King.setcurentPage(296);

    CupHead.printInfo();
    Half_a_King.printInfo();
    Name_of_the_wind.printInfo();
}
}