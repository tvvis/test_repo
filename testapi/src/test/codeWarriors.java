package test;

public class codeWarriors {

    public static String rangeExtraction(int[] arr) {
        if(arr.length==0)  return "";
        int left=0,right=0,flag=0;
        String str="";
        for(int i=0;i<arr.length;i++){
            if (flag==0){
                left=right=arr[i];
                flag=1;
            }
            else if(right==arr[i]-1){
                right=arr[i];
                if(right-left>=2)
                    flag=2;
                else flag=3;
            }
            if (i==arr.length-1||right!=arr[i]-1)
                switch(flag) {
                    case 1:
                        str += left + ",";
                        left = arr[i];
                        flag = 0;
                        break;
                    case 2:
                        str += left + "-" + right + ",";
                        left = arr[i];
                        right = 0;
                        flag = 1;
                        break;
                    case 3:
                        str += left + "," + right + ",";
                        left = arr[i];
                        right = 0;
                        flag = 1;
                        break;
                }
        }
        return str;
    }

    public static void main(String[] args) {
        int[] test={-3,-1,0,1};
        String str=rangeExtraction(test);
        System.out.println(str);
    }
}
