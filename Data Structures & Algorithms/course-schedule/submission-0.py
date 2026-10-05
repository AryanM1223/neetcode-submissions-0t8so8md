# I can create a DAG to solve it
class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        graph = defaultdict(list)
        indeg = [0] * numCourses
        taken = 0
      
        for a,b in prerequisites:
            graph[b].append(a)
            indeg[a] += 1
        
        q = deque()
        for i in range(numCourses):
            if(indeg[i] == 0):
                q.append(i)

        while q:
            course = q.popleft()
            taken += 1
            for nxt in graph[course]:
                indeg[nxt] -= 1
                if(indeg[nxt] == 0):
                    q.append(nxt)
        
        return taken == numCourses
