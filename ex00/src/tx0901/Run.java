package tx0901;

public class Run {

	public static void main(String[] args) {
		
		Ba ba =  new Ba();
		TrainImple ti = new TrainImple();
		
		//인터페이스를 받아온다
		TravelInter tr  = new Ba();
		TravelInter tr2 = new TrainImple();
		
		TravelInter[] trs = new TravelInter[2];
		
		trs[0] = ba;
		trs[1] = ti;
		
		
		for(int i=0; i<trs.length; i++) {
			trs[i].Tranveling();
		}
	}

}
