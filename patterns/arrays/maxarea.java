package arrays;
import java.util.Scanner;

public class maxarea {
    public  static int maxarea(int[]height){
        int maxWater =0;
        int i =0;
        int j = height.length-1;
        while(i<j){
            int l =j-i;
            int h = Math.min(height[i],height[j]);
            int water =l*h;
            maxWater = Math.max(maxWater,water);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxWater;
    }
}
