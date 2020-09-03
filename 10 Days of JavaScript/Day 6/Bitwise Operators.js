
function getMaxLessThanK(n, k) {
    
    let max = 0;

    for (let i = 1; i <= n; i++) {
        for (let j = i + 1; j <= n; j++) {
            let num = (i & j);

            (num < k && num > max) && (max = num);
        }
    }
 
    return max;
}
