#include<iostream>
#include<string>
#include<vector>
#include<climits>
#define No_Of_Characters 256
using namespace std;

void BuildNeedToFindVector(string& MaskString,vector<int>& NeedToFind)
{
    string::iterator itr = MaskString.begin();
    while(itr != MaskString.end())
    {
        NeedToFind[static_cast<int>(*itr)]++;
        itr++;
    }
}
void SmallestWindow(string MainString, string MaskString)
{
    vector<int> NeedToFind(No_Of_Characters,0),HasFind(No_Of_Characters,0);
    BuildNeedToFindVector(MaskString,NeedToFind);
    int MainString_Length = MainString.length();
    int MaskString_Length = MaskString.length();
    int Begin_Index,End_Index;
    int MinWindowLength = INT_MAX;
    int MinWindowBegin=0,MinWindowEnd = 0;
    int WindowLength = 0,Window_count=0;
    /*for( Begin_Index=0,End_Index =0; End_Index < MainString_Length; End_Index++)
    {
        // cout << "End Index " << End_Index <<endl;
         cout << "Begin Index " <<Begin_Index <<endl;
        //cout << "MinWindow Length = " << MinWindowLength << endl;
        cout << "value " << MainString[End_Index] <<endl;
    cout << "MinWindow Begin = " << MinWindowBegin  << "  MinWindow End = " << MinWindowEnd <<endl;
        if(NeedToFind[static_cast<int>(MainString[End_Index])] == 0)
            continue;
        HasFind[static_cast<int>(MainString[End_Index])]++;
        if(HasFind[static_cast<int>(MainString[End_Index])] <= NeedToFind[static_cast<int>(MainString[End_Index])])
            Window_count++;
        if(Window_count == MaskString_Length)
        {
            cout << "if ***" <<endl;
            while((NeedToFind[MainString[Begin_Index] == 0]) ||
                 (HasFind[static_cast<int>(MainString[Begin_Index])] > NeedToFind[static_cast<int>(MainString[Begin_Index])]))
                  {
                      cout << "****" <<endl;
                      if(HasFind[static_cast<int>(MainString[Begin_Index])] > NeedToFind[static_cast<int>(MainString[Begin_Index])])
                                HasFind[static_cast<int>(MainString[Begin_Index])]--;
                      Begin_Index++;
                  }
            WindowLength = End_Index - Begin_Index + 1;
            if( MinWindowLength > WindowLength)
                {
                    MinWindowBegin = Begin_Index;
                    MinWindowEnd = End_Index;
                    MinWindowLength = WindowLength;
                }
        }
    }
   // cout << "MinWindow Length = " << MinWindowLength << endl;
   // cout << "MinWindow Begin = " << MinWindowBegin  << "  MinWindow End = " << MinWindowEnd <<endl;*/

   for(Begin_Index =0, End_Index = 0; End_Index < MainString_Length; End_Index++)
   {
       if( NeedToFind[ MainString[End_Index]] ==0)
         continue;
       else
            HasFind[MainString[End_Index]]++;
       if( HasFind[ MainString[End_Index]] <= NeedToFind[MainString[End_Index]])
            Window_count++;
        if( Window_count == MaskString_Length)
        {
            while( NeedToFind[MainString[Begin_Index]] == 0 || HasFind[MainString[Begin_Index]] > NeedToFind[MainString[Begin_Index]])
            {
                if(HasFind[MainString[Begin_Index]] > NeedToFind[MainString[Begin_Index]])
                    HasFind[MainString[Begin_Index]]--;
                Begin_Index++;
            }
            WindowLength = End_Index - Begin_Index + 1;
            cout << "WindowLength =" << WindowLength <<endl;
            if( WindowLength < MinWindowLength)
            {
                MinWindowBegin = Begin_Index;
                MinWindowEnd = End_Index;
                MinWindowLength = WindowLength;
            }
        }
   }
    cout << " Minimum Window Begin = " << MinWindowBegin << "  Minimum  Window End =" << MinWindowEnd <<endl;
    cout << "MinWindowLength = "<<MinWindowLength;

}
int main()
{
    SmallestWindow("this is a test string","tist");
}

