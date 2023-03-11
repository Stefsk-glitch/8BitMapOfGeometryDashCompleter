import java.util.ArrayList;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Integer[] env = new Integer[8];
        Bot bestBot = null;
        int bestReward = 0;

        for (int i = 0; i < 8; i++)
        {
            int value = random.nextBoolean() ? 1 : 0;
            env[i] = value;
        }

        String envString = "";

        // sout env
        for (int i = 0; i < env.length; i++)
        {
            envString += env[i];
        }

        System.out.println(envString);

        BotBuilder botBuilder = new BotBuilder();

        while(true)
        {
            ArrayList<Bot> bots = null;

            if (bestBot != null)
            {
                bots = botBuilder.buildBots(bestBot, bestBot.getReward());
            }
            else
            {
                bots = botBuilder.buildBots();
            }

            BotTester botTester = new BotTester(env);
            botTester.testBots(bots);

            for (Bot bot : bots)
            {
                int botRewards = bot.getReward();

                if (botRewards > bestReward)
                {
                    bestBot = bot;
                    bestReward = botRewards;
                    System.out.println(bestReward);
                }
            }

            if (bestBot.getReward() == 8)
            {
                System.out.println(bestBot.toString());
                break;
            }
        }
    }
}