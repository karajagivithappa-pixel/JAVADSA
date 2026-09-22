package leetCodeBlind75;

public class Sample1 {
	public static boolean bricks(int small,int big,int goal) {
		if((small*1+big*5)==goal){
		    return true; }
		  else if(small*1==goal){
		    return true; }
		  else if(big*5==goal){
		    return true;}
		  else{
		    return false; }
	}
	public static void main(String[] args) {
		System.out.println(bricks(3,1,9));
	}
}
