/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array
**/
function getSecondLargest(nums) {
    
    var max = Math.max(...nums);
    for(var i= 0; i<nums.length;i++){
        if (nums[i]=== max){
           nums.splice(i,1);
           i--; 
        }
    }
    return Math.max(...nums);
}

