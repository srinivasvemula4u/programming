#include<iostream>
#include<string>
using namespace std;
class IImage
{
    public:
            virtual void Display() =0;
             virtual ~IImage()=default;
};
class RealImage : public IImage
{
    string fileName;
    int *arr;
    void loadFromDisk(string fileName)
    {
        cout << fileName << "  Loading from Disk  " <<endl;
    }
public:
    RealImage(string fileName)
    {
        cout << "RealImage Constructor " <<endl;
        this->fileName = fileName;
        loadFromDisk(fileName);
        arr = new int[10];
    }
    void Display()
    {
         cout << " Displaying " << fileName << " Image " << endl;
    }
   ~RealImage()
   {
     cout << "Real Image destructor" << endl;
   }
};
class ProxyImage: public IImage
{
    static RealImage* rImage;
    static int RealImageRefCount;
    string fileName;
public:
    ProxyImage(string fileName)
    {
        cout << "Proxy Constructor " <<endl;
        this->fileName = fileName;
        RealImageRefCount++;
    }
    void Display()
    {
        if(!rImage)
              rImage = new RealImage(fileName);
        rImage->Display();
    }
    ~ProxyImage()
    {
        cout << "Proxy Destructor " <<endl;
        RealImageRefCount--;
        if(RealImageRefCount == 0)
            delete rImage;
    }
    int static GetRefCount()
    {
        return RealImageRefCount;
    }
};

RealImage* ProxyImage::rImage = NULL;
int ProxyImage::RealImageRefCount = 0;
int main()
{
    IImage* aImage;
    aImage = new ProxyImage("test_10mb.jpg");
    ProxyImage aProxyImage("hasdjhj");
    aImage->Display();
    cout << " RefCount " << ProxyImage::GetRefCount() <<endl;
    {
        IImage* aImage2 = new ProxyImage("test_20mb.jpg");
        aImage2->Display();
        cout <<" RefCount " << ProxyImage::GetRefCount() <<endl;
        delete aImage2;
    }

   cout << " RefCount " <<ProxyImage::GetRefCount() <<endl;
   cout << " RefCount " <<ProxyImage::GetRefCount() <<endl;
}
