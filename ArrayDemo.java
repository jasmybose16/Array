class ArrayDemo{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        arr[2]=5;
        int num[]=new int[4];
        num[0]=2;
        num[1]=5;
        num[2]=7;
        num[3]=8;
        for(int i=0;i<arr.length;i++) {
            System.out.println(num[i]);
           }

       for(int i=0;i<=3;i++) {
        System.out.println(num[i]);
       }

       // System.out.println(arr[2]);
        //System.out.println(arr);
    }
    
}