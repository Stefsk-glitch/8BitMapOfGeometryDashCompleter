import java.util.ArrayList;

public class BotTester
{
    private Integer[] env = new Integer[8];
    public BotTester(Integer[] env)
    {
        this.env = env;
    }

    public void testBots(ArrayList<Bot> bots)
    {
        for (Bot bot : bots)
        {
            Integer[] botSteps = bot.getSteps();

            for (int i = 0; i < 8; i++)
            {
                int envValue = env[i];
                int botValue = botSteps[i];

                if (envValue == botValue)
                {
                    bot.addOneToReward();
                }
                else
                {
                    break;
                }
            }
        }
    }
}
