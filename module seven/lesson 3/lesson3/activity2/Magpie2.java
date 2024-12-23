/**
 * A program to carry on conversations with a human user.
 * This version includes additional keywords and responses,
 * as well as a response for empty or whitespace-only input.
 * @author Laurie White
 * @version April 2012 (Modified)
 * 
 * 
 * 
 * Ibrahim Shahid
 * North Carolina Virtual Public Schools
 * 11/26/2024
 * Using for if else statements to make extremley rudimentary chatbots
 */
public class Magpie2
{
    /**
     * Get a default greeting 	
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        statement = statement.trim(); // Remove leading and trailing whitespace
        
        if (statement.length() == 0)
        {
            response = "Please say something.";
        }
        else if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("school") >= 0)
        {
            response = "What is your favorite subject in school?";
        }
        else if (statement.indexOf("computer") >= 0)
        {
            response = "What do you like about computers?";
        }
        else if (statement.indexOf("food") >= 0)
        {
            response = "What's your favorite food?";
        }
        else if (statement.indexOf("travel") >= 0)
        {
            response = "Where would you like to travel?";
        }
        else if (statement.indexOf("movie") >= 0)
        {
            response = "What's the best movie you've seen recently?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }

        return response;
    }
}
/*
 * sample output
 * input: movie
 * whats the best movie youve seen recently
 * input: food
 * whats your favorite food
 */