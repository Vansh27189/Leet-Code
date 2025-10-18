class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> result;
        int n = strs.size();
        unordered_map<string ,vector<string>> mp;
        for(int i = 0; i<n; i++){
            string temp = strs[i];
            sort(begin(temp), end(temp));
            mp[temp].push_back(strs[i]);

        }

        for(auto pair : mp){
            result.push_back(pair.second);
        }
        return result;
    }
};