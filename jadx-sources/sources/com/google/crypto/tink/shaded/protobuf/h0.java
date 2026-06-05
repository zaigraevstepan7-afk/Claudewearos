package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h0 extends i0 {
    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final void a(long j, Object obj) {
        ((b) ((z) n1.f4203c.i(j, obj))).f4139a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final void b(Object obj, long j, Object obj2) {
        m1 m1Var = n1.f4203c;
        z zVarF = (z) m1Var.i(j, obj);
        z zVar = (z) m1Var.i(j, obj2);
        int size = zVarF.size();
        int size2 = zVar.size();
        if (size > 0 && size2 > 0) {
            if (!((b) zVarF).f4139a) {
                zVarF = zVarF.f(size2 + size);
            }
            zVarF.addAll(zVar);
        }
        if (size > 0) {
            zVar = zVarF;
        }
        n1.p(obj, j, zVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final List c(long j, Object obj) {
        z zVar = (z) n1.f4203c.i(j, obj);
        if (((b) zVar).f4139a) {
            return zVar;
        }
        int size = zVar.size();
        z zVarF = zVar.f(size == 0 ? 10 : size * 2);
        n1.p(obj, j, zVarF);
        return zVarF;
    }
}
