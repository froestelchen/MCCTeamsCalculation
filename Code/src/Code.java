import java.util.ArrayList;

public class Code {
    final static int MIN = 8546;
    final static int MAX = 9280;
    final static int TEAMS = 10;

    public static void main(String args[]){
        ArrayList<Contestant> people = new ArrayList<Contestant>();
        initialize(people);

        //calcMin(people);
        //calcMax(people);
        calcMinMax(people);


    }

    public static void calcMinMax(ArrayList<Contestant> people){
        for(int i = 0; i < people.size(); i++){
            ArrayList<Contestant> people2 = (ArrayList<Contestant>) people.clone();
            Contestant one = people.get(i);
            people2.remove(i);
            for(int j = 0; j < people2.size(); j++){
                ArrayList<Contestant> people3 = (ArrayList<Contestant>) people2.clone();
                Contestant two = people2.get(j);
                people3.remove(j);
                for(int k = 0; k < people3.size(); k++){
                    ArrayList<Contestant> people4 = (ArrayList<Contestant>) people3.clone();
                    Contestant three = people3.get(k);
                    people4.remove(k);
                    for(int l = 0; l < people4.size(); l++){
                        ArrayList<Contestant> people5 = (ArrayList<Contestant>) people4.clone();
                        Contestant four = people4.get(l);
                        people5.remove(l);
                        int sum = one.getScore() + two.getScore() + three.getScore() + four.getScore();
                        if(sum == MIN){
                            calcmMax(people5, one, two, three, four, sum);
                        }
                    }
                    people4.add(three);
                }
                people3.add(two);
            }
            people2.add(one);
        }
    }
    public static void calcmMax(ArrayList<Contestant> people, Contestant one, Contestant two, Contestant three, Contestant four, int sum1){
        for(int i = 0; i < people.size(); i++) {
            ArrayList<Contestant> people2 = (ArrayList<Contestant>) people.clone();
            Contestant five = people.get(i);
            people2.remove(i);
            for (int j = 0; j < people2.size(); j++) {
                ArrayList<Contestant> people3 = (ArrayList<Contestant>) people2.clone();
                Contestant six = people2.get(j);
                people3.remove(j);
                for (int k = 0; k < people3.size(); k++) {
                    ArrayList<Contestant> people4 = (ArrayList<Contestant>) people3.clone();
                    Contestant seven = people3.get(k);
                    people4.remove(k);
                    for (int l = 0; l < people4.size(); l++) {
                        Contestant eight = people4.get(l);
                        int sum2 = five.getScore() + six.getScore() + seven.getScore() + eight.getScore();
                        if (sum2 == MAX) {
                            System.out.println("(" + one + " " + two + " " + three + " " + four + ": " + sum1 + "), (" + five + " " + six + " " + seven + " " + eight + ": " + sum2 + ")");
                        }
                    }
                    people4.add(seven);
                }
                people3.add(six);
            }
            people2.add(five);
        }
    }

    public static void calcMax(ArrayList<Contestant> people){
        for(int i = 0; i < people.size(); i++) {
            ArrayList<Contestant> people2 = (ArrayList<Contestant>) people.clone();
            Contestant one = people.get(i);
            people2.remove(i);
            for (int j = 0; j < people2.size(); j++) {
                ArrayList<Contestant> people3 = (ArrayList<Contestant>) people2.clone();
                Contestant two = people2.get(j);
                people3.remove(j);
                for (int k = 0; k < people3.size(); k++) {
                    ArrayList<Contestant> people4 = (ArrayList<Contestant>) people3.clone();
                    Contestant three = people3.get(k);
                    people4.remove(k);
                    for (int l = 0; l < people4.size(); l++) {
                        Contestant four = people4.get(l);
                        int sum = one.getScore() + two.getScore() + three.getScore() + four.getScore();
                        if (sum == MAX) {
                            System.out.println("(" + one + " " + two + " " + three + " " + four + ": " + sum + ")");
                        }
                    }
                    people4.add(three);
                }
                people3.add(two);
            }
            people2.add(one);
        }
    }
    public static void calcMin(ArrayList<Contestant> people){
        for(int i = 0; i < people.size(); i++){
            ArrayList<Contestant> people2 = (ArrayList<Contestant>) people.clone();
            Contestant one = people.get(i);
            people2.remove(i);
            for(int j = 0; j < people2.size(); j++){
                ArrayList<Contestant> people3 = (ArrayList<Contestant>) people2.clone();
                Contestant two = people2.get(j);
                people3.remove(j);
                for(int k = 0; k < people3.size(); k++){
                    ArrayList<Contestant> people4 = (ArrayList<Contestant>) people3.clone();
                    Contestant three = people3.get(k);
                    people4.remove(k);
                    for(int l = 0; l < people4.size(); l++){
                        Contestant four = people4.get(l);
                        int sum = one.getScore() + two.getScore() + three.getScore() + four.getScore();
                        if(sum == MIN){
                            System.out.println("(" + one + " " + two + " " + three + " " + four + ": " + sum + ")");
                        }
                    }
                    people4.add(three);
                }
                people3.add(two);
            }
            people2.add(one);
        }
    }

    private static void initialize(ArrayList<Contestant> people) {
        people.add(new Contestant("BBPaws", 1401));
        people.add(new Contestant("Bitzel", 2372));
        people.add(new Contestant("Cpt.Puffy", 1878));
        people.add(new Contestant("Cpt.Sparklez", 2374));
        people.add(new Contestant("ConnorEatsPants", 959));
        people.add(new Contestant("Cubfan", 1701));
        people.add(new Contestant("Calvan", 2546));
        people.add(new Contestant("DanTDM", 2114));
        people.add(new Contestant("Wahzdah", 1599));
        people.add(new Contestant("Dream", 2833));
        people.add(new Contestant("Drgluon", 456));
        people.add(new Contestant("F1NN5TER", 1725));
        people.add(new Contestant("FalseSymmetry", 2347));
        people.add(new Contestant("FlorianFluke", 2163));
        people.add(new Contestant("Fruitberries", 3079));
        people.add(new Contestant("Fundy", 2474));
        people.add(new Contestant("Fwhip", 2059));
        people.add(new Contestant("George", 2127));
        people.add(new Contestant("Gizzy", 1767));
        people.add(new Contestant("Graser", 2008));
        people.add(new Contestant("Grian", 2308));
        people.add(new Contestant("HBomb", 2821));
        people.add(new Contestant("IHasCupquake", 1032));
        people.add(new Contestant("Jevin", 1654));
        people.add(new Contestant("Illumina", 2849));
        people.add(new Contestant("InTheLittleWood", 1766));
        people.add(new Contestant("Iskall", 2158));
        people.add(new Contestant("JackSucksAtLife", 1208));
        people.add(new Contestant("JamesCharles", 708));
        people.add(new Contestant("Jameskii", 1658));
        people.add(new Contestant("JamesTurner", 734));
        people.add(new Contestant("JCtheCaster", 2614));
        people.add(new Contestant("JeromeASF", 1671));
        people.add(new Contestant("Jestanii", 1493));
        people.add(new Contestant("JoeyGraceffa", 347));
        people.add(new Contestant("KaraCorvus", 1806));
        people.add(new Contestant("KarlJacobs", 1487));
        people.add(new Contestant("KaterineElizabeth", 1430));
        people.add(new Contestant("Burren", 2142));
        people.add(new Contestant("Krinios", 2680));
        people.add(new Contestant("Krtzyy", 3049));
        people.add(new Contestant("KryticZeuz", 1217));
        people.add(new Contestant("LaurenZSide", 1134));
        people.add(new Contestant("ShadowLady", 1365));
        people.add(new Contestant("Ludwig", 1371));
        people.add(new Contestant("Marielitai", 886));
        people.add(new Contestant("Mefs", 2069));
        people.add(new Contestant("MichaelMC", 1692));
        people.add(new Contestant("MiniMuka", 1936));
        people.add(new Contestant("NettyPlays", 1351));
        people.add(new Contestant("Nihachu", 1102));
        people.add(new Contestant("PEARLBYTEZ", 705));
        people.add(new Contestant("Pearl", 1930));
        people.add(new Contestant("PeteZahHut", 3164));
        people.add(new Contestant("Philza", 2839));
        people.add(new Contestant("Plumbella", 766));
        people.add(new Contestant("Pokimane", 676));
        people.add(new Contestant("Punz", 2649));
        people.add(new Contestant("Quackity", 1365));
        people.add(new Contestant("Quig", 2471));
        people.add(new Contestant("Rafessor", 2120));
        people.add(new Contestant("Rendog", 1425));
        people.add(new Contestant("RIPmika", 699));
        people.add(new Contestant("RTGame", 1923));
        people.add(new Contestant("RyGuyRocky", 2116));
        people.add(new Contestant("Sapnap", 2886));
        people.add(new Contestant("SB737", 2413));
        people.add(new Contestant("ScotGrisworld", 869));
        people.add(new Contestant("Seapeekay", 2063));
        people.add(new Contestant("Shubble", 2001));
        people.add(new Contestant("Scott", 2403));
        people.add(new Contestant("Smallishbeans", 2066));
        people.add(new Contestant("Solidarity", 1970));
        people.add(new Contestant("Spifey", 1679));
        people.add(new Contestant("Steph0sims", 533));
        people.add(new Contestant("Strawburry", 1183));
        people.add(new Contestant("Sylvee", 1641));
        people.add(new Contestant("TankMatt", 1642));
        people.add(new Contestant("TapL", 2827));
        people.add(new Contestant("Technoblade", 3112));
        people.add(new Contestant("Eret", 1998));
        people.add(new Contestant("OrionSound", 1814));
        people.add(new Contestant("Tommy", 2338));
        people.add(new Contestant("ToxxxicSupport", 824));
        people.add(new Contestant("Tubbo", 2688));
        people.add(new Contestant("Vikkstar", 2660));
        people.add(new Contestant("Vixella", 564));
        people.add(new Contestant("VoiceOverPete", 857));
        people.add(new Contestant("WilburSoot", 1967));
        people.add(new Contestant("Wisp", 2048));
        people.add(new Contestant("Wolv", 1643));
        people.add(new Contestant("Yammy", 1582));
    }

}
