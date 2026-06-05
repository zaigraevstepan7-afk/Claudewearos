package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 {
    public static x a(long j, Object obj) {
        x xVar = (x) k1.f960c.h(j, obj);
        if (((b) xVar).f895a) {
            return xVar;
        }
        v0 v0Var = (v0) xVar;
        int i10 = v0Var.f1030c;
        v0 v0VarI = v0Var.i(i10 == 0 ? 10 : i10 * 2);
        k1.o(obj, j, v0VarI);
        return v0VarI;
    }
}
