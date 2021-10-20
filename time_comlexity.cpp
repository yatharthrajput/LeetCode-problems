#include<iostream>

using namespace std;

int main()  {
int arr[1001];
    int T,N;
    cin>>T;
    for(int i=0;i<T;i++){
        cin>>arr[i];

    }
    for (int k=0;k<=sizeof(arr);k++){
         for(int j=2;j<=arr[k];j++){
        if(N%j==0){
            cout<<j<<" ";

        }

    }
    }

    return 0;
}
