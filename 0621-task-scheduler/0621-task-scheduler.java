class Solution {
    public int leastInterval(char[] tasks, int n) {
 int[] f = new int[26];
        for (char t : tasks) {
            f[t - 'A']++;
        }
        Arrays.sort(f);
        int chunk = f[25] - 1;
        int idle = chunk * n;
        for (int i = 24; i >= 0; i--) { // Fixed the loop condition
            idle -= Math.min(chunk, f[i]);
        }
        return idle < 0 ? tasks.length : idle + tasks.length;
    }
}