/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
// var mergeAlternately = function(word1, word2) {
//   const result='';
//   const max = Math.max(word1.length, word2.length);
// for( let i in max){
// if (i < word1.length) result += word1[i];
//     if (i < word2.length) result += word2[i];
// }
// return result;
// };
var mergeAlternately = function(word1, word2) {
  let result = '';
  const max = Math.max(word1.length, word2.length);
  
  for (let i = 0; i < max; i++) {
    if (i < word1.length) result += word1[i];
    if (i < word2.length) result += word2[i];
  }

  return result;
};
