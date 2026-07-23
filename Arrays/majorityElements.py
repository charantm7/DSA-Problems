from typing import List

class Solution:
    def majorityElement1(self, nums: List[int]) -> int:

        # Hash map pattern
        
        hash_map = {}

        for num in nums:
            if num in hash_map:
                hash_map[num] += 1
            else:
                hash_map[num] = 1

        val = 0
        key = 0

        for k, v in hash_map.items():
            if v > val:
                val = v
                key = k
        return key
    
    def majorityElement2(self, nums: List[int]) -> int:
        # boyers voting algo

        count = 0
        candidate = None

        for num in nums:

            if count == 0:
                candidate = num

            if num == candidate:
                count += 1
            else:
                count -= 1

        return candidate
        
            

        