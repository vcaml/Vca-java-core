package com.example.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式的经典例子：
 * 在某些应用中，需要频繁地操作字符对象，例如在文本编辑器中对字符进行插入、删除、替换等操作。
 * 在这种情况下，每次都创建新的字符对象会导致内存消耗较大，而且频繁的创建和销毁字符对象也会降低性能。
 * 享元模式可以通过共享已经创建的字符对象来解决这个问题。具体实现时，可以使用一个字符缓存池来存储已经创建的字符对象。
 * 当需要操作字符时，首先检查字符缓存池中是否已经存在该字符对象，如果存在则直接使用，如果不存在则创建新的字符对象并将其加入缓存池，以便后续复用。
 * 下面是一个简单的示例代码，展示了如何使用享元模式来实现字符缓存池：
 * */
public class CharacterPool {
    private Map<Character, Character> pool;

    public CharacterPool() {
        pool = new HashMap<>();
    }

    public Character getCharacter(char c) {
        if (pool.containsKey(c)) {
            return pool.get(c);
        } else {
            Character character = new Character(c);
            pool.put(c, character);
            return character;
        }
    }
}

//    CharacterPool characterPool = new CharacterPool();
//    Character a = characterPool.getCharacter('a');
//    Character b = characterPool.getCharacter('b');
//    Character c = characterPool.getCharacter('c');
