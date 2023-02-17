package demo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Car obj = new Car();
		obj.Acclerate();//Vehicle Method
		obj.Brake();//Vehicle Method
		obj.Colour();//Car Method*/
		Car obj1=new Car(1);//First Base class constructor and then child class constructor 
							//it will call in case of inheritanse
		Bike obj2;//it will not call constructor,it is for reference creation
	}

}
