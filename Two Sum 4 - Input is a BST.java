class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet();
        return findTargetHelper(root, k, set);
    }

    private boolean findTargetHelper(TreeNode root, int k, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }

        if (set.contains(k - root.val)) {
            return true;
        }

        set.add(root.val);
        return findTargetHelper(root.left, k, set) || findTargetHelper(root.right, k, set);
    }
}
