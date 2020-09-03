

/*
 * Modify and return the array so that all even elements are doubled and all odd elements are tripled.
 * 
 * Parameter(s):
 * nums: An array of numbers.
 */
function modifyArray(nums) {
    /*map itirates for each element in an array, in order, and constructs a new array from the results*/
    var newArray = nums.map(n => n = (n%2==0) ? n*2: n*3);  // n => is  passing function on map 
    // n = is parameter
    return newArray;
    
}

