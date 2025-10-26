public class Stack {
    int size=1000;
    int arr[]=new int[size];
    int top=-1;
    void push(int x){
        top++;
        arr[top]=x;
    }
    void pop(){
        int x=arr[top];
        top--;
        return x;
    }
    int peek(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
    public static void main(String args[]){
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
