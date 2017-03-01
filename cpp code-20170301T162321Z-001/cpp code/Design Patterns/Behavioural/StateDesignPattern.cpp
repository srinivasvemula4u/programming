#include<iostream>
#include<string>

using namespace std;

class Context;
class stateInterface
{
public:
    virtual void doAction(Context &)=0;
    virtual string toString()=0;
};
class Context
{
    stateInterface *state;
public:
    Context()
    {
        state = NULL;
    }
    void setState(stateInterface* state)
    {
        this->state = state;
    }
    stateInterface* getState()
    {
         if(state)
         {
             return state;
         }
         else
         {
              return NULL;
         }

    }
};
class StartState  : public stateInterface
{
public:
    void doAction(Context& context)
    {
        cout << "Player in StartState"<<endl;
        context.setState(this);
    }
    string toString()
    {
        return "start state";
    }

};
class StopState : public stateInterface
{
public:
    void doAction(Context& context)
    {
        cout<< "Player in StopState" << endl;
        context.setState(this);
    }
    string toString()
    {
        return "stop state";
    }
};
int main()
{
    Context cContext;
    StartState *sState = new StartState();
    sState->doAction(cContext);
    cout<< (cContext.getState())->toString() <<endl;
    StopState *stState = new StopState();
    stState->doAction(cContext);
    cout<< (cContext.getState())->toString() <<endl;
}
