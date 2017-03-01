#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

 int main()
 {
     vector<int> vecIntegers(3);
     cout<< "Vector size ="<< "vecIntegers.capacity()"<< vecIntegers.size()<<endl;
     for(auto itr = vecIntegers.begin();itr != vecIntegers.end(); itr++)
        cout << *itr <<endl;
     fill(vecIntegers.begin(),vecIntegers.end(),9);
     cout<< "After Filling" << endl;
     for(auto itr = vecIntegers.begin();itr != vecIntegers.end(); itr++)
        cout << *itr <<endl;
     vecIntegers.resize(6);
      cout<< "Vector size ="<< "vecIntegers.capacity()"<< vecIntegers.size()<<endl;
      for(auto itr = vecIntegers.begin();itr != vecIntegers.end(); itr++)
        cout << *itr <<endl;
      fill_n(vecIntegers.begin()+3,3,-9);
      cout<< "After Filling" <<endl;
      for(auto itr = vecIntegers.begin();itr != vecIntegers.end(); itr++)
        cout << *itr <<endl;
 }
