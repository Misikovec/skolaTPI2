package druhypolrok.tyzden17;
//hi
public class OpakovanieIfElse {

    public static void main(String[] args) {
        naseIfElse(10);
        naseIfElse(14);
        naseIfElse(20);
    }

    public static void naseIfElse(int gay){
        int hodina = gay;

        if(hodina < 12){
            System.out.println("je" + hodina + "hodin" + " a je Dopoludna");
        }else if (hodina < 15){
            System.out.println("je" + hodina + "hodin" + " a je Popoludnie");
        }else{
            System.out.println("noc");
        }
    }
}
