public class GList<T> {
    private GNode<T> head = null;
    private GNode<T> cursor = null;
    public void add(T val){
        startTraverse();
        if(cursor == null){
            cursor = new GNode<>(val);
        }
        else{

            add(val);
        }
    }
    public void startTraverse() {
        if(head != null){
            cursor = head;
        }
        else cursor = null;
    }
    public T getData(){
        return cursor.data;
    }
    private class GNode<T> {
        private T data;
        private GNode<T> next;

        private GNode(T data) {
            this.data = data;
        }
        /*public void add (T val){
            if(cursor.hasNext()){
                cursor.getNext();
                add(val);
            }
            if(!cursor.hasNext()){
                this.data = val;
            }
        }*/


        public boolean hasNext() {
            if (cursor.next != null) {
                return true;
            } else return false;
        }

        public T getNext() {
            T retval = (T) cursor.data;
            cursor = cursor.next;
            return retval;
        }
    }
}