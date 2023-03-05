package practice;

import practice.work.Doctor;
import practice.work.Driver;
import practice.work.Human;
import practice.work.Programmer;
import practice.work.Student;
import practice.work.Teacher;

public class Chapter16 {
	public static void main(String args[]) {
	// 5つのサブクラスのインスタンスを生成
			Human[] humans = new Human[] {
					new Student(), 
					new Programmer(), 
					new Driver(), 
					new Teacher(), 
					new Doctor(), 
			};
			

			for (Human h : humans) {
				// workメソッドを呼び出す
				h.work();

				// Programmerクラスの場合、studyメソッドを呼ぶ
				if(h instanceof Programmer) {
					((Programmer)h).study();
				}
			}

}
}
