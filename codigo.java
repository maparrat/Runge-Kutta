
public class Main {

	//clase que llama metodos
	public static void main(String[] args) {


		double r= resolver(40,0,2 );
		System.out.print(r);
	}

	//solucin Runge-Kutta.
	public static double resolver(double iteraciones, double t0, double y){
		double k1, k2, k3, k4;
		double deltaT =(y-t0/iteraciones);
		double avance = t0+ deltaT;
		for(double tn=t0; tn<iteraciones; tn +=avance*tn  ){
			
			k1=f(y, tn);
			k2=f(y+(k1*deltaT/2), tn+(deltaT/2));
			k3=f(y+(k2*deltaT/2), tn+(deltaT/2));
			k4=f(y+(k3*deltaT), tn+deltaT);
			y+=(k1+2*k2+2*k3+k4)*deltaT/6;
			tn++;
		
		}
		return y;
	}
	// funcion f
	public static double f(double y, double t){
		double r= (1-t+(4*y));
		return (r);
	}
} 