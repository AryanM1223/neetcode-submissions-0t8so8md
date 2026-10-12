class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mp, pm= {},{}

        if len(s) != len(t):
            return False

        for st in s:
            mp[st] = mp.get(st,0)+1
        
        for ts in t:
            pm[ts] = pm.get(ts,0) + 1

        return mp == pm

        