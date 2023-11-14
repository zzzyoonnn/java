package beakjoon.algorithm.implementation;
/*
문제
- 현대 모비스는 모빌리티 SW 해커톤, 알고리즘 경진대회, 채용 연계형 SW 아카데미 등 다양한 SW 인재 발굴 프로그램을 진행하고 있다. 
  지난 2월에 개최된 모빌리티 SW 해커톤은 국내 14개 대학의 소프트웨어 동아리 20개 팀, 70여 명이 참여해 모빌리티 소프트웨어 개발 실력을 겨뤘다.
  숭실대학교 컴퓨터학부 문제해결 소모임 SCCC 부원들은 
  매년 모빌리티 SW 해커톤, SCON, ICPC와 같은 팀 대회에서 사용할 팀명을 정하기 위해 많은 고민을 한다. 
  졸업을 한 학기 남겨둔 성서는 더 이상 부원들이 팀명으로 고통을 받지 않도록 가이드라인을 만들었다.
  성서의 가이드라인에 따르면 팀 이름을 짓는 방법은 두 가지가 있다.
    1. 세 참가자의 입학 연도를 100으로 나눈 나머지를 오름차순으로 정렬해서 이어 붙인 문자열
    2. 세 참가자 중 성씨를 영문으로 표기했을 때의 첫 글자를 백준 온라인 저지에서 해결한 문제가 많은 사람부터 차례대로 나열한 문자열
  예를 들어 600문제를 해결한 18학번 안(AHN)씨, 2000문제를 해결한 19학번 이(LEE)씨, 6000문제를 해결한 20학번 오(OH)씨로 구성된 팀을 생각해 보자. 
  첫 번째 방법으로 팀명을 만들면 181920이 되고, 두 번째 방법으로 팀명을 만들면 OLA가 된다.
  2000문제를 해결한 19학번 이(LEE)씨, 9000문제를 21학번 나(NAH)씨, 1000문제를 해결한 22학번 박(PARK)씨로 구성된 팀은 
  첫 번째 방법으로 팀명을 만들면 192122가 되고, 두 번째 방법으로 팀명을 만들면 NLP가 된다.
  세 팀원의 백준 온라인 저지에서 해결한 문제의 개수, 입학 연도, 그리고 성씨가 주어지면 
  첫 번째 방법과 두 번째 방법으로 만들어지는 팀명을 차례대로 출력하는 프로그램을 작성하라.
입력
- 첫째 줄에 첫 번째 팀원이 백준 온라인 저지에서 해결한 문제의 개수 P1, 입학 연도 Y1, 성씨 S1이 공백으로 구분되어 주어진다.
  둘째 줄과 셋째 줄에는 두 번째 팀원의 정보 P2,Y2,S2와 세 번째 팀원의 정보 P3,Y3,S3이 첫째 줄과 같은 형식으로 주어진다.
출력
- 첫째 줄에 첫 번째 방법으로 만든 팀명을 출력한다.
  둘째 줄에 두 번째 방법으로 만든 팀명을 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon28114 {
  public static void main(String[] agrs) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[] solved = new int[3];
    int[] year = new int[3];
    String[] name = new String[3];

    for (int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine());
      solved[i] = Integer.parseInt(st.nextToken());
      year[i] = Integer.parseInt(st.nextToken()) % 2000;
      name[i] = st.nextToken();
    }

    int[] sorted_solved = Arrays.copyOf(solved, solved.length);
    Arrays.sort(sorted_solved);

    Arrays.sort(year);
    for (int i : year) System.out.print(i);
    System.out.println();

    for (int i = 2; i >= 0; i--) {
      for (int j = 0; j < 3; j++) {
        if (sorted_solved[i] == solved[j]) System.out.print(name[j].charAt(0));
      }
    }
  }
}
