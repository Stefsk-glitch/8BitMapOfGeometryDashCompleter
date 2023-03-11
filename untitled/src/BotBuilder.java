import java.util.ArrayList;
import java.util.Random;

public class BotBuilder
{
    public ArrayList<Bot> buildBots()
    {
        ArrayList<Bot> bots = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++)
        {
            Integer[] steps = new Integer[8];

            for (int j = 0; j < 8; j++)
            {
                int value = random.nextInt() % 2;

                if (value == -1)
                {
                    value = 1;
                }

                steps[j] = value;
            }

            Bot bot = new Bot(steps);
            bots.add(bot);
        }

        return bots;
    }

    public ArrayList<Bot> buildBots(Bot bestBot, int bestReward)
    {
        Integer[] bestBotSteps = bestBot.getSteps();
        ArrayList<Bot> bots = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++)
        {
            Integer[] steps = new Integer[8];

            for (int j = 0; j < bestReward; j++)
            {
                steps[j] = bestBotSteps[j];
            }

            for (int j = bestReward; j < 8; j++)
            {
                int value = random.nextInt() % 2;

                if (value == -1)
                {
                    value = 1;
                }

                steps[j] = value;
            }

            Bot bot = new Bot(steps);
            bots.add(bot);
        }

        return bots;
    }

    public String arrayToStringBestReward(Integer[] array, int bestReward)
    {
        String str = "";

        for (int i = 0; i < bestReward; i++)
        {
            str = str + array[i].toString();
        }

        return str;
    }

    public String arrayToString(Integer[] array)
    {
        String str = "";

        for (int i = 0; i < array.length; i++)
        {
            str = str + array[i].toString();
        }

        return str;
    }
}
