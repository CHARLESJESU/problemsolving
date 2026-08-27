class QuickSort:
    def solution(self, arr):
        self.quick_sort(arr, 0, len(arr) - 1)
        return arr
    def quick_sort(self, arr, low, high):
        if low < high:
            # pi is partitioning index, arr[pi] is now at right place
            pi = self.partition(arr, low, high)
            # Recursively sort elements before partition and after partition
            self.quick_sort(arr, low, pi - 1)
            self.quick_sort(arr, pi + 1, high)
    def partition(self, arr, low, high):
        # Choose the rightmost element as pivot
        pivot = arr[high]
        
        # Pointer for greater element
        i = low - 1
        # Traverse through all elements and compare each element with pivot
        for j in range(low, high):
            if arr[j] <= pivot:
                # If element smaller than pivot is found, swap it with the greater element pointed by i
                i = i + 1
                # Swapping elements
                arr[i], arr[j] = arr[j], arr[i]
        # Swap the pivot element with the greater element specified by i
        arr[i + 1], arr[high] = arr[high], arr[i + 1]
        
        # Return the position from where partition is done
        return i + 1
# Testing the algorithm
s = QuickSort()
print(s.solution([4, 3, 2, 10, 12, 1, 5, 6]))