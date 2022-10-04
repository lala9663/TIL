package campus.assignment4;


import java.util.Arrays;

/**
 * - 아래 테이블의 데이터를 저장하는 이차원 배열 `int[][] scores2d`를 만들자. `원소중복 없음`
 * - `각 과목별 학생 성적 평균`을 계산하는 프로그램을 작성해보자.
 * - `각 학생별 과목 성적 평균`을 계산하는 프로그램을 작성해보자.
 * - 각 과목별 학생 성적 평균을 `내림차순`으로 정렬하고 각 성적을 받은 `과목 이름`도 같이 출력해보자.
 * - 각 학생별 과목 성적 평균을 `오름차순`으로 정렬하고 각 성적을 받은 `학생 번호`도 같이 같이 출력해보자.
 */

public class Practice03 {

    public static void main(String[] args) {
     int[][] score2d = {
             {50, 60, 70},
             {60, 76, 100},
             {95, 88, 87},
             {60, 65, 85},
             {100, 85, 77}};

     double[] studentAvg = new double[score2d.length];
     double[] lecturesAvg = new double[score2d.length];

     setStudentAvg(score2d, studentAvg);
     setLectureAvg(score2d, lecturesAvg);

        System.out.println("각 학생별 과목 성적 평균: " + Arrays.toString(studentAvg));
        System.out.println("각 과목별 학생 성적 평균: " + Arrays.toString(lecturesAvg));

        int[] studentsNum = {1, 2, 3, 4, 5};
        String[] lecturesName = {"국어", "수학", "영어"};

     bubbleAscendSort(studentAvg, studentsNum);
     bubbleDescendSort(lecturesAvg, lecturesName);

        System.out.println();
        System.out.println("오름차순으로 정렬한 학생별 과목들의 평균: " + Arrays.toString(studentAvg));
        System.out.println("학생순서 : "+ Arrays.toString(studentsNum));

        System.out.println();
        System.out.println("내림차순으로 정렬한 과목별 학생들의 평균: " + Arrays.toString(lecturesAvg));
        System.out.println("과목순서 : "+ Arrays.toString(lecturesName));



    }

    private static void bubbleDescendSort(double[] lecturesAvg, String[] lecturesName) {    //과목별 학생 평균 내림차순
        for (int i = 0; i < lecturesAvg.length; i++) {
            for (int j = lecturesAvg.length - 1; j > 0; j--) {
                if (lecturesAvg[j - 1] < lecturesAvg[j]) {    //앞과목의 학생평균 < 뒤과목의 학생평균인 경우 위치를 바꿔준다
                    double tempAvg = lecturesAvg[j - 1];
                    lecturesAvg[j - 1] = lecturesAvg[j];
                    lecturesAvg[j] = tempAvg;
                    //이때 기존의 과목이름의 순서도 같이 바꿔준다
                    String tempNum = lecturesName[j - 1];
                    lecturesName[j - 1] = lecturesName[j];
                    lecturesName[j] = tempNum;
                }
            }
        }
    }

    private static void bubbleAscendSort(double[] studentAvg, int[] studentsNum) {
        for (int i = 0; i < studentAvg.length ; i++) {
            for (int j = i+1; j <studentAvg.length ; j++) {
                if (studentAvg[j-1] > studentAvg[j]){
                    double tempeNum= studentAvg[j-1];
                    studentAvg[j-1] = studentAvg[j];
                    studentAvg[i] = tempeNum;
                    int tempNum = studentsNum[j-1];
                    studentsNum[j -1] = studentsNum[j];
                    studentsNum[j]= tempNum;
                }
            }
        }
    }

    private static void setLectureAvg(int[][] score2d, double[] lecturesAvg) {
        for (int i = 0; i <score2d[0].length ; i++) {
            double sum = 0;
            for (int j = 0; j <score2d.length ; j++) {
                sum = sum + score2d[j][i];
            }
            lecturesAvg[i] = sum / score2d.length;
        }
    }

    private static void setStudentAvg(int[][] score2d, double[] studentAvg) {
        for (int i = 0; i < score2d.length; i++) {
            double sum = 0;
            for (int j = 0; j < score2d[i].length ; j++) {
                sum = sum + score2d[i][j];
            }
            studentAvg[i] = sum / score2d[i].length;
        }
    }


}