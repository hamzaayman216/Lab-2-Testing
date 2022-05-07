public class MinMaxFinder {
    public int MaxFinder(int[] x){
        int max=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        return max;
    }
    public int MinFinder(int[] x){
        int min=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]<min){
                min=x[i];
            }
        }
        return min;
    }
}

