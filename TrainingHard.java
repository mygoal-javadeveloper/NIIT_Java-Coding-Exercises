package codings;

/**
 * class literal in java
 * A very useful tool to get details of a class.
 * By Nisrin Dhoondia
 * I am Java Developer and a good learner. 
 * I am looking for Java Developer job 
 * - Fresher/Junior/Intern position.
 */

import java.lang.reflect.Method;

public class TrainingHard extends TrainingAA implements TrainingA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<TrainingHard> myclass = TrainingHard.class;
		Method[] myclassarr = myclass.getDeclaredMethods();
		System.out.println(myclass);
		System.out.println(myclass.getName());
		for (int i = 0; i < myclassarr.length; i++) {
			System.out.println(myclassarr[i]);
		}
		System.out.println();
		Class<TrainingA> myinterface = TrainingA.class;
		Method[] myinterfacearr = myinterface.getDeclaredMethods();
		System.out.println(myinterface);
		System.out.println(myinterface.getName());
		for (int i = 0; i < myinterfacearr.length; i++) {
			System.out.println(myinterfacearr[i]);
		}
		System.out.println();
		
		Class<TrainingAA> myabstractclass = TrainingAA.class;
		Method[] myabstractclassarr = myabstractclass.getDeclaredMethods();
		System.out.println(myabstractclass);
		System.out.println(myabstractclass.getName());
		for (int i = 0; i < myabstractclassarr.length; i++) {
			System.out.println(myabstractclassarr[i]);
		}
	}

	public void methodA() {

	}

	public static void methodB() {

	}
	public void methodD() {
		
	}
	public void methodE() {
		
	}
}
