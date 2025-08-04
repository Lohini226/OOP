package practicaltasks;

public class practical1 {
	int num = 10;
    double dbl = (double)num;
    int a = 5;
    int b = 3;
    int var10000 = a + b;
    boolean var14 = a > b;
    if (a > b) {
       System.out.println("a is greater than b");
    }

    for(int i = 0; i < 5; ++i) {
       System.out.println("i = " + i);
    }

    int[] arr = new int[]{1, 2, 3, 4, 5};
    int[] var12 = arr;
    int var11 = arr.length;

    for(int var10 = 0; var10 < var11; ++var10) {
       int val = var12[var10];
       System.out.println(val);
    }
}
