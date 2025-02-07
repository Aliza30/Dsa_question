/**
 * @param {number} limit
 * @param {number[][]} queries
 * @return {number[]}
 */
var queryResults = function(limit, queries) {
    const ball = new Map(), color = new Map(), ans = []
  let distinct = 0

  for (const [pos, c] of queries) {
    if (ball.has(pos)) {
      let prevColor = ball.get(pos)
      let cnt = color.get(prevColor) - 1
      if (cnt === 0) {
        color.delete(prevColor)
        distinct--
      } else {
        color.set(prevColor, cnt)
      }
    }

    ball.set(pos, c)
    let cnt = (color.get(c) || 0) + 1
    color.set(c, cnt)
    if (cnt === 1) distinct++

    ans.push(distinct)
  }

  return ans 
};