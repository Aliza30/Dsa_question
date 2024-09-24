class Node {
    boolean flag = false;
    Node[] list = new Node[10];

    void put(Node new_node, char ch) {
        list[ch - '0'] = new_node;
    }

    boolean containKey(char ch) {
        return list[ch - '0'] != null;
    }

    Node get(char ch) {
        return list[ch - '0'];
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}

class Solution {
    private Node root;

    public Solution() {
        root = new Node();
    }

    public void insert(String num) {
        Node node = root;
        for (char ch : num.toCharArray()) {
            if (!node.containKey(ch)) {
                node.put(new Node(), ch);
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    public void Lcp(String num, int[] maxLen) {
        Node node = root;
        int len = 0;
        for (char ch : num.toCharArray()) {
            if (!node.containKey(ch)) {
                return;
            }
            len++;
            maxLen[0] = Math.max(maxLen[0], len);
            node = node.get(ch);
        }
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        for (int num : arr2) {
            insert(String.valueOf(num));
        }

        int[] maxLen = {0};
        for (int num : arr1) {
            Lcp(String.valueOf(num), maxLen);
        }
        return maxLen[0];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr1 = {123, 456, 789};
        int[] arr2 = {123, 789, 456};
        System.out.println(sol.longestCommonPrefix(arr1, arr2));  // Expected Output: 3
    }
}