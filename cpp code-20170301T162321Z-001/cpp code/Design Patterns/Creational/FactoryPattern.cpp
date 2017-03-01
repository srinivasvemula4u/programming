#include<iostream>
#include<string>

using namespace std;

//Create an interface.
class ShapeInterface
{
public:
    virtual void draw() = 0;

};

//Create concrete classes implementing the same interface.

class ShapeRectangle : public ShapeInterface
{
    void draw()
    {
        cout << " Shape is Rectangle" <<endl;
    }
};
class ShapeCircle : public ShapeInterface
{
    void draw()
    {
        cout << "Shape is Circle"<<endl;
    }
};
//Create a Factory to generate object of concrete class based on given information.
class ShapeFactory
{
public:
    ShapeInterface* GetShape(string name)
    {
        if( name == "ShapeRectangle")
            return (new ShapeRectangle());
        else if(name == "ShapeCircle")
            return (new ShapeCircle());
        /*else if(name == "ShapeSquare")
            return (new ShapeSquare());*/
        else
            return NULL;
    }

};
//Use the Factory to get object of concrete class by passing an information such as type.
int main()
{
   ShapeInterface *cShape;
   ShapeFactory cShapeFactory;
   cShape = cShapeFactory.GetShape("ShapeRectangle");
   cShape->draw();
   cShape = cShapeFactory.GetShape("ShapeCircle");
   cShape->draw();
   //ShapeCircle circle;
  // circle.draw(); we can not access like this
}
