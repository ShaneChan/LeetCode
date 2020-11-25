package Algorithm;

public class ReplicateNum {
    public int duplicateNum(int[] arrays) {
        int temp = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == i) {
                continue;
            }
            if (arrays[arrays[i]] == arrays[i]) {
                return i;
            } else {
                temp = arrays[i];
                arrays[i] = arrays[arrays[i]];
                arrays[arrays[i]] = temp;
            }
        }

        return -1;
    }
}
