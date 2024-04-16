def orderAgnosticBinarySearch(arr , key):

    low = 0
    high = len(arr) - 1
    isAsc = arr[low] < arr[high]

    while low <= high:
        mid = low + (high - low) // 2 
        
        # If the key is found at mid, return the index
        if key == arr[mid]:
            return mid
        else:
            # if array sorted in ascending order
            if isAsc: 
                if key > arr[mid]:
                    low = mid + 1
                else:
                    high = mid - 1
            # if array sorted in descending order
            else:
                if key < arr[mid]:
                    low = mid + 1
                else:
                    high = mid - 1
                    
    # the key is not found
    return -1

print(orderAgnosticBinarySearch([1,2,3,4,5] , 2))
print(orderAgnosticBinarySearch([5,4,3,2,1] , 2))