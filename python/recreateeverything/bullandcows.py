class Solution(object):
    def getHint(self, secret, guess):
        bull=0
        cow=0
        secret_count={}
        guess_count={}
        for i in range(len(guess)):
            if guess[i]==secret[i]:
                bull+=1
            else:
                secret_count[secret[i]]=secret_count.get(secret[i],0)+1
                guess_count[guess[i]]=guess_count.get(guess[i],0)+1
        cow=sum(min(secret_count.get(d,0),c) for d,c in guess_count.items())
        return f"{bull}A{cow}B"
s=Solution()
print(s.getHint("11","10"))