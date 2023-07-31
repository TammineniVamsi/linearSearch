public class linearsearch {
    public static int linsear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int key=10;
        int arr[]={1,2,3,4,5,6,8,10,45,89,10};
        //arr={1,2,4,5,6,8,10};
        System.out.println("key is found at index "+ linsear(arr,key));
    }
    
}
