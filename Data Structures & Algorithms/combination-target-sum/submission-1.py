class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        ans = 0
        suc = []
        def dfs(i):
            nonlocal ans
            if (ans == target):
                res.append(suc.copy())
                return

            if(ans > target or i == len(nums)):
                return

            suc.append(nums[i])
            ans += nums[i]
            dfs(i)

            t = suc.pop()
            ans -= t
            dfs(i + 1)
        
        dfs(0)
        return res

            



        
        