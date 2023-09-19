package 総合演習;

public class Battle {
	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2){
		
		if(poke1.type==1) {
			if(poke2.type==2) {
				poke1.power=poke1.power*2;
			}
		}else if(poke2.type==1){
			if(poke1.type==2) {
				poke2.power=poke2.power*2;
			}
		}
		if(poke1.type==2) {
			if(poke2.type==3) {
				poke1.power=poke1.power*2;
			}
		}else if(poke2.type==2){
			if(poke1.type==3) {
				poke2.power=poke2.power*2;
			}
		}
		if(poke1.type==3) {
			if(poke2.type==4) {
				poke1.power=poke1.power*2;
			}
		}else if(poke2.type==3){
			if(poke1.type==4) {
				poke2.power=poke2.power*2;
			}
		}
		if(poke1.type==4) {
			if(poke2.type==1) {
				poke1.power=poke1.power*2;
			}
		}else if(poke2.type==4){
			if(poke1.type==1) {
				poke2.power=poke2.power*2;
			}
		}

		if (poke1.power <= poke2.power) {
			winner = poke1.name;
		}
		if (poke1.power >= poke2.power) {
			winner = poke2.name;
		}
		return winner;

	}

}
