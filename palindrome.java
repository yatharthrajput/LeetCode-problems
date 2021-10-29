public class Main {
    if(x==0) return 0;
    int b = x/10;
    int a = x%10;
    int length = (int) (Math.log10(x) + 1);
 return mul(a, length) + reverse(b);
}

private int mul(int a, int m){
    int counter = 0;
    while(counter++<m-1)
        a*=10;
    return a;
}
