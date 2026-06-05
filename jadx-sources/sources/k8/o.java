package k8;

import kk.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final kk.k f9486b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9488d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9489e;

    /* renamed from: f, reason: collision with root package name */
    public kk.h f9490f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9485a = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9487c = new Object();

    public o(kk.t tVar, kk.k kVar) {
        this.f9489e = tVar;
        this.f9486b = kVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f9485a) {
            case 0:
                synchronized (this.f9487c) {
                    this.f9488d = true;
                    x xVar = (x) this.f9490f;
                    if (xVar != null) {
                        try {
                            xVar.close();
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused) {
                        }
                    }
                }
                return;
            default:
                synchronized (this.f9487c) {
                    this.f9488d = true;
                    try {
                        this.f9490f.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused2) {
                    }
                }
                return;
        }
    }

    public o(kk.h hVar, kk.k kVar, cg.b bVar) {
        this.f9486b = kVar;
        this.f9489e = bVar;
        this.f9490f = hVar;
    }
}
