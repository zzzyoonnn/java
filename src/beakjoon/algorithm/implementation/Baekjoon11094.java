package beakjoon.algorithm.implementation;
/*
문제
- 영어공부를 열심히 하고 있는 꿍이 대학교MT에 놀러가서 친해지고 싶은 후배들과 Simon Says 게임을 하려고 한다.
  "Simon Says" 게임의 룰은 간단하다. 
  만약 어떤 사람이 "Simon says"라고 말한 후 어떤 지시사항을 이야기했다면 
  모두 그 지시사항을 따라 하기만 하면 된다. 
  예를 들어 영어를 잘하는 꿍이 "Simon says touch your nose"라고 말한다면 모두 코를 만져야한다. 
  하지만 이때, 꿍이 "Stop touching your nose" 라고 말했을 때 
  누군가 코를 만지는 것을 멈춘다면 그 플레이어는 벌칙을 받아야 한다.
  즉, Simon says 라고 말한 후에 나온 지시사항만을 따라야 하는 것이다.
  하지만 똑똑한 컴공 후배들은 절대 실수할리 없는 컴퓨터 프로그램을 짜서 이 게임을 하려고 한다.
입력
- 입력은 1 ≤ N ≤ 1 000의 N을 포함하는 줄로 시작한다.
  다음 각 N줄은 한 개의 명령이 주어지며 그 길이는 100이 넘지 않는다.
  각 명령은 대소문자가 적절히 쓰여져 있으며 각 단어는 공백으로 구분되고 문장의 끝은 마침표로 끝난다.
  일부 명령들은 "Simon says"라고 시작하는데 어떤 명령들은 그렇지 않을 수도 있다.
  만약 명령이 "Simon says"라고 시작한다면, 항상 "says" 뒤에 공백과 최소 한 개 이상의 추가적인 단어가 주어진다.
  어떠한 명령도 공백으로 시작하거나 끝나지 않는다.
출력
- 정확히 "Simon says"가 나오는 문장에 대해서만 "Simon says" 이후에 나오는 나머지 부분을 각 줄에 출력한다.
  그렇지 않은 문장은 무시한다.
ex 1)
입력
- 1
  Simon says smile.
출력
-  smile.
ex 2)
입력
- 3
  Simon says raise your right hand.
  Lower your right hand.
  Simon says raise your left hand.
출력
-  raise your right hand. 
   raise your left hand. 
ex 3)
입력
- 3
  Raise your right hand.
  Lower your right hand.
  Simon says raise your left hand.
출력
-  raise your left hand. 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11094 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String s = br.readLine();
      String simon = s.replace("Simon says ", " ");
      if (s.equals(simon)) continue;
      else System.out.println(simon); 
    }
  }
}
