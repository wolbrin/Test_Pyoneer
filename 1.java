 public static int maxRev(int[]a){
        int maxRev=0;
        int max=a[0];
        int min=max;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                if(max-min>maxRev)
                    maxRev=max-min;
                max=a[i];
                min=max;
            }
            if(a[i]<min)
                min=a[i];
        }
        if(max-min>maxRev)
            maxRev=max-min;
        return maxRev;
    } 