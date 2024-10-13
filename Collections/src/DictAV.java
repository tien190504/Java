import java.util.*;
public class DictAV <K, V> {
    private Word List[] = new Word[100];
    private static int index = 0;
    public DictAV() {
        super();
    }

    public DictAV(Word<K, V>[] list) {
        List = list;
    }
    
    public void addWord(Word<K, V> w) {
        List[index] = w;
        index++;
    }

    public V findWord(K key) {
        for(int i = 0; i < index; i++) {
            if(List[i].checkKey(key)) { 
                return List[i].getValue();
            }
        }
        return null;
    }
}
