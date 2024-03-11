

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @authors
 * 1) Rami HAmouda
 * @version 1.0
 */
public class CommentTest
{
    private Comment comment2;
    private Comment comment3;
    private Comment comment4;

    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        comment2 = new Comment("Saju", "testComment1", 2);
        comment3 = new Comment("Rami", "test Comment 2", 4);
        comment4 = new Comment("Darian", "test Comment 3", 5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testUpvote()
    {
        comment4.upvote();
        comment4.upvote();
        comment4.upvote();
        assertEquals(3, comment4.getVoteCount());
        assertEquals(0, comment3.getVoteCount());
    }


    @Test
    public void testDownvote()
    {
        comment2.downvote();
        comment2.downvote();
        assertEquals(-2, comment2.getVoteCount());
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        comment2.upvote();
        assertEquals(2, comment2.getVoteCount());
        comment2.downvote();
        assertEquals(1, comment2.getVoteCount());
    }

    @Test
    public void testReturnRating()
    {
        assertEquals(5, comment4.getRating());
        assertEquals(2, comment2.getRating());
    }
}




