package q;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class r {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final r.b lock;
    private final r.c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public r(int i10) {
        this.maxSize = i10;
        if (i10 <= 0) {
            r.a.c("maxSize <= 0");
            throw null;
        }
        this.map = new r.c();
        this.lock = new r.b();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        fj.l.f(str, "message");
        throw new IllegalStateException(str);
    }

    public Object create(Object obj) {
        fj.l.f(obj, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    public void entryRemoved(boolean z2, Object obj, Object obj2, Object obj3) {
        fj.l.f(obj, "key");
        fj.l.f(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    public final Object get(Object obj) {
        Object objPut;
        fj.l.f(obj, "key");
        synchronized (this.lock) {
            r.c cVar = this.map;
            cVar.getClass();
            Object obj2 = cVar.f13651a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objPut = this.map.f13651a.put(obj, objCreate);
                    if (objPut != null) {
                        this.map.f13651a.put(obj, objPut);
                    } else {
                        this.size += a(obj, objCreate);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objPut != null) {
                entryRemoved(false, obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        fj.l.f(obj, "key");
        fj.l.f(obj2, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            objPut = this.map.f13651a.put(obj, obj2);
            if (objPut != null) {
                this.size -= a(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, obj, objPut, obj2);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        fj.l.f(obj, "key");
        synchronized (this.lock) {
            r.c cVar = this.map;
            cVar.getClass();
            objRemove = cVar.f13651a.remove(obj);
            if (objRemove != null) {
                this.size -= a(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i10) {
        if (!(i10 > 0)) {
            r.a.c("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i10;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(Object obj, Object obj2) {
        fj.l.f(obj, "key");
        fj.l.f(obj2, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set setEntrySet = this.map.f13651a.entrySet();
            fj.l.e(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = this.map.f13651a.entrySet();
            fj.l.e(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            r.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L8f
            r.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f13651a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L19
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L8f
            goto L19
        L16:
            r7 = move-exception
            goto L97
        L19:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 <= r7) goto L8d
            r.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f13651a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L28
            goto L8d
        L28:
            r.c r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.f13651a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "<get-entries>(...)"
            fj.l.e(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L16
            r3 = 0
            if (r2 == 0) goto L4c
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L46
        L44:
            r1 = r3
            goto L5b
        L46:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L16
            goto L5b
        L4c:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L57
            goto L44
        L57:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L16
        L5b:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L61
            monitor-exit(r0)
            return
        L61:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            r.c r4 = r6.map     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = "key"
            fj.l.f(r2, r5)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r4 = r4.f13651a     // Catch: java.lang.Throwable -> L16
            r4.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r4 = r6.size     // Catch: java.lang.Throwable -> L16
            int r5 = r6.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L16
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r6.entryRemoved(r5, r2, r1, r3)
            goto L0
        L8d:
            monitor-exit(r0)
            return
        L8f:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L97:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q.r.trimToSize(int):void");
    }
}
