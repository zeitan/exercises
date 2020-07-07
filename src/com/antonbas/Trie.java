package com.antonbas;


public class Trie {
    String key;
    Trie[] character = null;

    // Constructor
    Trie()
    {
        // Trie supports lowercase English characters (a - z)
        // so character size is 26
        character = new Trie[26];
    }

    public  void insert(Trie head, String str)
    {
        // start from root node
        Trie curr = head;
        for (int i = 0; i < str.length(); i++)
        {
            // create a new node if path doesn't exists
            if (curr.character[str.charAt(i) - 'a'] == null) {
                curr.character[str.charAt(i) - 'a'] = new Trie();
            }
            // go to next node
            curr = curr.character[str.charAt(i) - 'a'];
        }

        // store key in leaf node
        curr.key = str;
    }


    public Trie search(String key) {
        return character[key.charAt(0) - 'a'];
    }

}
