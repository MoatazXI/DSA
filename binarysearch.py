def binarySearch(arr , key):

    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = low + (high - low) // 2 
        
        # If the key is found at mid, return the index
        if key == arr[mid]:
            return mid
        else:
            # If the key is greater than the mid element, move the low pointer to mid + 1
            if key > arr[mid]:
                low = mid + 1
            # If the key is less than the mid element, move the high pointer to mid - 1
            else:
                high = mid - 1

    # the key is not found
    return -1



print(binarySearch([1 , 2 , 3 , 4 , 5] , 2))