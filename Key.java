import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String notPressed;
    private String pressed;

    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, String keyNotPressed, String keyPressed)
    {
        key = keyName;
        sound = soundFile;
        notPressed = keyNotPressed;
        pressed = keyPressed;
        setImage(notPressed + ".png");
    }

    /**
     * act checks to see whether the piano key is pressed down and whether the person playing the piano is 
     * is pressing a key and if so plays the right key.
     *
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act()
    {
        if( isDown == false  && Greenfoot.isKeyDown(key) == true)
        {
            setImage(pressed + ".png");
            isDown = true;
            play();
        }

        if( isDown == true  && !Greenfoot.isKeyDown(key) )
        {
            setImage(notPressed+ ".png");
            isDown = false;
        }

    }

    /**
     * play intializes sound that the piano key plays
     * and the sound that each piano key is made for
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void play()
    {
        Greenfoot.playSound(sound + ".wav");
    }

    /**
     * checkDown returns isDown 
     * 
     * @param There are No parameters
     * @return isDown is returned because we need to check if the keys are different
     *  
     */
    public boolean checkDown()
    {
        return isDown;
    }
}

