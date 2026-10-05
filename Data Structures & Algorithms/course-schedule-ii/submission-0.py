class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:

        graph = defaultdict(list)
        indeg = [0] * numCourses
        ans = []
        
        for a,b in prerequisites:
            graph[b].append(a)
            indeg[a] += 1
        
        q = deque()
        for i in range(numCourses):
            if(indeg[i] == 0):
                q.append(i)
        
        while q:
            course = q.popleft()
            ans.append(course)
            for nxt in graph[course]:
                indeg[nxt] -= 1
                if(indeg[nxt] == 0):
                    q.append(nxt)

            if (len(ans) == numCourses):
                return ans
        
        return []