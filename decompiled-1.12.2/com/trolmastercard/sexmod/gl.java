package com.trolmastercard.sexmod;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class gl<K, V> {
    private final HashMap<K, V> b = new HashMap<>();
    private final HashMap<V, K> a = new HashMap<>();

    public void a(K var1, V var2) {
        Object var3 = this.b.put((K)var1, (V)var2);
        this.a.remove(var3);
        this.a.put((V)var2, (K)var1);
    }

    public V c(K var1) {
        return this.b.get(var1);
    }

    public K b(V var1) {
        return this.a.get(var1);
    }

    public int e() {
        return this.b.size();
    }

    public void a(K var1) {
        Object var2 = this.b.get(var1);

        try {
            if (var2 != null) {
                this.b.remove(var1);
                this.a.remove(var2);
            }
        } catch (RuntimeException var3) {
            throw a(var3);
        }
    }

    public Set<Entry<K, V>> c() {
        return this.b.entrySet();
    }

    public Set<K> a() {
        return this.b.keySet();
    }

    public Set<V> d() {
        return this.a.keySet();
    }

    public void b() {
        this.a.clear();
        this.b.clear();
    }

    private static RuntimeException a(RuntimeException var0) {
        return var0;
    }
}
