/**
 * @param {number[]} nums
 * @return {number}
 */
var countBadPairs = function(nums) {
    let n = nums.length;
    let total = (n * (n - 1)) / 2;
    let success = 0;
    let store = new Map();

    for (let i = 0; i < n; i++) {
        let diff = i - nums[i];
        store.set(diff, (store.get(diff) || 0) + 1);
    }

    for (let count of store.values()) {
        success += (count * (count - 1)) / 2;
    }

    return total - success; 
};