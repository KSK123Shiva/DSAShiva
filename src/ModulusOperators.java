public class ModulusOperators {

    public static void main(String[] args) {
        int arr[]={ 3,2,1,5,7,8,1,4,1,2,1,4,6};
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==3){
                //count=count+1;
                count++;
            }
        }
        System.out.println(count);
    }
}
