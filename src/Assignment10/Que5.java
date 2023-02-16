package Assignment10;

class Addition{
    public void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public void add(int a,int b,int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
}

class Varargs_Addition{
    public int sum(int ...arr){
        int result =0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
}
public class Que5 {
    public static void main(String[] args){
        Addition addition = new Addition();
        addition.add(2,3);
        addition.add(3,6,7);
        Varargs_Addition vargs = new Varargs_Addition();
        System.out.println(vargs.sum(1,2,3));
        System.out.println(vargs.sum(1,2,3,4,6,8));

    }


}
