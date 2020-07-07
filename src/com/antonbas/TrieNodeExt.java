package com.antonbas;

import java.util.HashMap;

public class TrieNodeExt {
    private final String letter;
    private final HashMap<String, TrieNodeExt> children;
    private final boolean isEndOfWord;
    private final int MAX_CHAR = 26;

    public TrieNodeExt(String letter, HashMap<String, TrieNodeExt> children, boolean isEndOfWord) {
        this.letter = letter;
        this.children = children;
        this.isEndOfWord = isEndOfWord;
    }

    public String getLetter() {
        return letter;
    }

    public HashMap<String, TrieNodeExt> getChildren() {
        return children;
    }

    public boolean getIsEndOfWord() {
        return isEndOfWord;
    }

    public TrieNodeExt insert(String key, boolean isEndOfWord) {
        if (!children.containsKey(key)) {
            TrieNodeExt node = new TrieNodeExt(key, new HashMap<>(), isEndOfWord);
            children.put(key, node);
            return node;
        }
        return children.get(key);
    }

    public TrieNodeExt search(String key) {
        return children.getOrDefault(key, null);
    }

}
