 #include <iostream>
 #include <vector>
 using namespace std;
 template<typename T>
 void DisplayVector(const vector<T>& vecInput);
int main ()
 {
 vector <int> vecIntegers;
  cout<< "Vector size=" << vecIntegers.size() <<endl<< "Vector Capacity=" << vecIntegers.capacity()<<endl;
 vecIntegers.reserve((int)20);
  cout<< "Vector size=" << vecIntegers.size() <<endl<< "Vector Capacity=" << vecIntegers.capacity()<<endl;
 // Insert sample integers into the vector:
 vector<int> vecIntegers1(10,7);// inserts 10 elem with 7
  cout<< "Vector size=" << vecIntegers1.size() <<endl<< "Vector Capacity=" << vecIntegers1.capacity()<<endl;
  cout<< vecIntegers1[0]<<endl;
 vecIntegers.push_back (50);
 vecIntegers.push_back (1);
 vecIntegers.push_back (987);
 vecIntegers.push_back (1001);
  cout<< "Vector size=" << vecIntegers.size() <<endl<< "Vector Capacity=" << vecIntegers.capacity()<<endl;
 vecIntegers.insert(vecIntegers.begin(),10);
 cout<< "Vector size=" << vecIntegers.size() <<endl<< "Vector Capacity=" << vecIntegers.capacity()<<endl;
 cout << "Vector contains " << vecIntegers.size () << " elements: ";
 //DisplayVector(vecIntegers);

 // Erase one element at the end
 vecIntegers.pop_back ();
 /*vecIntegers.erase(vecIntegers1.begin(),vecIntegers1.end());

 cout << "After a call to pop_back()" << endl;
 cout << "Vector contains " << vecIntegers.size () << " elements: " <<endl;
 //DisplayVector(vecIntegers);
 return 0;
 }
 /*template<typename T>
 void DisplayVector(const T& vecInput)
 {
for (T::iterator iElement = vecInput.begin() // auto and cbegin(): C++11
 ; iElement != Input.end() // cend() is new in C++11
 ; ++ iElement )
 cout << *(iElement) << '';
 cout << endl;
 }*/
}
