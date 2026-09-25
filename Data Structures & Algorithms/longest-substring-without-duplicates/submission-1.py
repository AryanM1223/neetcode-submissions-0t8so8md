class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        sets = set();
        i,j = 0,0;
        n = len(s);
        maxlen = 0;

        while(j < n):
            if(s[j] not in sets):
                sets.add(s[j])
                j+=1
            else:
                while(s[j] in sets):
                    sets.remove(s[i])
                    i+=1;
               
            
            maxlen = max(maxlen,(j - i));
        
        return maxlen



        