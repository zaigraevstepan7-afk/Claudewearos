package gk;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends bk.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7476c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Object[] objArr) {
        super("OkHttp %s ping", objArr);
        this.f7477d = qVar;
    }

    @Override // bk.a
    public final void b() throws IOException {
        switch (this.f7476c) {
            case 0:
                q qVar = (q) this.f7477d;
                qVar.getClass();
                try {
                    qVar.M.s(2, 0, false);
                    break;
                } catch (IOException e10) {
                    qVar.b(2, 2, e10);
                    return;
                }
            default:
                q qVar2 = (q) ((p) this.f7477d).f7491d;
                qVar2.f7494b.a(qVar2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, Object[] objArr) {
        super("OkHttp %s settings", objArr);
        this.f7477d = pVar;
    }
}
