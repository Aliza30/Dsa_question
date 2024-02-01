/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
     if (numRows === 1) return s;
        let str = '';
        const k = 2 * (numRows - 1);

        for (let r = 0; r < numRows; r++) {
            let index = r;

            while (index < s.length) {
                str += s.charAt(index);

                if (r !== 0 && r !== numRows - 1) {
                    const k1 = k - 2 * r;
                    const k2 = index + k1;

                    if (k2 < s.length) {
                        str += s.charAt(k2);
                    }
                }

                index += k;
            }
        }

        return str;
};