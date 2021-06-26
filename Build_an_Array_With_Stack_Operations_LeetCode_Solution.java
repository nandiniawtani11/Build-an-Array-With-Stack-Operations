class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack=new Stack<Integer>();
        List<String> list=new ArrayList<String>();
        int t=0;
        for(int k=1;k<=n;k++){
            stack.push(k);
            list.add("Push");
            if(k!=target[t]){
                stack.pop();
                list.add("Pop");
            }
            else{
                if(t!=target.length-1){
                    t++;
                }
                else{
                    break;
                }
            }
        }
        return list;
    }
}
