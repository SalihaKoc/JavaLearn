package J12_Loops.L02_WhileLoop.WhileLoopTasks;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */

		int sayi=999;
		int adet=0;
		while (sayi>=100) {
			if ((sayi%4==0) && (sayi%6==0)) {
				System.out.print(sayi + " ");
				adet++;
			}
			sayi--;
		}
	}
}
