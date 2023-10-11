package arrays;
//Program to demonstrate Jagged array 
class JaggedArray {
	static void printArray(int d[][]) {
	for (int i = 0; i < d.length; i++) {
	for (int j = 0; j < d[i].length; j++)
	System.out.print(d[i][j] + " ");
	System.out.println();
	}
	}
}