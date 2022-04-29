package model;

public class Company{
	
    public static final int MAX_BATTERIES = 10;
	private Battery[] batteries;

	public Company() {
        this.batteries = new Battery[MAX_BATTERIES];
	}

    public Company(Battery[] batteries){
        this.batteries = batteries;
    }
	

    public void registerBattery(String name, double voltage, double cost, double capacity){
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new Battery(name, voltage, cost, capacity);

    }

    public void registerRechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type) {
        int emtyPos = getEmtyPosition();
        batteries[emtyPos] = new RechargeableBattery(name, voltage, cost, capacity, chargerNumber ,type);
        
    }
    
    private int getEmtyPosition() {
        int pos = -1;
        for (int i = 0; i < MAX_BATTERIES && pos == -1; i++) {
            if (batteries[i] == null) {
                pos = i;
            }
        }
        return pos;
    }

    public String showTotalBatteries() {
    	
        int tB = 0;
        boolean end = false;
        for (int i = 0; i < MAX_BATTERIES && end != false; i++) {
            if (batteries[i] == null) {
                end = true;
            } else {
                tB++;
            }
        }
        String n = ""+tB+"";

        return n;
    }
    
    public String showBatteriesInfo() {
    }
    

	public double calculateUsefulPromLifeCost(){
        int  = 0;
        boolean end = false;
        for (int i = 0; i < MAX_BATTERIES && end != false; i++) {
            if (batteries[i] == null) {
                end = true;
            } else {
                ++;
            }
        }
		return 0.0;
	}

}
