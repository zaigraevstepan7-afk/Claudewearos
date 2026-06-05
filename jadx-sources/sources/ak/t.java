package ak;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final mh.g f723c;

    /* renamed from: d, reason: collision with root package name */
    public volatile AtomicInteger f724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, mh.g gVar) {
        super("OkHttp %s", new Object[]{uVar.f728c.f735a.k()});
        this.f725e = uVar;
        this.f724d = new AtomicInteger(0);
        this.f723c = gVar;
    }

    @Override // bk.a
    public final void b() {
        mh.g gVar = this.f723c;
        u uVar = this.f725e;
        r rVar = uVar.f726a;
        uVar.f727b.f5205e.h();
        boolean z2 = false;
        try {
            try {
                try {
                    gVar.w(uVar.a());
                } catch (IOException e10) {
                    e = e10;
                    z2 = true;
                    if (z2) {
                        hk.j.f8044a.m(4, "Callback failure for " + uVar.b(), e);
                    } else {
                        gVar.v(e);
                    }
                    rVar.f709a.w(this);
                } catch (Throwable th2) {
                    th = th2;
                    z2 = true;
                    uVar.f727b.a();
                    if (!z2) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.addSuppressed(th);
                        gVar.v(iOException);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                rVar.f709a.w(this);
                throw th3;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
        }
        rVar.f709a.w(this);
    }
}
