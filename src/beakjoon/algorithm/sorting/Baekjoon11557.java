package beakjoon.algorithm.sorting;
/*
문제
- 입학 OT때 누구보다도 남다르게 놀았던 당신은 자연스럽게 1학년 과대를 역임하게 되었다.
  타교와의 조인트 엠티를 기획하려는 당신은 
  근처에 있는 학교 중 어느 학교가 술을 가장 많이 먹는지 궁금해졌다.
  학교별로 한 해동안 술 소비량이 주어질 때, 가장 술 소비가 많은 학교 이름을 출력하여라.
입력
- 입력의 첫 줄에는 테스트 케이스의 숫자 T가 주어진다.
  매 입력의 첫 줄에는 학교의 숫자 정수 N(1 ≤ N ≤ 100)이 주어진다.
  이어서 N줄에 걸쳐 학교 이름 S(1 ≤ |S| ≤ 20, S는 공백없는 대소문자 알파벳 문자열)와 
  해당 학교가 지난 한 해동안 소비한 술의 양 L(0 ≤ L ≤ 10,000,000)이 공백으로 구분되어 정수로 주어진다.
  같은 테스트 케이스 안에서 소비한 술의 양이 같은 학교는 없다고 가정한다.
출력
- 각 테스트 케이스마다 한 줄에 걸쳐 술 소비가 가장 많은 학교의 이름을 출력한다.
ex 1)
입력                출력
- 2                 - Korea
  3                   Korea
  Yonsei 10
  Korea 10000000
  Ewha 20
  2
  Yonsei 1
  Korea 10000000
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11557 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int uni = Integer.parseInt(br.readLine());

      String[] name = new String[uni];
      int[] drink = new int[uni];

      for (int j = 0; j < uni; j++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        name[j] = st.nextToken();
        drink[j] = Integer.parseInt(st.nextToken());
      }

      int max = 0;
      int index = 0;

      for (int k = 0; k < uni; k++) {
        if (max < drink[k]) {
          max = drink[k];
          index = k;
        }
      }
      System.out.println(name[index]);
    }
  }
}
