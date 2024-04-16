#ceiling of a number
# The function findCeiling uses binary search to find the ceiling of a target number in a sorted array.
# The ceiling of a number is the smallest number in the array that is greater than or equal to the target.
# If the target number is found in the array, it is its own ceiling.
# If the target number is not found, we return the smallest number that is greater than the target.
# If all numbers in the array are smaller than the target, the function returns the first element after the end of the array, which is undefined.

def findCeiling(arr, target):
    start , end = 0 , len(arr) - 1

    if target > arr[end]: return -1 

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

    # If the target is not found, return the smallest element that is greater than the target
    return arr[start]

print(findCeiling([1 ,5 ,8 ,13 ,20] , 21))
print(findCeiling([1 ,5 ,8 ,13 ,20] , 0))
print(findCeiling([1 ,5 ,8 ,13 ,20] , 4))