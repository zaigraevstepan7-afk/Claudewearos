package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f4167c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, int i10, long j) {
        List list = (List) n1.f4203c.i(j, obj);
        if (list.isEmpty()) {
            List e0Var = list instanceof f0 ? new e0(i10) : ((list instanceof x0) && (list instanceof z)) ? ((z) list).f(i10) : new ArrayList(i10);
            n1.p(obj, j, e0Var);
            return e0Var;
        }
        if (f4167c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            n1.p(obj, j, arrayList);
            return arrayList;
        }
        if (list instanceof i1) {
            e0 e0Var2 = new e0(list.size() + i10);
            e0Var2.addAll((i1) list);
            n1.p(obj, j, e0Var2);
            return e0Var2;
        }
        if ((list instanceof x0) && (list instanceof z)) {
            z zVar = (z) list;
            if (!((b) zVar).f4139a) {
                z zVarF = zVar.f(list.size() + i10);
                n1.p(obj, j, zVarF);
                return zVarF;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) n1.f4203c.i(j, obj);
        if (list instanceof f0) {
            objUnmodifiableList = ((f0) list).p();
        } else {
            if (f4167c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof x0) && (list instanceof z)) {
                b bVar = (b) ((z) list);
                if (bVar.f4139a) {
                    bVar.f4139a = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        n1.p(obj, j, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final void b(Object obj, long j, Object obj2) {
        List list = (List) n1.f4203c.i(j, obj2);
        List listD = d(obj, list.size(), j);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        n1.p(obj, j, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final List c(long j, Object obj) {
        return d(obj, 10, j);
    }
}
