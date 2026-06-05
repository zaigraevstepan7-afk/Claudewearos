package fk;

import java.io.IOException;
import kk.c0;
import kk.e0;
import kk.h;
import kk.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f6809a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f6811c;

    public a(g gVar) {
        this.f6811c = gVar;
        this.f6809a = new m(((h) gVar.f6829e).a());
    }

    @Override // kk.c0
    public long A(long j, kk.f fVar) throws IOException {
        g gVar = this.f6811c;
        try {
            return ((h) gVar.f6829e).A(j, fVar);
        } catch (IOException e10) {
            ((dk.e) gVar.f6828d).h();
            b();
            throw e10;
        }
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f6809a;
    }

    public final void b() {
        g gVar = this.f6811c;
        int i10 = gVar.f6825a;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + gVar.f6825a);
        }
        m mVar = this.f6809a;
        e0 e0Var = mVar.f9710e;
        mVar.f9710e = e0.f9690d;
        e0Var.a();
        e0Var.b();
        gVar.f6825a = 6;
    }
}
