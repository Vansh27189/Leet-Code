class Solution {
public:
    bool isAnagram(string s1, string s2) {
        sort(begin(s1), end(s1));
        sort(begin(s2), end(s2));

        if(s1==s2){
            return true;
        }
        else{
            return false;
        }
    }
};