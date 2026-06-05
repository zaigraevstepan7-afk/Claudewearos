package ak;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final r f726a;

    /* renamed from: b, reason: collision with root package name */
    public dk.k f727b;

    /* renamed from: c, reason: collision with root package name */
    public final w f728c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f729d;

    public u(r rVar, w wVar) {
        this.f726a = rVar;
        this.f728c = wVar;
    }

    public final z a() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f726a;
        arrayList.addAll(rVar.f712d);
        arrayList.add(new ek.a(rVar, 1));
        arrayList.add(new ek.a(rVar.A, 0));
        arrayList.add(new ck.a(0));
        arrayList.add(new ck.a(1));
        arrayList.addAll(rVar.f713e);
        arrayList.add(new ck.a(2));
        dk.k kVar = this.f727b;
        int i10 = rVar.O;
        int i11 = rVar.P;
        int i12 = rVar.Q;
        w wVar = this.f728c;
        try {
            try {
                z zVarA = new ek.e(arrayList, kVar, null, 0, wVar, this, i10, i11, i12).a(wVar);
                if (this.f727b.d()) {
                    bk.d.c(zVarA);
                    throw new IOException("Canceled");
                }
                this.f727b.f(null);
                return zVarA;
            } catch (IOException e10) {
                throw this.f727b.f(e10);
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                this.f727b.f(null);
            }
            throw th2;
        }
    }

    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f727b.d() ? "canceled " : "");
        sb2.append("call");
        sb2.append(" to ");
        sb2.append(this.f728c.f735a.k());
        return sb2.toString();
    }

    public final Object clone() {
        r rVar = this.f726a;
        u uVar = new u(rVar, this.f728c);
        uVar.f727b = new dk.k(rVar, uVar);
        return uVar;
    }
}
