import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CotxeMapsStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap <String, Cotxe> mapa = new TreeMap<String, Cotxe>();
		//Afegim els 8 objectes
		mapa.put("1234 AAA", new Cotxe("Alfa Romeo", "Giulia", 2900, 6));
		mapa.put("2321 BBB", new Cotxe("Seat", "Ibiza", 1200, 3));
		mapa.put("8232 FFF", new Cotxe("Ford", "Focus", 2000, 4));
		mapa.put("3311 FFF", new Cotxe("Ford", "Mondeo", 2200, 4));
		mapa.put("9381 LLL", new Cotxe("Seat", "Leon", 1600, 4));
		mapa.put("B 9011 XC", new Cotxe("Hyundai", "Atos", 1500, 3));
		mapa.put("9234 BHG", new Cotxe("Hyundai", "Santa Fe", 3000, 6));
		mapa.put("9216 CKK", new Cotxe("Hyundai", "Accent", 2900, 4));
		
	}
	
	public static void removeE(Map <String, Cotxe> mapa) {
		ArrayList<String> car = new ArrayList<String>();
		for(Map.Entry<String, Cotxe> entry : mapa.entrySet()) {
			if(entry.getValue().getCilindrada() > 2500) {
				car.add(entry.getKey());
			}
		}
		for (String clau : car) {
			mapa.remove(clau);
		}
	}
	public static ArrayList<Cotxe> ncil(Map <String,Cotxe> mapa, int cilindres) {
		ArrayList<Cotxe> car = new ArrayList<Cotxe>();
		for(Map.Entry<String, Cotxe> entry : mapa.entrySet()) {
			if(entry.getValue().getCilindrada() ==  cilindres) {
				car.add(entry.getValue());
			}
		
		}
		return (car);
		
	}
	
	
	
	
	
	
	

}
