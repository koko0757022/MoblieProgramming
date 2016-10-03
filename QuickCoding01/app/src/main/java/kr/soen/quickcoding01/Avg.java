package kr.soen.quickcoding01;

/**
 * Created by koko0 on 2016-10-03.
 */
class Avg extends GetResult{

    int[] num;

    public Avg(int[] num) {
        this.num = num;
    }
    public int AvgResult(int[] num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum/num.length;
    }
}