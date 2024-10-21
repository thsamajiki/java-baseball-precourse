package baseball;

import java.util.List;

public class CompareNumbers {
  private boolean gameOver;

  public void compareNumbers(Player player, Computer computer) {
    List<Integer> randomNumberList = computer.getRandomNumberList();
    player.playerInputNumber(); // 플레이어가 숫자를 입력
    List<Integer> playerNumberList = player.getInputNumberList();

    int strikes = calculateStrikes(randomNumberList, playerNumberList);
    int balls = calculateBalls(randomNumberList, playerNumberList);
  }

  private int calculateStrikes(List<Integer> randomNumberList, List<Integer> playerNumberList) {
    int strikes = 0;

    for (int i = 0; i < randomNumberList.size(); i++) {
      if (randomNumberList.get(i).equals(playerNumberList.get(i))) {
        strikes++;
      }
    }

    return strikes;
  }

  private int calculateBalls(List<Integer> randomNumberList, List<Integer> playerNumberList) {
    int balls = 0;

    for (int i = 0; i < randomNumberList.size(); i++) {
      if (randomNumberList.contains(playerNumberList.get(i)) && !randomNumberList.get(i).equals(playerNumberList.get(i))) {
        balls++;
      }
    }

    return balls;
  }
}
