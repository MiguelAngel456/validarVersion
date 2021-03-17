package calcularVersiones;

public class CalculadoraVer {
	int numero1,numero2;
	
	public CalculadoraVer(int num1, int num2){
		this.numero1=num1;
		this.numero2=num2;
	}
	public void suma(int num1,int num2){
		int RESULTADO=num1+num2;
		System.out.println(RESULTADO);
		
		//SUMA
	}
	public void RESTA(int num1,int num2){
		int RESULTADO=num1-num2;
		System.out.println(RESULTADO);
		//RESTA
	}
	public void multi(int num1,int num2){
		int RESULTADO=num1*num2;
		System.out.println(RESULTADO);
		//multi
	}
	public void division(int num1,int num2){
		int RESULTADO=num1/num2;
		System.out.println(RESULTADO);
		//RESTA
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
