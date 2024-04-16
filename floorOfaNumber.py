#ceiling of a number
# The function findFloor uses binary search to find the Floor of a target number in a sorted array.
# The Floor of a number is the largest number in the array that is less than or equal to the target.
# If the target number is found in the array, it is its own Floor.
# If the target number is not found, we return the largest number that is less than the target.
# If all numbers in the array are bigger than the target, the function returns the first element after the end of the array, which is undefined.

def findFloor(arr, target):

    start , end = 0 , len(arr) - 1

    if target < arr[start]: return -1
    
    while(start <= end):
        mid = (start + end) // 2

        # If the target is found, return it
        if target == arr[mid]:
            return arr[mid]
        else:
            # If the target is greater than the middle element, discard the left half of the array
            if target > arr[mid]:
                start = mid + 1
            # If the target is less than the middle element, discard the right half of the array
            else:
                end = mid - 1

    # If the target is not found, return the largest element that is less than the target
    return arr[end]

print(findFloor([1 ,5 ,8 ,13 ,20] , 21))