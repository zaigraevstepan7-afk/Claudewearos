package gk;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f7475e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, Object[] objArr, int i10, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f7475e = qVar;
        this.f7473c = i10;
        this.f7474d = j;
    }

    @Override // bk.a
    public final void b() throws IOException {
        q qVar = this.f7475e;
        try {
            qVar.M.C(this.f7473c, this.f7474d);
        } catch (IOException e10) {
            qVar.b(2, 2, e10);
        }
    }
}
