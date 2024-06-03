/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var appendCharacters = function(s, t) {
      const m = s.length;
        const n = t.length;
        let i = 0, j = 0;

        while (i < m && j < n) {
            if (s.charAt(i) === t.charAt(j)) {
                j++;
            } 
                i++;
    
        }

        return n - j;
    
};