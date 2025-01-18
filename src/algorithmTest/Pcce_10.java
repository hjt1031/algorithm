package algorithmTest;

import java.util.Arrays;

public class Pcce_10 {
    /**
     *
     * @param mats
     * @param park
     * @return 공원 : 돗자리깔기 정사각형으로 깔아야함.
     */
    public int pcce_10(int[] mats, String[][] park) {
        int answer = -1;

        // 올림 차순 후 치환
        Arrays.sort(mats);
        for (int i = 0; i < mats.length / 2; i++) {
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }

        for (int matsLength : mats) {
            // 공원 크기를 벗어날수 없어서 matsLength 를 제한 둠.
            for (int i = 0; i <= park.length - matsLength; i++) {
                for (int j = 0; j <= park[0].length - matsLength; j++) {
                    boolean flags = true;

                    if (park[i][j].equals("-1")) {
                        // 정사각형으로 돗자리를 깔 수 있는지 체크함.
                        for(int h = 0; h < matsLength; h++) {
                            for(int k = 0; k < matsLength; k++) {
                                if (!park[i+h][j+k].equals("-1")){
                                    flags = false;
                                    break;
                                }
                            }
                            if (!flags) break;
                        }
                        if (flags) return matsLength;
                    }
                }
            }
        }

        return answer;
    }
}
