package xj;

import qj.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final e f20096d;

    static {
        int i10 = k.f20104c;
        int i11 = k.f20105d;
        long j = k.f20106e;
        String str = k.f20102a;
        e eVar = new e();
        eVar.f20098c = new c(i10, i11, j, str);
        f20096d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // qj.v
    public final v h0(int i10) {
        vj.b.a(i10);
        return i10 >= k.f20104c ? this : super.h0(i10);
    }

    @Override // qj.v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
