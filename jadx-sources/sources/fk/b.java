package fk;

import kk.b0;
import kk.e0;
import kk.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f6812a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f6814c;

    public b(g gVar) {
        this.f6814c = gVar;
        this.f6812a = new m(((kk.g) gVar.f6830f).a());
    }

    @Override // kk.b0
    public final void Y(long j, kk.f fVar) {
        kk.g gVar = (kk.g) this.f6814c.f6830f;
        if (this.f6813b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        gVar.L(j);
        gVar.G("\r\n");
        gVar.Y(j, fVar);
        gVar.G("\r\n");
    }

    @Override // kk.b0
    public final e0 a() {
        return this.f6812a;
    }

    @Override // kk.b0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f6813b) {
            return;
        }
        this.f6813b = true;
        ((kk.g) this.f6814c.f6830f).G("0\r\n\r\n");
        m mVar = this.f6812a;
        e0 e0Var = mVar.f9710e;
        mVar.f9710e = e0.f9690d;
        e0Var.a();
        e0Var.b();
        this.f6814c.f6825a = 3;
    }

    @Override // kk.b0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f6813b) {
            return;
        }
        ((kk.g) this.f6814c.f6830f).flush();
    }
}
