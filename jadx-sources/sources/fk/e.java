package fk;

import kk.b0;
import kk.e0;
import kk.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f6821a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f6823c;

    public e(g gVar) {
        this.f6823c = gVar;
        this.f6821a = new m(((kk.g) gVar.f6830f).a());
    }

    @Override // kk.b0
    public final void Y(long j, kk.f fVar) {
        if (this.f6822b) {
            throw new IllegalStateException("closed");
        }
        long j4 = fVar.f9695b;
        byte[] bArr = bk.d.f1785a;
        if (j < 0 || 0 > j4 || j4 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ((kk.g) this.f6823c.f6830f).Y(j, fVar);
    }

    @Override // kk.b0
    public final e0 a() {
        return this.f6821a;
    }

    @Override // kk.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6822b) {
            return;
        }
        this.f6822b = true;
        m mVar = this.f6821a;
        e0 e0Var = mVar.f9710e;
        mVar.f9710e = e0.f9690d;
        e0Var.a();
        e0Var.b();
        this.f6823c.f6825a = 3;
    }

    @Override // kk.b0, java.io.Flushable
    public final void flush() {
        if (this.f6822b) {
            return;
        }
        ((kk.g) this.f6823c.f6830f).flush();
    }
}
