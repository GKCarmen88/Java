package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi = array, list, set, map

    @Test
    public void metodatest(){

      // numeCursantiArray();
       //numeCursantiLista();
        //exemplu1Map();
        //exemplu2Map();
        exemplu3Map();
    }

    //afisam numele cursantiilor de la curs
    public void numeCursantiArray(){
        String[] cursanti=new String[10];
        cursanti[0]="Carmen";
        cursanti[1]="Andrei";
        cursanti[2]="Adriana";
        cursanti[3]="Alex";
        cursanti[4]="Cristi";

        int index=0;
        while (index<cursanti.length){
            if (index<5){
                System.out.println("Numele cursantului este: " +cursanti[index]);
            }

            index++;
        }
    }

    public void numeCursantiLista(){
        List<String> cursanti=new ArrayList<>();
        cursanti.add("Carmen");
        cursanti.add("Andrei");
        cursanti.add("Adriana");
        cursanti.add("Alex");
        cursanti.add("Cristi");

        int index=0;
        while (index<cursanti.size()){
            System.out.println("Numele cursantului este: " + cursanti.get(index));
            index++;
        }

    }

    //Definim niste categorii de valori
    public void exemplu1Map(){
        Map<String,String> obiecte=new HashMap<>();
        obiecte.put("Telefon","iPhone");
        obiecte.put("Masina","Toyota");
        obiecte.put("Fruct","Mar");

        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea pe baza cheii este: " + obiecte.get(key));
        }
    }

    //Afisam orasele cu tara din care provin
    public void exemplu2Map(){
        Map<String,List<String>> tariOrase=new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Bistrita", "Bacau");
        List<String> oraseItalia = Arrays.asList("Bologna", "Milano", "Rimini", "Roma");
        List<String> oraseSpania = Arrays.asList("Valencia", "Barcelona", "Madrid");

        tariOrase.put("Romania", oraseRomania);
        tariOrase.put("Italia", oraseItalia);
        tariOrase.put("Spania", oraseSpania);

        for (String key: tariOrase.keySet()){
            System.out.println("Tara este : " + key);
            System.out.println("Orasele sunt: " + tariOrase.get(key));
        }
        //tema ne uitam pe filmare + metoda exemplu3map - carte de retete pt gatit
    }
    //Afisam ingredientele uneor retete
    public void exemplu3Map(){
        Map<String,List<String>> reteteCuIngrediente = new HashMap<>();

        List<String> ingredienteSupaDeSalataVerde = Arrays.asList("2 linguri ulei", "100 gr Slanina", "2 Salate verzi", "4 catei Usturoi", "3 L Apa", "Lapte batut");
        List<String> ingredienteAperitivCaldCuBacon = Arrays.asList("250gr Bacon", "100 gr Cascaval", "250 gr Faina alba", "50 ml Ulei", "3 oua");
        List<String> ingredienteTartaCuCapsuni = Arrays.asList("250gr Capsuni", "3 cani/250 ml Faina alba", "2 cani/250 ml Zahar", "1 cana/250 ml Ulei", "1 cana/250 ml lapte", "1 pliculet Praf de copt", "1 pliculet Zahar Vanilat", "5 oua");

        reteteCuIngrediente.put("Supa De Salata Verde", ingredienteSupaDeSalataVerde);
        reteteCuIngrediente.put("Aperitiv Cald Cu Bacon", ingredienteAperitivCaldCuBacon);
        reteteCuIngrediente.put("Tarta Cu Capsuni", ingredienteTartaCuCapsuni);

        for (String key: reteteCuIngrediente.keySet()){
            System.out.println("Reteta este:" + key );
            System.out.println("Ingredientele sunt:" + reteteCuIngrediente.get(key));
        }

    }
}
