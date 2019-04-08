/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//test title to empty string
//test for end value as start value
//test for EqualonEqauls of videoclips
// test for EqualsonNonEquals of videoclips
//end to negative value
//start to positive value
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
       System.out.println("Doesn't allow to set end time to start time");
       Clip instance = new Clip();
       String OriginalTitle = "Sub video"; //Create sub video clip
       instance.setTitle(OriginalTitle);   // Set Ttile  
       int OriginalStartTime = 10; // sub video start time
       int originalEndtime = 40;// sub video end time
       instance.setMax(100);//set master video to 100 seconds video
       
       instance.setStart(OriginalStartTime);//Set start time to sub video from 10th sec 
       instance.setEnd(originalEndtime);// set end time to sub video at 50th second
       int EndTime = instance.getEnd(); //Get endtime of the video
       instance.setStart(EndTime); //try setting end time as start time to the sub clip
       int CurrentStartTime = instance.getStart();//chek start time was set to endtime, usually it wont allow
       assertEquals(OriginalStartTime,CurrentStartTime);
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
    
    @Test
    public void SetEndToNegativeNumberKeepsPreviousValue()
    {
    System.out.println("set valid positive number ");
    boolean NegativeFlag = false ;
    Clip clip = new Clip();
    String IntialTitle = "ClipOne";
    clip.setTitle("Initial Title");
    int ClipOneStartTime = 5;
    int CliopOneEndTime = 30;
    int expectedtime = 30;
    
    clip.setStart(ClipOneStartTime);
    clip.setEnd(CliopOneEndTime);
    int NegativeNumber = -7;
    clip.setEnd(NegativeNumber);
    int ModifiedEndTime = clip.getStart();
    if (ModifiedEndTime > 0){
        NegativeFlag = true;
       
    }
    assertEquals(true,NegativeFlag);
    System.out.println("start time is not negative");
          
    }
    @Test
    public void SetStartToValidPositiveNumber() 
    {
    System.out.println("set valid positive number ");
    boolean PositiveFlag = false ;
    Clip clip = new Clip();
    String IntialTitle = "ClipOne";
    clip.setTitle("Initial Title");
    int ClipOneStartTime = 5;
    int CliopOneEndTime = 30;
    clip.setStart(ClipOneStartTime);
    clip.setEnd(CliopOneEndTime);
    int PositiveNumber = 7;
    clip.setStart(PositiveNumber);
    int ModifiedStartTime = clip.getStart();
    if (ModifiedStartTime > 0){
        PositiveFlag = true;
       
    }
    assertEquals(true,PositiveFlag);
    System.out.println("start time is not negative");
          
    }
    
    
    
    
     }
    
    
  
    
        
    
    
    
    
 
    
    
    
    

