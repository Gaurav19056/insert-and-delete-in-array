public class CountNoOfOdd {
    public static int countOdds(int[] numbers) {
        int sum=0;
        int i;
        for(i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                sum ++;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("[1, 2, 3, 4, 5] → " + countOdds(new int[]{1, 2, 3, 4, 5}));    
            
        System.out.println("[2, 4, 6, 8] → " + countOdds(new int[]{2, 4, 6, 8}));       
            
        System.out.println("[1, 3, 5, 7] → " + countOdds(new int[]{1, 3, 5, 7}));       
            
        System.out.println("[] → " + countOdds(new int[]{}));                 
            
        System.out.println("[0, 11, 22, 33] → " + countOdds(new int[]{0, 11, 22, 33}));    
    }
}

