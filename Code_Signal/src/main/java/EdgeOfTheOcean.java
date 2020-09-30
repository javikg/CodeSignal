public class EdgeOfTheOcean {

	/*1*/
	int adjacentElementsProduct(int[] inputArray) {
	     int[] temp = new int[inputArray.length - 1];
	     for (int i = 0; i < temp.length; i++) {
	         temp[i] = inputArray[i] * inputArray[i + 1];
	     }
	     int x = temp[0];
	     for (int i = 1; i < temp.length; i++) {
	         if (temp[i] > x) {
	             x = temp[i];
	         }
	     }
	     return x;
	}
	
	/*2*/
	
	int shapeArea(int n) {
	    int polygon = 0;
	    if (n == 1) {
	        polygon = 1;
	    } else {
	        polygon = (n * n) * 2 - n - (n - 1);
	    }
	    return polygon;
	}
	
	/*3*/
	int makeArrayConsecutive2(int[] statues) {
		int max = statues[0];
		int min = statues[0];
		int elems = (statues.length - 1);
		    for (int i = 0; i < statues.length; i++) {
		        if (statues[i] > max) {
		            max = statues[i];
		        }
		        if (statues[i] < min) {
		            min = statues[i];
		        }
		    }
		return (max - min) - elems;
		}
}
