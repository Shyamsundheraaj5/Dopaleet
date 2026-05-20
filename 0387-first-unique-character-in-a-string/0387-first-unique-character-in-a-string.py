class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq=[0]*26

        for char in s:
            freq[ord(char)-ord('a')] +=1
        
        for index, char in enumerate(s):
            if(freq[ord(char)-ord('a')]==1):
                return index
        return -1