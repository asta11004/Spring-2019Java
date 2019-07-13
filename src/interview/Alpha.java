package interview;

class Alpha {
	int ns ; 		// 0 
	static int s;	// 125
					
	Alpha(int ns) {   // 100 
		if (s < ns) { // 125 < 100 
			s = ns;   //  
			this.ns = ns; 
		}
	}

	void doPrint() {
		System.out.println("ns = " + ns 
			+ " s = " + s);
	}
}


