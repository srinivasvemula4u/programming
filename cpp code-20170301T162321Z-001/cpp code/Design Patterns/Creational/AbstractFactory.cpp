#include<iostream>
#include<string>

using namespace std;

//Create an interface for shape.
class ShapeInterface
{
public:
    virtual void draw() = 0;

};
//Create an interface for Colors.
class ColorInterface
{
public:
        virtual void Fill()=0;
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
//Create concrete classes implementing the color interface
class ColorRed : public ColorInterface
{
    void Fill()
    {
        cout << "Red color is filled" <<endl;
    }
};
class ColorGreen : public ColorInterface
{
    void Fill()
    {
        cout << "Green Color is filled" <<endl;
    }
};

class AbstractFactory
{
public:
        virtual ShapeInterface* getShapeFactory(string)=0;
        virtual ColorInterface* getColorFactory(string)=0;

};
class ShapeFactory : public AbstractFactory
{
    ShapeInterface* getShapeFactory(string info)
    {
       if( info == "ShapeRectangle")
            return (new ShapeRectangle());
       else if(info == "ShapeCircle")
            return (new ShapeCircle());
       else
            return NULL;
    }
    ColorInterface* getColorFactory(string)
    {
        return NULL;
    }
};
class ColorFactory :public AbstractFactory
{
    ShapeInterface* getShapeFactory(string)
    {
        return NULL;
    }
    ColorInterface* getColorFactory(string info)
    {
        if( info == "ColorRed")
            return (new ColorRed());
        else if(info == "ColorGreen")
            return (new ColorGreen());
        else
            return NULL;
    }
};
class FactoryProducer
{
public:
    AbstractFactory* getFactory(string info)
    {
        if(info == "SHAPE")
            return (new ShapeFactory());
        else if(info == "COLOR")
            return (new ColorFactory());
        else
            return NULL;
    }
};

int main()
{
    FactoryProducer cFactoryProducer;
    AbstractFactory* cAbstrayFactory;
    cAbstrayFactory=cFactoryProducer.getFactory("SHAPE");
    ShapeInterface *cShapeInterface;
    cShapeInterface= cAbstrayFactory->getShapeFactory("ShapeRectangle");
    if(cShapeInterface)
    cShapeInterface->draw();
    cShapeInterface= cAbstrayFactory->getShapeFactory("ShapeCircle");
    if(cShapeInterface)
    cShapeInterface->draw();
    cAbstrayFactory=cFactoryProducer.getFactory("COLOR");
    ColorInterface* cColorInterface;
    cColorInterface = cAbstrayFactory->getColorFactory("ColorRed");
    cColorInterface->Fill();
      cColorInterface = cAbstrayFactory->getColorFactory("ColorGreen");
    cColorInterface->Fill();

}
