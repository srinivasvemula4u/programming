#include<iostream>
#include<string>

using namespace std;
/*class A
{  int x;
public:
    void fun()
    {

        cout << "fun";
    }
};*/
void computeLPSArray(string pattern,int M, int *lps)
{
    int len =0;
    lps[0]=0;
    int i;
    i=1;
    while( i<M)
    {
        if(pattern[i] == pattern[len])
        {
            len++;
            lps[i] = len;
            i++;
        }
        else
        {
            if(len != 0)
            {
                len = lps[len-1];
            }
            else if(len ==0)
            {
                lps[i]=0;
                i++;
            }
        }
    }

}
void KMPSearch(string txt, string pattern)
{
    int M = pattern.length();
    int N= txt.length();
    int *lps = new int(M*sizeof(int));
     // Preprocess the pattern (calculate lps[] array)
    computeLPSArray(pattern, M, lps);
    //if()
    int i =0;
    int j=0;
    while(i<N)
    {
        if(txt[i] == pattern[j])
        {
            i++;
            j++;
        }
        if (j == M)
      {
        cout<< "Found pattern at index ="<< (i-j) <<endl;
        j = lps[j-1];
      }
      else if(i<N && (pattern[j]!= txt[i]))
      {
          if(j!=0)
            j=lps[j-1];
          else
            i++;
      }

    }
    delete lps;
}
int main()
{
    string txt("AABAACAADAABAAABAA");
    string pattern("AABA");
    KMPSearch(txt,pattern);
   // A a;
    //cout<<sizeof(a);
}
