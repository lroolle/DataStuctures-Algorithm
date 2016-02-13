package WeChatAlgorithms;

import java.util.Random;

/**
 * @author Eric Wang <wrqatw@gmail.com>.
 */
public class RandomMoney {

    private static leftMoneyPackage _leftMoneyPackage;

    public static double getRandomMoney(leftMoneyPackage _leftMoneyPackage) {
        RandomMoney._leftMoneyPackage = _leftMoneyPackage;

        if (_leftMoneyPackage.remainSize == 1){
            _leftMoneyPackage.remainSize--;
            return (double) Math.round(_leftMoneyPackage.remainMoney * 100) / 100;
        }

        Random r = new Random();
        double min = 0.01;
        double max = _leftMoneyPackage.remainMoney / _leftMoneyPackage.remainSize * 2;
        double money = r.nextDouble() * max;

        money = money <= min ? 0.01: money;
        money = Math.floor(money * 100) / 100;
        _leftMoneyPackage.remainMoney -= money;
        _leftMoneyPackage.remainSize--;

        return money;

    }
}


