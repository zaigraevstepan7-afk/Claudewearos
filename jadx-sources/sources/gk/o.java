package gk;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7486c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7487d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f7489f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, int i10, int i11) {
        super("OkHttp %s ping %08x%08x", new Object[]{qVar.f7496d, Integer.valueOf(i10), Integer.valueOf(i11)});
        this.f7489f = qVar;
        this.f7486c = true;
        this.f7487d = i10;
        this.f7488e = i11;
    }

    @Override // bk.a
    public final void b() throws IOException {
        q qVar = this.f7489f;
        boolean z2 = this.f7486c;
        try {
            qVar.M.s(this.f7487d, this.f7488e, z2);
        } catch (IOException e10) {
            qVar.b(2, 2, e10);
        }
    }
}
