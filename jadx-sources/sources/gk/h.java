package gk;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7470c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, Object[] objArr, int i10, int i11) {
        super("OkHttp %s stream %d", objArr);
        this.f7472e = qVar;
        this.f7470c = i10;
        this.f7471d = i11;
    }

    @Override // bk.a
    public final void b() throws IOException {
        q qVar = this.f7472e;
        try {
            qVar.M.t(this.f7470c, this.f7471d);
        } catch (IOException e10) {
            qVar.b(2, 2, e10);
        }
    }
}
