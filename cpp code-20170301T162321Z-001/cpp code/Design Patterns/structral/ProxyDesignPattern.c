#include<iostream>
#include<string>
using namespace std;
class IImage
{
    public:
    virtual void Display() =0;
};
class RealImage : public IImage
{
    string fileName;
    void loadFromDisk(string fileName)
    {
        // cout << "Real loadFromDisk " << endl;
        cout << fileName << "  Loading from Disk  " <<endl;
    }
public:
    RealImage(string fileName)
    {
        this->fileName = fileName;
        loadFromDisk(fileName);
    }
    void Display()
    {
         cout << " Displaying " << fileName << " Image " << endl;
    }
};
class ProxyImage: public IImage
{
    RealImage* rImage;
    string fileName;
public:
    ProxyImage(string fileName)
    {
        //cout << "proxy cons" << endl;
        this->fileName = fileName;
        rImage = NULL;
    }
    void Display()
    {
      // cout << "proxy Display 1" << endl;
        if(rImage == NULL)
              rImage = new RealImage(fileName);
       //   cout << "proxy Display 2" << endl;
        rImage->Display();
    }
};
int main()
{
    IImage* aImage;
    aImage = new ProxyImage("test_10mb.jpg");
    aImage->Display();
    cout <<endl <<endl;
    aImage->Display();
}
