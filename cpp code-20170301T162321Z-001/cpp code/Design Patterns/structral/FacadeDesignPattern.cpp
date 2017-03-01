#include<iostream>
#include<string>

using namespace std;

//Create Interface

class ShapeInterface
{
public:
    virtual void draw()=0;
};
class ShapeRectangle :public ShapeInterface
{
    void draw()
    {
        cout << "Shape  Rectangle is drawn" <<endl;
    }
};
class ShapeCircle :public ShapeInterface
{
    void draw()
    {
       cout << "Shape Circle is drawn" <<endl;
    }
};
class FacadeClass
{
    ShapeInterface* mRectangle;
    ShapeInterface* mCircle;
public:
    FacadeClass()
    {
        mRectangle = new ShapeRectangle();
        mCircle = new ShapeCircle();
    }
    void Facadedraw(string info)
    {
        if(info == "ShapeRectangle")
            mRectangle->draw();
        else if(info == "ShapeCircle")
            mCircle->draw();
        else
            cout<< "Plz pass proper information!!!!"<<endl;
    }
};
int main()
{
    FacadeClass cFacadeClass;
    cFacadeClass.Facadedraw("ShapeRectangle");
    cFacadeClass.Facadedraw("ShapeCircle");
}
