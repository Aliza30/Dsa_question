/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var areAlmostEqual = function(s1, s2) {
   // Step 1: Check if lengths are equal
    if (s1.length !== s2.length) {
        return false;
    }

    // Step 2: Check if strings are already equal
    if (s1 === s2) {
        return true;
    }

    // Step 3: Find mismatched indices
    let list = [];
    for (let i = 0; i < s1.length; i++) {
        if (s1[i] !== s2[i]) {
            list.push(i);
        }
    }
if(list.length === 2 && s1[list[0]] === s2[list[1]] && s1[list[1]] === s2[list[0]])
return true;
else
    return false;

};