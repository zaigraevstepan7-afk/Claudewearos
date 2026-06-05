package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f1 {
    public static e1 a(Object obj) {
        w wVar = (w) obj;
        e1 e1Var = wVar.unknownFields;
        if (e1Var != e1.f4158f) {
            return e1Var;
        }
        e1 e1VarC = e1.c();
        wVar.unknownFields = e1VarC;
        return e1VarC;
    }

    public static boolean b(Object obj, androidx.datastore.preferences.protobuf.k kVar) throws androidx.datastore.preferences.protobuf.z, c0 {
        int i10 = kVar.f954b;
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) kVar.f957e;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            kVar.V(0);
            ((e1) obj).d(i11 << 3, Long.valueOf(jVar.A()));
            return true;
        }
        if (i12 == 1) {
            kVar.V(1);
            ((e1) obj).d((i11 << 3) | 1, Long.valueOf(jVar.x()));
            return true;
        }
        if (i12 == 2) {
            ((e1) obj).d((i11 << 3) | 2, kVar.o());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw c0.c();
            }
            kVar.V(5);
            ((e1) obj).d((i11 << 3) | 5, Integer.valueOf(jVar.w()));
            return true;
        }
        e1 e1VarC = e1.c();
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        while (kVar.e() != Integer.MAX_VALUE && b(e1VarC, kVar)) {
        }
        if (i14 != kVar.f954b) {
            throw new c0("Protocol message end-group tag did not match expected tag.");
        }
        e1VarC.f4163e = false;
        ((e1) obj).d(i13 | 3, e1VarC);
        return true;
    }
}
