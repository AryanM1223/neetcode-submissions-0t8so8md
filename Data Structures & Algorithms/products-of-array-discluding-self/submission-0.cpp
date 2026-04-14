class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int zCnt = 0;

        int prod = 1;

        for(int x: nums){
            if(x == 0){
                zCnt++;
            }
            else{
                prod *= x;
            }
        }

        if(zCnt > 1){
            return vector<int>(nums.size(),0);
        }else if(zCnt == 1){
            vector<int> temp(nums.size(),0);

            for(int i = 0 ; i < nums.size(); i++){
                if(nums[i] == 0) temp[i] = prod;
            }
            return temp;
        }else{
            vector<int> temp(nums.size(),0);

            for(int i = 0 ; i < nums.size(); i++){
                temp[i] = prod/nums[i];
            }
            return temp;
        }
    }
};
