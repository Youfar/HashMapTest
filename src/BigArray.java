/**
 * Created by youfar on 15/6/22.
 */

public class BigArray {
    public int BigArraySearch(int[] Huge, int[] smallStack, int value){
        int p = Huge[value];
        if(p > 0 && p <= smallStack[0] && smallStack[p] == value)
            return p;
        return 0;
    }

    public int BigArrayInsert(int[] Huge, int[] smallStack, int value){
        int ret = value;
        if(ret == BigArraySearch(Huge, smallStack, value)){
            System.out.println("already in");
            return 0;
        }

        smallStack[0]++;
        smallStack[smallStack[0]] = ret;
        Huge[ret] = smallStack[0];
        return smallStack[0];
    }

    public int BigArrayDelete(int[] Huge, int[] smallStack, int value){
        int ret = BigArraySearch(Huge, smallStack, value);
        if(ret == 0){
            System.out.println("already in");
            return 0;
        }
        int v = smallStack[smallStack[0]];
        Huge[v] = ret;
        smallStack[ret] = v;
        smallStack[0]--;
        return ret;
    }

    public void BigArrayPrint(int[] smallStack){
        int i;
        for(i = 1;i <= smallStack[0]; i++)
            System.out.println(smallStack[i]);
    }

    public static void main(String[] args) {
        int x = 15;
        int y = 20;
        int z = 25;
        int[] Huge = new int[10000];
        int[] smallStack = new int[1000];
        BigArray ba = new BigArray();

        ba.BigArrayInsert(Huge, smallStack, x);
        ba.BigArrayInsert(Huge, smallStack, y);
        ba.BigArrayDelete(Huge, smallStack, x);
        //ba.BigArrayInsert(Hash, Stack, z);
        ba.BigArrayPrint(smallStack);


    }









}
