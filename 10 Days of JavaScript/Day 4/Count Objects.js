/*
 * Return a count of the total number of objects 'o' satisfying o.x == o.y.
 * 
 * Parameter(s):
 * objects: an array of objects with integer properties 'x' and 'y'
 */
function getCount(objects) {
    //The filter() method creates an array filled with all array elements that pass a test (provided as a function)
    return objects.filter(item =>item.x===item.y).length;
}