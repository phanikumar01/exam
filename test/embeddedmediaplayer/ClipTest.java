/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//test title to empty string
//test for end value as start value
//test for EqualonEqauls of videoclips
// test for EqualsonNonEquals of videoclips

package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    public ClipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    
      
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue() {
        System.out.println("NewTitle");
        Clip instance = new Clip();
        String OriginalTitle = "Original Title";
        instance.setTitle(OriginalTitle);              // try to set Empty Title
        String EmptyTitle = "";
        instance.setTitle(EmptyTitle);              // try to set Empty Title
        String ModifiedTitle = instance.getTitle(); // check Empty Title is set or not 
        assertTrue(OriginalTitle.equals(ModifiedTitle));// compare original title and resulted title
        System.out.println("Empty Title is not set");
    }
    
    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
       System.out.println("Donot allow to set end time as start time");
       Clip instance = new Clip();
       String OrigTitle = "video clip"; //Create video clip
       instance.setTitle(OrigTitle);   // sets Title  
       int originalStartTime = 5; // Created video clip start time
       int originalEndtime = 40;//  Created video clip end time
       instance.setMax(80);//set main video to 80 seconds video
              // Create a video clip from 5th second to 40th second
       instance.setStart(originalStartTime);//Set start time to videoclip from 5th sec 
       instance.setEnd(originalEndtime);// set end time to videoclip at 40th second
       int EndTime = instance.getEnd(); //Get endtime of the video
       instance.setStart(EndTime); //try to set end time as start time to the video clip
       int CurrentStartTime = instance.getStart();//check start time was set to endtime
       assertEquals(originalStartTime,CurrentStartTime);
       System.out.println("Start time is same as previous value");
    }
    
        @Test
    public void testEqualsOnEqualClips() 
    {
       System.out.println("create multiple videos");
       String Video1 = "video 1"; //Create first sub video clip
       Clip subClip1 = new Clip(Video1,0,10); // First video clip
       
       Clip subClip2 = new Clip();// Second video clip
       String Video2 = "video 1"; //Create second sub video clip 
       subClip2.setTitle(Video2);   // Set Title 
       subClip2.setStart(0);//start time of video from 0th sec 
       subClip2.setEnd(10);// end time to sub video at 10th second
       
       boolean DupliClip = subClip1.equals(subClip2); 
       assertEquals(true,DupliClip); // duplicate video
       System.out.println("video clips are resemblence");  
           
    }
    
       @Test
    public void testEqualsOnNonEqualClips() 
    {
       System.out.println("create multiple videos");
       String Video1 = "video 1"; //Create first sub video clip
       Clip subClip1 = new Clip(Video1,0,10); // First video clip
       
       Clip subClip2 = new Clip();// Second video clip
       String Video2 = "video 2"; //Create second sub video clip 
       subClip2.setTitle(Video2);   // Set Title 
       subClip2.setStart(0);//start time of video from 0th sec 
       subClip2.setEnd(10);// end time to sub video at 10th second
       
       boolean DupliClip = subClip1.equals(subClip2); 
       assertEquals(false,DupliClip); // duplicate video
       System.out.println("video clips are resemblence");  
           
    }
    
  
    
        
    
    
    
    
 
    
    
    
    
}
