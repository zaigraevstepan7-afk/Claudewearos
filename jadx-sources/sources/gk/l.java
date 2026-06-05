package gk;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk.f f7482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f7484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, Object[] objArr, int i10, kk.f fVar, int i11, boolean z2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f7484f = qVar;
        this.f7481c = i10;
        this.f7482d = fVar;
        this.f7483e = i11;
    }

    @Override // bk.a
    public final void b() {
        try {
            a0 a0Var = this.f7484f.C;
            kk.f fVar = this.f7482d;
            int i10 = this.f7483e;
            a0Var.getClass();
            fVar.skip(i10);
            this.f7484f.M.t(this.f7481c, 6);
            synchronized (this.f7484f) {
                this.f7484f.O.remove(Integer.valueOf(this.f7481c));
            }
        } catch (IOException unused) {
        }
    }
}
