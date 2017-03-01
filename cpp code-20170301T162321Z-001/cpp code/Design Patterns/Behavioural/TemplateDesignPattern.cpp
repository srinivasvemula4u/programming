#include<iostream>
#include<string>

using namespace std;

class AbstractGame
{
    virtual void intialize()=0;
    virtual void startplay()=0;
    virtual void endplay()=0;
public:
    void play()
    {
        intialize();
        startplay();
        endplay();
    }

};
class CricketGame : public AbstractGame
{
    void intialize()
    {
        cout << "Cricket is intialized "<<endl;
    }
    void startplay()
    {
        cout<< "Cricket start play" <<endl;
    }
    void endplay()
    {
        cout<< "Cricket end play" << endl;
    }
};
class FootBallGame : public AbstractGame
{
    void intialize()
    {
        cout << "Intialzie FootBall Game"<<endl;
    }
    void startplay()
    {
        cout <<"FootBall startplay" << endl;
    }
    void endplay()
    {
        cout << "Football endplay" <<endl;
    }
};
int main(void)
{
    AbstractGame *cAbstractGame;
    cAbstractGame = new CricketGame();
    cAbstractGame->play();
    cAbstractGame = new FootBallGame();
    cAbstractGame->play();
}
