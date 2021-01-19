package ejemplopipeline;

public class Diezxciento {
	
	public int ahorro;
	public int sueldo;
	
	public Diezxciento(){
		ahorro = 20000000;
		sueldo = 700000;
	}
	
	public Diezxciento(int ahorro, int sueldo) {
		this.ahorro = ahorro;
		this.sueldo = sueldo;
	}
	
	public int diezxciento(){
		double diezxciento = ahorro * 0.1;
		
		if(ahorro < 1000000){
			return ahorro;
		}
				
		return (int) diezxciento;
	}
	
	public int impuesto(){		
		if(sueldo<500000){
			return 0;
		}else if(sueldo>= 500000 && sueldo < 1000000){			
			return (int) ((double)ahorro * 0.015);
		}else if(sueldo>= 1000000 && sueldo < 2000000){
			return (int) ((double)ahorro * 0.05);
		}else if(sueldo>= 2000000 && sueldo < 6000000){
			return (int) ((double)ahorro * 0.1);
		}else{
			return (int) ((double)ahorro * 0.15);
		}		
	}
	
	public int saldoAhorro() {
		double noventaxciento = ahorro * 0.9;
		return (int) noventaxciento;
	}

}