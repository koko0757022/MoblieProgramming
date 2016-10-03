package kr.soen.quickcoding01;

/**
 * Created by koko0 on 2016-10-03.
 */
class Min extends GetResult{
    int[] num;

    public Min(int[] num) {
        this.num = num;
    }
    public int MinResult(int[] num){
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(min > num[i]){
                min = num[i];
            }
        }
        return min;
    }

}