package Q_128_156;

import java.util.ArrayList;

public class Q155 {
	public static void main(String[] args) {
		ArrayList<Integer> points=new ArrayList<>();
		points.add(1);
		points.add(2);
		points.add(3);
		points.add(4);
		
		points.add(null);
		points.remove(null);
		points.remove(1);
		System.out.println(points);
	}

}