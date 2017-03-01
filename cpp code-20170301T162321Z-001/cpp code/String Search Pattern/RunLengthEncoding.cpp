#include<iostream>
#include<string>
#include<cstdio>
#include<cstring>
#include<cstdlib>
#define MAX_RLEN 50
using namespace std;

/*void Encode(string str)
{
    string destination;
    destination.resize(2*str.length());
    cout<<"Destination string size = "<<destination.length() << destination <<endl;
    //string::iterator itr = str.begin();
    int source_index=0, dest_index =0;
    char *c;
    while(source_index < str.length())
    {
        int mcount=0;
       destination[dest_index] = static_cast<char>(str[source_index]);
        dest_index++;
        source_index++;
        mcount++;
      while((source_index < str.length()) && (str[source_index] == str[source_index+1]))
      {
          cout << "Inner while" << endl;
          mcount++;
          source_index++;
         // itr++;
      }
      //destination.append(1,mcount);
      //cout << mcount <<endl;
      sprintf(c, "%d",mcount);
      destination[dest_index] = c[0];
     // c = NULL;
      dest_index++;
     //itr++;
    }
   destination[dest_index] = '\0';
    //destination.erase(destination.begin()+dest_index,destination.end());
    cout << "Run Length Encoding String = " << destination;
}*/
//c style
void encode(char *src)
{
  int rLen;
  char count[MAX_RLEN];
  int len = strlen(src);

  /* If all characters in the source string are different,
    then size of destination string would be twice of input string.
    For example if the src is "abcd", then dest would be "a1b1c1d1"
    For other inputs, size would be less than twice.  */
  char *dest = (char *)malloc(sizeof(char)*(len*2 + 1));

  int i, j = 0, k;

  /* traverse the input string one by one */
  for(i = 0; i < len; i++)
  {

    /* Copy the first occurrence of the new character */
    dest[j++] = src[i];

    /* Count the number of occurrences of the new character */
    rLen = 1;
    while(i + 1 < len && src[i] == src[i+1])
    {
      rLen++;
      i++;
    }

    /* Store rLen in a character array count[] */
    sprintf(count, "%d", rLen);

    /* Copy the count[] to destination */
    for(k = 0; *(count+k); k++, j++)
    {
      //cout << "***" <<endl;
       dest[j] = count[k];
      //dest[j] = char(rLen);
    }
  }
    /*terminate the destination string */
  dest[j] = '\0';
  cout << "Run Length Encoding ="<<dest;
  }
int main()
{
    encode("geeksforgeeks");
}
