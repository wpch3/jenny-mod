package com.trolmastercard.sexmod.d;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class a<K, V> {
    private final HashMap<K, V> a = new HashMap<>();
    private final HashMap<V, K> b = new HashMap<>();

    public void a(K var1, V var2) {
        Object var3 = this.a.put((K)var1, (V)var2);
        this.b.remove(var3);
        this.b.put((V)var2, (K)var1);
    }

    public V a(K var1) {
        return this.a.get(var1);
    }

    public K b(V var1) {
        return this.b.get(var1);
    }

    public void c(K var1) {
        Object var2 = this.a.get(var1);
        if (var2 != null) {
            this.a.remove(var1);
            this.b.remove(var2);
        }
    }

    public Set<Entry<K, V>> a() {
        return this.a.entrySet();
    }
}
