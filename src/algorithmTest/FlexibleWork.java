package algorithmTest;

import java.util.*;

/**
 * PackageName :  algorithmTest
 * FileName : FlexibleWork
 *
 * @Company : DAQUV
 * @Author :  hajuntae
 * @Date : 2025 02 10 오후 8:53
 * @Version : 1.0
 * @Desc :
 * @History :
 * 이름     :     일자             :    근거자료          : 변경내용
 * ------------------------------------------------------
 * hajuntae  : 2025 02 10 오후 8:53       :                : 유연근무제
 */
public class FlexibleWork {


    public int flex (int[] schedules, int[][] timelogs, int startday) {
//        int answer = schedules.length;
//
//        for (int i = 0; i < schedules.length; i++) {
//            int start = startday, schedule = (schedules[i] + 10) % 100 > 59 ? schedules[i] + 10 + 40 : schedules[i] + 10;
//            for (int j = 0; j < timelogs[i].length; j++, start++) {
//                if (start % 7 == 0 || start % 7 == 6) continue;
//                if (timelogs[i][j] > schedule) {
//                    answer--;
//                    break;
//                }
//            }
//        }
//
//        return answer;

        int i0, i1, t0, t1, n = schedules.length, answer = 0;
        startday--;
        for(i0 = 0; i0 < n; i0++)
        {
            t0 = schedules[i0]/100*60+(schedules[i0]%100);
            for(i1 = 0; i1 < 7; i1++)
            {
                if((startday+i1)%7<5)
                {
                    t1 = timelogs[i0][i1]/100*60+(timelogs[i0][i1]%100);
                    if(t0+10<t1)
                        break;
                }
            }
            if(i1==7)
                answer++;
        }
        return answer;


//        int result = 0;
//        int[] arr = {1,2,3,4,5,6,7};
//        int index = -1;
//
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i] == startday){
//                index = i;
//                break;
//            }
//        }
//        int[] newArr = new int[arr.length];
//        if (index != -1) {
//
//            int newIndex = 0;
//
//            for (int i = index; i < arr.length; i++) {
//                newArr[newIndex++] = arr[i];
//            }
//
//            for (int i = 0; i < index; i++) {
//                newArr[newIndex++] = arr[i];
//            }
//
//        }
//
//
//        for(int j = 0; j < schedules.length; j ++) {
//            int good = 1;
//            int scheduleMin = schedules[j];
//            int scheduleMax = scheduleMin + 10;
//
//            for(int i = 0; i < newArr.length; i++) {
//                if (newArr[i] != 6 && newArr[i] != 7) {
//                    int scheduleStart = timelogs[j][i];
//                    if (scheduleStart <= scheduleMax) {
//                        if (good == 5) {
//                            result ++;
//                        }
//                        good++;
//                    }
//                }
//            }
//        }
//
//        return result;
    }
}
