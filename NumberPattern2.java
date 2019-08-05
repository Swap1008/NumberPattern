class NumberPattern2{
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j +" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}