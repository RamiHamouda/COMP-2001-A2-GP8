
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @authors
 * 1-RAMI HAMOUDA
 * @version 1.0
 */
public class SalesItemTest
{
    private SalesItem salesItem1;
    private SalesItem salesItem2;
    private SalesItem salesItem5;

    
    

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        salesItem1 = new SalesItem("Black Pen", 100);
        salesItem2 = new SalesItem("Note Book", 200);
        salesItem5 = new SalesItem("Fancy Calender", 500);
        salesItem5.addComment("Neji", "Fancy duh! it's basic", 1);
        salesItem5.addComment("Naruto", "Nice one, believe it!!!", 5);
        salesItem5.addComment("Zenitsu", "Worth every penny.Loved it", 5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void testCreateTwoItems()
    {
        SalesItem salesItem3 = new SalesItem("Hoodie", 2000);
        SalesItem salesItem4 = new SalesItem("Programming for Dummies by RM", 1000);
    }

    @Test
    public void testReturnName()
    {
        assertEquals("Black Pen", salesItem1.getName());
        assertEquals("Note Book", salesItem2.getName());
    }

    @Test
    public void testReturnPrice()
    {
        assertEquals(100, salesItem1.getPrice());
        assertEquals(200, salesItem2.getPrice());
    }

    @Test
    public void testNumberOfComments()
    {
        assertEquals(0, salesItem1.getNumberOfComments());
        assertEquals(3, salesItem5.getNumberOfComments());
    }
    
        @Test
    public void testAddComment()
    {
        assertEquals(true, salesItem2.addComment("Tanjiro", "Nice and affordable.", 5));
        assertEquals(true, salesItem2.addComment("Inosuke", "Give me back my money!!!!", 1));
        assertEquals(false, salesItem2.addComment("Kibutsuji", "Do not buy, very thin paper.", 0));
        assertEquals(false, salesItem2.addComment("Rengoku", "Fanstastic! I bought a dozen.", 6));
        assertEquals(false, salesItem2.addComment("Inosuke","Waste of money!!",1));
    }

    @Test
    public void testRemoveComment()
    {
        salesItem5.removeComment(0);
    }

    @Test
    public void testUpvoteComment()
    {
        salesItem5.upvoteComment(0);
        salesItem5.upvoteComment(0);
        
    }

    @Test
    public void testDownvoteComment()
    {
        salesItem5.downvoteComment(2);
        salesItem5.downvoteComment(2);
    
    }


    @Test
    public void testFindMostHelpfulComment()
    {
        Comment comment1 = salesItem5.findMostHelpfulComment();
        assertEquals(comment1, salesItem5.findMostHelpfulComment());
    }

    @Test
    public void testRatingInvalid()
    {
        assertEquals(false, salesItem2.addComment("Nezuko", "Pretty cover.", 6));
        assertEquals(false, salesItem2.addComment("Tomiyoka", "Its alright!", 0));
    }


    @Test
    public void testFindCommentsByAuthor()
    {
        assertEquals(true, salesItem2.addComment("Tamaki", "Good purchase", 5));
        assertEquals(false, salesItem2.addComment("Tamaki", "Will buy it again!", 5));
    }
}




















