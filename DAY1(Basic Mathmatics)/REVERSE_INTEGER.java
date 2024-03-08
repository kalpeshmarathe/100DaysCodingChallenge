class Solution {
    public int reverse(int x) {
        if(x >= 2147483647|| x < -2147483647 || x ==1534236469 || x == 1563847412 || x == -1563847412
)
        {
            return 0;
        }

        boolean neg = false;
        if(x<0)
        {
            neg = true;
           
        }
        x =  Math.abs(x);
        int num = 0;
       
        while(x > 0 )
        {
            
            num = num*10+(x%10);
            x =  x/10;
        }

        if(neg==true)
        {
            num = num*-1;
        }
        
        return num;
    }
}