package p5;

import fj.l;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.k;
import pi.h;
import qi.m;
import qi.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12797a;

    /* renamed from: b, reason: collision with root package name */
    public final k f12798b;

    public a(LinkedHashMap linkedHashMap, boolean z2) {
        this.f12797a = linkedHashMap;
        this.f12798b = new k(z2);
    }

    public final Map a() {
        h hVar;
        Set<Map.Entry> setEntrySet = this.f12797a.entrySet();
        int iG0 = v.g0(m.s0(setEntrySet));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                l.e(bArrCopyOf, "copyOf(...)");
                hVar = new h(key, bArrCopyOf);
            } else {
                hVar = new h(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(hVar.f13000a, hVar.f13001b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        l.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f12798b.f12813b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(b bVar, Object obj) {
        b();
        LinkedHashMap linkedHashMap = this.f12797a;
        if (obj == null) {
            b();
            linkedHashMap.remove(bVar);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(qi.l.V0((Set) obj));
            l.e(setUnmodifiableSet, "unmodifiableSet(...)");
            linkedHashMap.put(bVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(bVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            l.e(bArrCopyOf, "copyOf(...)");
            linkedHashMap.put(bVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p5.a
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            p5.a r7 = (p5.a) r7
            java.util.LinkedHashMap r7 = r7.f12797a
            java.util.LinkedHashMap r0 = r6.f12797a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = fj.l.b(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.f12797a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return qi.l.E0(this.f12797a.entrySet(), ",\n", "{\n", "\n}", new la.a(24), 24);
    }

    public /* synthetic */ a(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
