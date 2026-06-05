package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f1 {
    public static e1 a(Object obj) {
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        if (e1Var != e1.f918f) {
            return e1Var;
        }
        e1 e1Var2 = new e1(0, new int[8], new Object[8], true);
        wVar.unknownFields = e1Var2;
        return e1Var2;
    }

    public static boolean b(int i10, k kVar, Object obj) throws com.google.crypto.tink.shaded.protobuf.b0, a0 {
        int i11 = kVar.f954b;
        j jVar = (j) kVar.f957e;
        int i12 = i11 >>> 3;
        int i13 = i11 & 7;
        if (i13 == 0) {
            kVar.V(0);
            ((e1) obj).c(i12 << 3, Long.valueOf(jVar.A()));
            return true;
        }
        if (i13 == 1) {
            kVar.V(1);
            ((e1) obj).c((i12 << 3) | 1, Long.valueOf(jVar.x()));
            return true;
        }
        if (i13 == 2) {
            ((e1) obj).c((i12 << 3) | 2, kVar.n());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw a0.b();
            }
            kVar.V(5);
            ((e1) obj).c(5 | (i12 << 3), Integer.valueOf(jVar.w()));
            return true;
        }
        e1 e1Var = new e1(0, new int[8], new Object[8], true);
        int i14 = i12 << 3;
        int i15 = i14 | 4;
        int i16 = i10 + 1;
        if (i16 >= 100) {
            throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.e() != Integer.MAX_VALUE && b(i16, kVar, e1Var)) {
        }
        if (i15 != kVar.f954b) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
        if (e1Var.f923e) {
            e1Var.f923e = false;
        }
        ((e1) obj).c(i14 | 3, e1Var);
        return true;
    }
}
