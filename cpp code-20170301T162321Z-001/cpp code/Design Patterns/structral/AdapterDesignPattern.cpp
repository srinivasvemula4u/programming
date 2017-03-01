#include<iostream>
#include<string>
using namespace std;

class InterfaceMediaPlayer
{
    public:
  virtual void play(string audiType, string fileName)=0;
};

class InterfaceAdvanceMediaPlayer
{
    public:
    virtual void playVLC(string fileName)=0;
    virtual void playMP4(string fileName)=0;
};
class VLCPlayer :public InterfaceAdvanceMediaPlayer
{
    void playVLC(string fileName)
    {
     cout << fileName << "playing by Advance VLC player" << endl;
    }
    void playMP4(string fileName)
    {

    }
};
class MP4Player : public InterfaceAdvanceMediaPlayer
{
     void playVLC(string fileName)
    {

    }
    void playMP4(string fileName)
    {
         cout << fileName << "playing by Advance MP4 player" << endl;
    }
};

class MediaAdapter : public InterfaceMediaPlayer
{
    InterfaceAdvanceMediaPlayer *mAdvancePlayer;
public:
    MediaAdapter(string fileFormat)
    {
        if(fileFormat == "mp4")
            mAdvancePlayer = new MP4Player();
        else if( fileFormat == "vlc")
            mAdvancePlayer = new VLCPlayer();
    }
    void play(string audioType, string fileName)
    {
         if(audioType == "mp4")
            mAdvancePlayer->playMP4(fileName);
        else if( audioType == "vlc")
            mAdvancePlayer->playVLC(fileName);

    }
};
class AudioPlayer : public InterfaceMediaPlayer
{
    MediaAdapter *mMediaAdapter;
public:
  void play(string audioType,string fileName)
  {
      if(audioType == "mp3")
        cout<< fileName<< "is playing by normal player" << endl;
      else if( audioType == "mp4" || audioType == "vlc")
      {
          mMediaAdapter = new MediaAdapter(audioType);
          mMediaAdapter->play(audioType,fileName);
      }
      else
      {
          cout << "Audio file is Invalid !!!"<<endl;
      }
  }
};
int main()
{
    AudioPlayer cAudioPlayer;
    cAudioPlayer.play("mp3","hello.mp3");
     cAudioPlayer.play("mp4","hello world.mp4");
      cAudioPlayer.play("vlc","Awesome hello world.vlc");




}

