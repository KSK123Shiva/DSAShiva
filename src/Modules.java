public class Modules {
    public static void main(String[] args) {

       // OR => ||
        // And => &&
        int arr[]={ 3,2,1,5,7,8,1,4,1,2,1,4,6};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                ans=ans+1;
            }
        }
        System.out.println(ans);

        System.out.println("=====================");
        int arr1[]={ 3,2,1,5,7,8,1,4,1,2,1,4,6};
        int count=0;
        for(int i=0;i<arr1.length;i++){
              //int temp=arr1[i];
            if(arr1[i]%3==0 || arr1[i]%2==0){
                count=count+1;
            }
        }
        System.out.println(count);

        System.out.println("&&&&&&&&&&&&");
        int ar[]={ 3,2,1,5,7,8,1,4,1,2,1,4,6};
        int cnt=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]%3==0 && ar[i]%2==0){
                cnt=cnt+1;
            }
        }
        System.out.println(cnt);
    }


}
