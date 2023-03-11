import java.util.ArrayList;
import java.util.Arrays;

public class Bot
{
    private int reward = 0;
    private Integer[] steps;
    public Bot(Integer[] steps)
    {
        this.steps = steps;
    }
    public void addOneToReward()
    {
        reward++;
    }
    public int getReward()
    {
        return reward;
    }
    public Integer[] getSteps()
    {
        return steps;
    }

    @Override
    public String toString()
    {
        return "Bot{" +
                "reward=" + reward +
                ", steps=" + Arrays.toString(steps) +
                '}';
    }
}
