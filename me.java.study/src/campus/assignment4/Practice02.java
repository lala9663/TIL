package campus.assignment4;

public class Practice02 {
    public static void main(String[] args) {

        int[] nums = new int[100];      // 배열 100개 저장
//        int ran = (int)(Math.random()*100)+1;
        int max = nums[0];              // 최댓값
        int min = nums[0];              // 최솟값

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random()*100)+1;       // for문 안에 랜덤값을 생성해야 원하는 길이만큼 반복생성
            if (max < nums[i]){
                // max의 값보다 array[i]이 크면 max = array[i]
                max = nums[i];
            }

            if (min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);



    }
}
