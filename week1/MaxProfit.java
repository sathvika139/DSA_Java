class MaxProfit {
    public int maxProfit(int[] a) {
        if (a == null || a.length < 2) return 0;

        int minSoFar = a[0];
        int maxProfit = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minSoFar) {
                minSoFar = a[i];  
            } else {
                maxProfit = Math.max(maxProfit, a[i] - minSoFar); 
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] a = {7,1,5,3,6,4};
        Solution s = new Solution();
        System.out.println("Max Profit = " + s.maxProfit(a)); // 5
    }
}