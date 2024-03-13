package TD;

import java.util.Comparator;

public class SoldeComparator implements Comparator<Compte> {
	
	

	@Override
	public int compare(Compte o1, Compte o2) {
		if(o1.getSolde() >o2.getSolde())
		{
			return 1;
		}
		if(o1.getSolde() <o2.getSolde())
		{
			return -1;
		}
		else {
			return 0;
		}
		
	}
    

}
